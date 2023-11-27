package assignments.week5.chapter14;

/*
--Exercise 17--
Write a method called compressDuplicates that accepts a stack of integers as a parameter and that replaces each
sequence of duplicates with a pair of values: a count of the number of duplicates, followed by the actual duplicated
number. For example, if the stack stores [2, 2, 2, 2, 2, −4, −4, −4, 82, 6, 6, 6, 6, 17, 17],
your method should change it to store [5, 2, 3, −4, 1, 82, 4, 6, 2, 17]. This new stack indicates that the original
had 5 occurrences of 2 at the bottom of the stack followed by 3 occurrences of −4 followed by 1 occurrence of 82,
and so on. If the stack is empty, your method should not change it.

Use one queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        int[] tmp = {2, 2, 2, 2, 2, -4, -4, -4, 82, 6, 6, 6, 6, 17, 17};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        compressDuplicates(stack);
        System.out.println(stack);
    }

    public static void compressDuplicates(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        if (stack.isEmpty()) {
            return;
        }
        int num = stack.pop();

        while (!stack.isEmpty()) {
            if (stack.peek() == num) {
                count++;
            } else {
                queue.add(num);
                queue.add(count);
                count = 1;
            }
            num = stack.pop();
        }

        queue.add(num);
        queue.add(count);

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }
}
