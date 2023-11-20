package assignments.week4.chapter11;

/*
--Exercise 9--
Write a method hasOdd that accepts a set of integers as a parameter and returns true if the set contains at least one
odd integer and false otherwise. If passed the empty set, your method should return false.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExerciseNine {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        Set<Integer> set = new HashSet<>(Arrays.asList(nums));
        System.out.println(hasOdd(set));
        Integer[] nums1 = {2, 4, 6, 8, 10};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(nums1));
        System.out.println(hasOdd(set1));
    }

    public static boolean hasOdd(Set<Integer> set) {
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            if (itr.next() % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
