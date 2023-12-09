package assignments.week7.chapter18;

/*
--Exercise 9--
Write a method called kthSmallest that accepts a PriorityQueue of integers and an integer k as parameters and returns
the kth-smallest integer from the priority queue. For example, if the queue passed stores the integers
[42, 50, 45, 78, 61] and k is 4, return the fourth-smallest integer, which is 61.
If k is 0 or negative or greater than the size of the queue, throw an IllegalArgumentException.
If your method modifies the state of the queue during its computation, it should restore the queue before it returns.
You may use one stack or queue as auxiliary storage.
*/

import java.util.*;

public class ExerciseNine {

    public static void main(String[] args) {
        int[] array = {42, 50, 45, 78, 61};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : array) {
            priorityQueue.add(i);
        }
        System.out.println(kthSmallest(priorityQueue, 4));
    }

    public static int kthSmallest(PriorityQueue<Integer> priorityQueue, int k) {
        if (k <= 0 || k > priorityQueue.size()) {
            throw new IllegalArgumentException();
        }
        Queue<Integer> list = new LinkedList<>();
        int kValue = 0;

        int i = 0;
        while(!priorityQueue.isEmpty()) {
            int element = priorityQueue.remove();
            if ( ++i == k) {
                kValue = element;
            }
            list.add(element);
        }
        while(!list.isEmpty()) {
            priorityQueue.add(list.remove());
        }
        return kValue;
    }
}
