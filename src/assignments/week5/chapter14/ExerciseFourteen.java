package assignments.week5.chapter14;

/*
--Exercise 14--
Write a method called reverseFirstK that accepts an integer k and a queue of integers as parameters and reverses the
order of the first k elements of the queue, leaving the other elements in the same relative order.

For example, if a queue named q stores [10, 20, 30, 40, 50, 60, 70, 80, 90], the call of reverseFirstK(4, q);
should change the queue to store [40, 30, 20, 10, 50, 60, 70, 80, 90].

If k is 0 or negative, no change should be made. If the queue does not contain at least k elements, your method should
throw an IllegalArgumentException.

Use one queue or stack (but not both) as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseFourteen {
    public static void main(String[] args) {
        int[] tmp = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        Queue<Integer> queue = new LinkedList<>();
        for (int i : tmp) {
            queue.add(i);
        }
        reverseFirstK(4, queue);
        System.out.println(queue);
    }

    public static void reverseFirstK(int k, Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        if (queue == null) {
            throw new IllegalArgumentException("The supplied Queue cannot be null.");
        }
        if (queue.size() < k) {
            throw new IllegalArgumentException("The supplied Queue does not contain at least k elements.");
        }
        if (k > 0) {
            for (int i = k; i > 0; i--) {
                stack.push(queue.remove());
            }
            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
            int moves = queue.size() - k;
            while (moves > 0) {
                queue.add(queue.remove());
                moves--;
            }
        }
    }
}
