package assignments.week5.chapter14;

/*
--Exercise 20--
Write a method called interleave that accepts a queue of integers as a parameter and rearranges the elements by
alternating the elements from the first half of the queue with those from the second half of the queue.

For example, if the queue stores [2, 8, −5, 19, 7, 3, 24, 42], your method should change it to store
[2, 7, 8, 3, −5, 24, 19, 42]. To understand the result, consider the two halves of this queue.
The first half is [2, 8, −5, 19] and the second half is [7, 3, 24, 42]. These are combined in an alternating fashion to
form a sequence of pairs: the first values from each half (2 and 7), then the second values from each half (8 and 3),
and so on. Your method should throw an IllegalArgumentException if the queue does not have an even size.

Use one stack as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseTwenty {
    public static void main(String[] args) {
        int[] tmp = {2, 8, -5, 19, 7, 3, 24, 42};
        Queue<Integer> queue = new LinkedList<>();
        for (int i : tmp) {
            queue.add(i);
        }
        interleave(queue);
        System.out.println(queue);
    }

    public static void interleave(Queue<Integer> queue) {
        if (queue.size() % 2 == 1) {
            throw new IllegalArgumentException("Supplied Queue must have an even size.");
        }
        Stack<Integer> stack = new Stack<>();
        int queueSize = queue.size();

        for (int i = 0; i < queueSize / 2; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < queueSize; i++) {
            if (i < queueSize / 2) {
                queue.add(queue.remove());
            } else {
                stack.add(queue.remove());
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
            queue.add(queue.remove());
        }
    }
}
