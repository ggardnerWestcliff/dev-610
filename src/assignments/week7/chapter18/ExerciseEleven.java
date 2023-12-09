package assignments.week7.chapter18;

/*
--Exercise 11--
Write a method called removeDuplicates that accepts a PriorityQueue of integers as a parameter and modifies the queue’s
state so that any element that is equal to another element in the queue is removed. For example, if the queue stores
[7, 7, 8, 8, 8, 10, 45, 45], your method should modify the queue to store [7, 8, 10, 45]. You may use one stack or queue
as auxiliary storage.

*/

import java.util.*;
import java.util.Arrays;

public class ExerciseEleven {
    public static void main(String[] args) {
        int[] array = {7, 7, 8, 8, 8, 10, 45, 45};
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        removeDuplicates(queue);
        System.out.println(queue);
    }

    public static void removeDuplicates(PriorityQueue<Integer> priorityQueue) {
        Queue<Integer> list = new LinkedList<>();
        if (priorityQueue.isEmpty()) {
            return;
        }
        int prevValue = priorityQueue.remove();
        list.add(prevValue);
        while(!priorityQueue.isEmpty()) {
            int element = priorityQueue.remove();
            if (element != prevValue) {
                list.add(element);
            }
            prevValue = element;
        }
        while(!list.isEmpty()) {
            priorityQueue.add(list.remove());
        }
    }
}
