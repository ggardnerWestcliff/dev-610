package assignments.week7.chapter18;

/*
--Exercise 8--
Write a method called descending that accepts an array of integers and rearranges the integers in the array to be in
descending order using a PriorityQueue as a helper. For example, if the array passed stores [42, 9, 22, 17, -3, 81],
after the call the array should store [81, 42, 22, 17, 9, -3].

*/

import java.util.*;

public class ExerciseEight {

    public static void main(String[] args) {
        int[] x = {42, 9, 22, 17, -3, 81};
        descending(x);
        System.out.println(Arrays.toString(x));
    }

    public static void descending(int[] x) {
        if (x.length == 0) {
            return;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(x.length, Comparator.reverseOrder());
        for (int i = 0; i < x.length; i++) {
            queue.add(x[i]);
        }
        int i = 0;
        while (!queue.isEmpty()) {
            x[i++] = queue.poll();
        }
    }
}
