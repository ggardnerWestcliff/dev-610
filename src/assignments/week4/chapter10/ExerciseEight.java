package assignments.week4.chapter10;

/*
--Exercise 8--
Write a method called removeZeroes that takes as a parameter an ArrayList of integers and eliminates any occurrences of
the number 0 from the list. For example, if the list stores the values [0, 7, 2, 0, 0, 4, 0] before the method is
called, it should store the values [7, 2, 4] after the method finishes executing.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseEight {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 7, 2, 0, 0, 4, 0));
        removeZeroes(arr);
        System.out.println(arr);
    }

    public static void removeZeroes(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                arr.remove(i);
                i--;
            }
        }
    }
}
