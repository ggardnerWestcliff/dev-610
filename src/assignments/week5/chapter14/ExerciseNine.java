package assignments.week5.chapter14;

/*
--Exercise 9--
Write a method called switchPairs that accepts a stack of integers as a parameter and swaps neighboring pairs of
numbers starting at the bottom of the stack. For example, if the stack initially stores [1, 2, 8, 6, −1, 15, 7],
your method should swap the first pair (1, 2), the second pair (8, 6), the third pair (-1, 15), and so on.

If the stack contains an odd number of elements, the element at the top should remain unmodified.
So the final state of the stack would be [2, 1, 6, 8, 15, −1, 7].

Use one queue as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseNine {
    public static void main(String[] args) {
        int[] tmp = {1, 2, 8, 6, -1, 15, 7};
        Stack<Integer> stack = new Stack<>();
        for (int i : tmp) {
            stack.push(i);
        }
        switchPairs(stack);
        System.out.println(stack);
    }

    public static void switchPairs(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        if (stack.size() % 2 != 0) {
            queue.add(stack.pop());
        }
        while (!stack.isEmpty()) {
            int val1 = stack.pop();
            int val2 = stack.pop();
            queue.add(val2);
            queue.add(val1);
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
