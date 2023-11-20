package assignments.week4.chapter11;

/*
--Exercise 4--
Write a method called partition that accepts a list of integers and an integer value E as its parameter, and rearranges
(partitions) the list so that all the elements with values less than E occur before all elements with values greater
than E. The exact order of the elements is unimportant, so long as all elements less than E appear before all elements
greater than E. For example, for the linked list [15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9], one acceptable ordering of
the list after a call of partition(list, 5) would be [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9]. You may assume that
the list contains no duplicates and does not contain the element value E.
*/

import java.util.Iterator;
import java.util.LinkedList;

public class ExerciseFour {
    public static void main(String[] args) {
        int[] nums = {15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        partition(list, 5);
        System.out.println(list);
    }

    public static void partition(LinkedList<Integer> list, int e) {
        Iterator<Integer> itr = list.iterator();
        LinkedList<Integer> temp = new LinkedList<>();
        while (itr.hasNext()) {
            int val = itr.next();
            if (val > e) {
                itr.remove();
                temp.add(val);
            }
        }
        list.addAll(temp);
    }
}
