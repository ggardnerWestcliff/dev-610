package assignments.week5.chapter14;

/*
--Exercise 2--
Write a method called stutter that accepts a stack of integers as a parameter and replaces every value in the stack
with two occurrences of that value. Preserve the original relative order.
For example, if the stack stores [3, 7, 1, 14, 9], your method should change it to store
[3, 3, 7, 7, 1, 1, 14, 14, 9, 9].

Use a single queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseTwo {

    public static void main(String[] args) {
        int[] tmp = {3, 7, 1, 14, 9};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        stutter(stack);
        System.out.println(stack);
    }

    public static void stutter(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            int num = stack.pop();
            queue.add(num);
            queue.add(num);
        }
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
