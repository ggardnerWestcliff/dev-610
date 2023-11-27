package assignments.week5.chapter14;

/*
--Exercise 6--
Write a method called rearrange that accepts a queue of integers as a parameter and rearranges the order of the values
so that all of the even values appear before the odd values and that otherwise preserves the original order of the
queue. For example, if the queue stores [3, 5, 4, 17, 6, 83, 1, 84, 16, 37], your method should rearrange it to store
[4, 6, 84, 16, 3, 5, 17, 83, 1, 37]. Notice that all of the evens appear at the front followed by the odds and that
the relative order of the evens and odds is the same as in the original.

Use one stack as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseSix {
    public static void main(String[] args) {
        int[] tmp = {3, 5, 4, 17, 6, 83, 1, 84, 16, 37};
        Queue<Integer> queue = new LinkedList<>();
        for (int i : tmp) {
            queue.add(i);
        }
        rearrange(queue);
        System.out.println(queue);

    }

    public static void rearrange(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        int queueSize = queue.size();

        for (int i = 0; i < queueSize; i++) {
            int num = queue.remove();
            if (num % 2 == 0) {
                stack.push(num);
            } else {
                queue.add(num);
            }
        }

        for (int i = 0; i < 2; i++) {
            while (!queue.isEmpty()) {
                stack.push(queue.remove());
            }
            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
        }
    }
}
