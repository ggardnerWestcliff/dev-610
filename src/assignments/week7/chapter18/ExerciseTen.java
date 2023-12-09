package assignments.week7.chapter18;

/*
--Exercise 10--
Write a method called isConsecutive that accepts a PriorityQueue of integers as a parameter and returns true if the
queue contains a sequence of consecutive integers starting from the front of the queue. Consecutive integers are
integers that come one after the other, as in 5, 6, 7, 8, 9, etc., so if the queue stores [7, 8, 9, 10, 11], your
method should return true. If your method modifies the state of the queue during its computation, it should restore the
queue before it returns. You may use one stack or queue as auxiliary storage.

*/

import java.util.*;

public class ExerciseTen {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(7);
        priorityQueue.add(8);
        priorityQueue.add(9);
        priorityQueue.add(10);
        priorityQueue.add(11);
        System.out.println(isConsecutive(priorityQueue));
        priorityQueue.add(4);
        System.out.println(isConsecutive(priorityQueue));
    }

    public static boolean isConsecutive(PriorityQueue<Integer> priorityQueue) {
        if (priorityQueue.isEmpty()) {
            return true;
        }
        Queue<Integer> list = new LinkedList<>();
        boolean consecutive = true;
        while (!priorityQueue.isEmpty()) {
            int element = priorityQueue.remove();
            if (consecutive && !priorityQueue.isEmpty() && element != priorityQueue.peek() - 1) {
                consecutive = false;
            }
            list.add(element);
        }
        while(!list.isEmpty()) {
            priorityQueue.add(list.remove());
        }
        return consecutive;
    }
}
