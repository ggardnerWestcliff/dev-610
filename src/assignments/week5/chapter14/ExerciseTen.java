package assignments.week5.chapter14;

/*
--Exercise 10--
Write a method called isConsecutive that accepts a stack of integers as a parameter and that returns true if the stack
contains a sequence of consecutive integers starting from the bottom of the stack. Consecutive integers are integers
that come one after the other, as in 3, 4, 5, etc. If the stack stores [5, 6, 7, 8, 9, 10], your method should return
true. If the stack had instead contained [7, 8, 9, 10, 12], your method should return false because the numbers 10 and
12 are not consecutive. Notice that we look at the numbers starting at the bottom of the stack. Any stack with fewer
than two values should be considered to be a list of consecutive integers. Your method must restore the parameter stack
to its original state before returning.

Use one queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseTen {
    public static void main(String[] args) {
        int[] tmp = {5, 6, 7, 8, 9, 10};
        int[] tmp1 = {7, 8, 9, 10, 12};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        for (int i : tmp1) {
            stack1.push(i);
        }
        System.out.println(isConsecutive(stack));
        System.out.println(isConsecutive(stack1));
    }

    public static boolean isConsecutive(Stack<Integer> stack) {
        Queue<Integer> q = new LinkedList<>();
        boolean consecutive = true;

        if (stack.size() < 2) {
            return false;
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        stack.push(q.remove());
        while (!q.isEmpty()) {
            if (stack.peek() - 1 != q.peek()) {
                consecutive = false;
            }
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }
        return consecutive;
    }
}
