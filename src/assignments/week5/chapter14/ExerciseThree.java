package assignments.week5.chapter14;

/*
--Exercise 3--
Write a method called copyStack that accepts a stack of integers as a parameter and returns a copy of the original
stack (i.e., a new stack with the same values as the original, stored in the same order as the original).
Your method should create the new stack and fill it up with the same values that are stored in the original stack.
When your method is done executing, the original stack must be restored to its original state.

Use one queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseThree {
    public static void main(String[] args) {
        int[] tmp = {3, 7, 1, 14, 9};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        Stack<Integer> newStack = copyStack(stack);
        System.out.println(stack);
        System.out.println(newStack);
    }

    public static Stack<Integer> copyStack(Stack<Integer> stack) {
        Stack<Integer> copyStack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            copyStack.push(stack.pop());
        }

        while (!copyStack.isEmpty()) {
            int num = copyStack.pop();
            queue.add(num);
            stack.push(num);
        }
        while (!queue.isEmpty()) {
            copyStack.push(queue.remove());
        }
        return copyStack;
    }
}
