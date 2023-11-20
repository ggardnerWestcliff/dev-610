package assignments.week4.chapter11;

/*
--Exercise 2--
Write a method called alternate that accepts two Lists as its parameters and returns a new List containing alternating
elements from the two lists, in the following order:

First element from first list

First element from second list

Second element from first list

Second element from second list

Third element from first list

Third element from second list

. . .

If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed
consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list of
[6, 7, 8, 9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing
[1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExerciseTwo {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        List<Integer> l1 = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++) {
            l1.add(nums1[i]);
        }
        int[] nums2 = {6, 7, 8, 9, 10, 11, 12};
        List<Integer> l2 = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            l2.add(nums2[i]);
        }
        List<Integer> l3 = alternate(l1, l2);
        System.out.println(l3);

    }

    public static LinkedList<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        Iterator<Integer> iter1 = list1.iterator();
        Iterator<Integer> iter2 = list2.iterator();
        LinkedList<Integer> result = new LinkedList<>();

        while(iter1.hasNext() || iter2.hasNext()) {
            if (iter1.hasNext()) {
                result.add(iter1.next());
            }

            if (iter2.hasNext()) {
                result.add(iter2.next());
            }
        }

        return result;
    }
}
