package assignments.week5.chapter14;

/*
--Exercise 7--
Write a method called reverseHalf that accepts a queue of integers as a parameter and reverses the order of all the
elements in odd-numbered positions (position 1, 3, 5, etc.), assuming that the first value in the queue has position 0.
For example, if the queue stores [1, 8, 7, 2, 9, 18, 12, 0], your method should change it to store
[1, 0, 7, 18, 9, 2, 12, 8]. Notice that numbers in even positions (positions 0, 2, 4, 6) have not moved.
That subsequence of integers is still (1, 7, 9, 12). But notice that the numbers in odd positions
(positions 1, 3, 5, 7) are now in reverse order relative to the original. In other words, the original subsequence
(8, 2, 18, 0) has become (0, 18, 2, 8).

Use a single stack as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseSeven {

    public static void main(String[] args) {
        int[] tmp = {1, 8, 7, 2, 9, 18, 12, 0};
        Queue<Integer> queue = new LinkedList<>();
        for (int i : tmp) {
            queue.add(i);
        }
        reverseHalf(queue);
        System.out.println(queue);
    }

    public static void reverseHalf(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        int queueSize = queue.size();

        for (int i = 0; i < queueSize; i++) {
            if (i % 2 == 0) {
                queue.add(queue.remove());
            } else {
                stack.push(queue.remove());
            }
        }

        while (!stack.isEmpty()) {
            queue.add(queue.remove());
            queue.add(stack.pop());
        }

        if (queueSize % 2 == 1) {
            queue.add(queue.remove());
        }
    }
}
