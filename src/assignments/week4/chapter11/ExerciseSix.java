package assignments.week4.chapter11;

/*
--Exercise 6--
Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer
values in the list. Use a set as auxiliary storage to help you solve this problem. For example, if a list contains the
values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.
*/

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ExerciseSix {
    public static void main(String[] args) {
        int[] nums = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        System.out.println(countUnique(list));
        System.out.println(countUnique(new LinkedList<>()));
    }

    public static int countUnique(List<Integer> list) {
        Set<Integer> temp = new HashSet<>(list);
        return temp.size();
    }
}
