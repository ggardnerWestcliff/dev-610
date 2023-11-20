package assignments.week4.chapter11;

/*
--Exercise 11--
Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set containing their
symmetric set difference (that is, the set of elements contained in either of the two sets but not in both).
For example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExerciseEleven {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 4, 7, 9};
        Integer[] nums2 = {2, 4, 5, 6, 7};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(nums1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(nums2));
        System.out.println(symmetricSetDifference(set1, set2));
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        symmetricDiff.removeAll(intersection);
        return symmetricDiff;
    }
}
