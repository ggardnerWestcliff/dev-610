package assignments.week4.chapter11;

/*
--Exercise 7--
Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique integers
that occur in both lists. Use one or more sets as storage to help you solve this problem. For example, if one list
contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values [–5, 15, 2, –1, 7, 15, 36],
your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists.
*/

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ExerciseSeven {
    public static void main(String[] args) {
        int[] nums1 = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }
        int[] nums2 = {-5, 15, 2, -1, 7, 15, 36};
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }
        System.out.println(countCommon(list1, list2));
    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return set1.size();
    }
}
