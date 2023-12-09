package assignments.week7.chapter18;

/*
--Exercise 12--
Write a method called stutter that accepts a PriorityQueue of integers as a parameter and replaces every value in the
queue with two occurrences of that value. For example, if the queue stores [7, 8, 10, 45], your method should modify
the queue to store [7, 7, 8, 8, 10, 10, 45, 45]. You may use one stack or queue as auxiliary storage.

*/

import java.util.*;

public class ExerciseTwelve {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(7);
        priorityQueue.add(8);
        priorityQueue.add(10);
        priorityQueue.add(45);
        System.out.println(priorityQueue);
        stutter(priorityQueue);
        System.out.println(priorityQueue);
    }

    public static void stutter(PriorityQueue<Integer> priorityQueue) {
        Queue<Integer> list = new LinkedList<>();
        while(!priorityQueue.isEmpty()) {
            list.add(priorityQueue.remove());
        }
        while(!list.isEmpty()) {
            int element = list.remove();
            priorityQueue.add(element);
            priorityQueue.add(element);
        }
    }
}
