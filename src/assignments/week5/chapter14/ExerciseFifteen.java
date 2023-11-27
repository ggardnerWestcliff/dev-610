package assignments.week5.chapter14;

/*
--Exercise 15--
Write a method called isSorted that accepts a stack of integers as a parameter and returns true if the elements in the
stack occur in ascending (nondecreasing) order from top to bottom. That is, the smallest element should be on top,
growing larger toward the bottom. For example, if the stack stores [20, 20, 17, 11, 8, 8, 3, 2], your method should
return true. An empty or one-element stack is considered to be sorted. Your method must restore the parameter stack to
its original state before returning.

Use one queue or stack (but not both) as auxiliary storage.
*/

import java.util.Stack;

public class ExerciseFifteen {
    public static void main(String[] args) {
        int[] tmp = {20, 20, 17, 11, 8, 8, 3, 2};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        System.out.println(isSorted(stack));
    }

    public static boolean isSorted(Stack<Integer> stack) {
        Stack<Integer> storage = new Stack<>();
        boolean sorted = true;

        while (sorted && stack.size() > 1) {
            storage.push(stack.pop());
            if (storage.peek() > stack.peek()) {
                sorted = false;
            }
        }
        while (!storage.isEmpty()) {
            stack.push(storage.pop());
        }
        return sorted;
    }
}
