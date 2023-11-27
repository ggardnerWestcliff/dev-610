package assignments.week5.chapter14;

/*
--Exercise 16--
Write a method called mirror that accepts a stack of integers as a parameter and replaces the stack contents with
itself plus a mirrored version of itself (the same elements in the opposite order).

For example, if the stack stores [10, 53, 19, 24], your method should change it to store
[10, 53, 19, 24, 24, 19, 53, 10]. If passed an empty stack, your result should be an empty stack.

Use one stack or one queue (but not both) as auxiliary storage to solve this problem.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseSixteen {
    public static void main(String[] args) {
        int[] tmp = {10, 53, 19, 24};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        mirror(stack);
        System.out.println(stack);
    }


    public static void mirror(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) {
            int num = queue.remove();
            queue.add(num);
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < queueSize; i++) {
            queue.add(queue.remove());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }
}
