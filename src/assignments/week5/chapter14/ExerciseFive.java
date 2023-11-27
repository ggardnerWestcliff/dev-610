package assignments.week5.chapter14;

/*
--Exercise 5--
Write a method called equals that accepts two stacks of integers as parameters and returns true if the two stacks store
exactly the same sequence of integer values in the same order. Your method must restore the two stacks to their
original state before returning.

Use one stack as auxiliary storage.
*/

import java.util.Stack;

public class ExerciseFive {
    public static void main(String[] args) {
        int[] tmp = {7, 2, 8, 9, 4, 11, 7, 1, 42};
        int[] tmp1 = {7, 2, 8, 9, 4, 11, 7, 1, 41};
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        for (int i : tmp) {
            stack1.push(i);
            stack2.push(i);
        }
        for (int i: tmp1) {
            stack3.push(i);
        }
        System.out.println(equals(stack1, stack2));
        System.out.println(equals(stack1, stack3));

    }

    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> storage = new Stack<>();

        if (stack1.size() != stack2.size()) {
            return false;
        } else {
            boolean eq = true;

            while (eq && !stack1.isEmpty()) {
                int num1 = stack1.pop();
                int num2 = stack2.pop();
                if (num1 != num2) {
                    eq = false;
                }
                storage.add(num1);
                storage.add(num2);
            }

            while (!storage.isEmpty()) {
                stack2.push(storage.pop());
                stack1.push(storage.pop());
            }

            return eq;
        }
    }
}
