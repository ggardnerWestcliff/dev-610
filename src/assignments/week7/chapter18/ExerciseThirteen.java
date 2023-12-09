package assignments.week7.chapter18;

/*
--Exercise 13--
Write a method called fillGaps that accepts a PriorityQueue of integers as a parameter and adds elements to it until
every element in its range of smallest to largest is represented once if it was not previously found in the priority
queue. For example, if the queue stores [1, 3, 3, 6, 6, 8], your method should modify the queue to store
[1, 2, 3, 3, 4, 5, 6, 6, 7, 8]. You may use one collection as auxiliary storage.
*/

import java.util.*;
import java.util.LinkedList;

public class ExerciseThirteen {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(3);
        priorityQueue.add(6);
        priorityQueue.add(6);
        priorityQueue.add(8);
        fillGaps(priorityQueue);
        System.out.println(priorityQueue);
    }

    public static void fillGaps(PriorityQueue<Integer> priorityQueue) {
        if (priorityQueue.isEmpty()) {
            return;
        }
        Queue<Integer> list = new LinkedList<>();
        int prevValue = priorityQueue.remove();
        list.add(prevValue);
        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.remove();
            for (int i = prevValue + 1; i < element; i++) {
                list.add(i);
            }
            list.add(element);
            prevValue = element;
        }
        while (!list.isEmpty()) {
            priorityQueue.add(list.remove());
        }
    }
}
