package assignments.week4.chapter11;

/*
--Exercise 5--
Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges the
list’s elements into sorted ascending order, as well as removing all duplicate values from the list. For example, the
list [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9] would become [–9, –5, 4, 7, 8, 11, 15, 27, 32] after a call to
your method. Use a Set as part of your solution.
*/

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ExerciseFive {
    public static void main(String[] args) {
        int[] nums = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        sortAndRemoveDuplicates(list);
        System.out.println(list);
    }

    public static void sortAndRemoveDuplicates(List<Integer> list) {
        Set<Integer> temp = new HashSet<>(list);
        list.clear();
        list.addAll(temp);
        list.sort(null);
    }
}
