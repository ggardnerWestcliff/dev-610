package assignments.week5.chapter14;

/*
--Exercise 21--
Write a method called maxToTop that takes a stack of integers as a parameter and moves the largest value in the stack
to the top of the stack, leaving all other values in their original order. You may assume that the stack does not
contain any duplicates. For example, if a stack s stores [27, 5, 42, -11, 0, 19], the call of maxToTop(s) should
change it to store [27, 5, -11, 0, 19, 42]. If the stack is empty, your method should not change it.

Use one queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        int[] tmp = {27, 5, 42, -11, 0, 19};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        maxToTop(stack);
        System.out.println(stack);
    }


    public static void maxToTop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        int maxValue = stack.peek();
        while (!stack.isEmpty()) {
            int num = stack.pop();
            queue.add(num);
            maxValue = Math.max(maxValue, num);
        }
        while (!queue.isEmpty()) {
            int num = queue.remove();
            if (num != maxValue) {
                stack.push(num);
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        stack.push(maxValue);

    }

}
