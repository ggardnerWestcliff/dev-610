package assignments.week4.chapter10;

/*
--Exercise 15--
Write a method called filterRange that accepts an ArrayList of integers and two integer values min and max as
parameters and removes all elements whose values are in the range min through max (inclusive). For example, if a
variable called list stores the values [4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7], the call of filterRange(list, 5, 7);
should remove all values between 5 and 7, changing the list to store [4, 9, 2, 3, 1, 8]. If no elements in range
min-max are found in the list, or if the list is initially empty, the list’s contents are unchanged.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseFifteen {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 7, 9, 2, 7, 7, 5, 3, 5, 1, 7, 8, 6, 7));
        filterRange(arr, 5, 7);
        System.out.println(arr);
        filterRange(arr, 10, 11);
        System.out.println(arr);
    }

    public static void filterRange(ArrayList<Integer> arr, int min, int max) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= min && arr.get(i) <= max) {
                arr.remove(i);
                i--;
            }
        }
    }
}
