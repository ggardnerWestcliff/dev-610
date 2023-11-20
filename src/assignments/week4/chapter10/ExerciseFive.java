package assignments.week4.chapter10;

/*
--Exercise 5--
Write a method called scaleByK that takes an ArrayList of integers as a parameter and replaces every integer of value
k with k copies of itself. For example, if the list stores the values [4, 1, 2, 0, 3] before the method is called,
it should store the values [4, 4, 4, 4, 1, 2, 2, 3, 3, 3] after the method finishes executing. Zeroes and negative
numbers should be removed from the list by this method.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseFive {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 1, 2, 0, 3));
        scaleByK(arr);
        System.out.println(arr);
    }

    public static void scaleByK(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                arr.remove(i);
                i--;
                continue;
            }
            int k = arr.get(i);
            for (int j = 1; j <= k - 1; j++) {
                arr.add(i, k);
                i++;
            }
        }
    }
}
