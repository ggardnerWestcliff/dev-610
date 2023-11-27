package assignments.week5.chapter14;

/*
--Exercise 11--
Write a method called reorder that accepts a queue of integers as a parameter and that puts the integers into sorted
(non-decreasing) order, assuming that the queue is already sorted by absolute value.
For example, if the queue stores [1, 2, −2, 4, −5, 8, −8, 12, −15], notice that the values appear in sorted order if
you ignore the sign of the numbers. Your method should reorder the values so that the queue stores
[−15, −8, −5, −2, 1, 2, 4, 8, 12].

Use one stack as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseEleven {
    public static void main(String[] args) {
        int[] tmp = {1, 2, -2, 4, -5, 8, -8, 12, -15};
        Queue<Integer> queue = new LinkedList<>();
        for (int i : tmp) {
            queue.add(i);
        }
        reorder(queue);
        System.out.println(queue);
    }

    public static void reorder(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        int oldSize = queue.size();
        int position = 0;

        for (int i = 0; i < oldSize; i++) {
            int num = queue.remove();
            if (num < 0) {
                stack.push(num);
            } else {
                queue.add(num);
                position++;
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < position; i++) {
            queue.add(queue.remove());
        }
    }
}
