package assignments.week5.chapter14;

/*
--Exercise 18--
Write a method called mirrorHalves that accepts a queue of integers as a parameter and replaces each half of that queue
with itself plus a mirrored version of itself (the same elements in the opposite order).

For example, if the queue stores [10, 50, 19, 54, 30, 67], your method should change it to store
[10, 50, 19, 19, 50, 10, 54, 30, 67, 67, 30, 54]. If your method is passed an empty queue, the result should be an
empty queue. If your method is passed a queue whose size is not even, throw an IllegalArgumentException.

Use one stack or one queue (but not both) as auxiliary storage.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExerciseEighteen {
    public static void main(String[] args) {
        int[] tmp = {10, 50, 19, 54, 30, 67};
        Queue<Integer> queue = new LinkedList<>();
        for (int i : tmp) {
            queue.add(i);
        }
        mirrorHalves(queue);
        System.out.println(queue);
    }

    public static void mirrorHalves(Queue<Integer> queue) {
        if (queue == null) {
            throw new IllegalArgumentException("Supplied Queue cannot be null.");
        }
        if (queue.size() % 2 == 1) {
            throw new IllegalArgumentException("Queue size must be even.");
        }

        Stack<Integer> stack = new Stack<>();
        int moves = queue.size() / 2;

        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < moves; k++) {
                int num = queue.remove();
                stack.push(num);
                queue.add(num);
            }
            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
        }
    }
}
