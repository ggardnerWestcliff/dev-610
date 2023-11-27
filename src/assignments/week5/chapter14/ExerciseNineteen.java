package assignments.week5.chapter14;

/*
--Exercise 19--
Write a method called removeMin that accepts a stack of integers as a parameter and removes and returns the smallest
value from the stack. For example, if the stack stores [2, 8, 3, 19, 2, 3, 2, 7, 12, −8, 4], your method should remove
and return −8, leaving the stack storing [2, 8, 3, 19, 2, 3, 2, 7, 12, 4]. If the minimum value appears more than once,
all occurrences of it should be removed. For example, given the same stack, if we again call removeMin on it, the
method would return 2 and leave the stack storing [8, 3, 19, 3, 7, 12, 4].

Use one queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseNineteen {
    public static void main(String[] args) {
        int[] tmp = {2, 8, 3, 19, 2, 3, 2, 7, 12, -8, 4};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        System.out.println(removeMin(stack));
        System.out.println(stack);
    }


    public static int removeMin(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        int minValue = stack.peek();
        while (!stack.isEmpty()) {
            int num = stack.pop();
            queue.add(num);
            minValue = Math.min(minValue, num);
        }
        while (!queue.isEmpty()) {
            int num = queue.remove();
            if (num != minValue) {
                stack.push(num);
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        return minValue;
    }
}
