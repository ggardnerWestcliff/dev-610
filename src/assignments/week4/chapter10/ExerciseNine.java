package assignments.week4.chapter10;

/*
--Exercise 9--
Write a method called rangeBetweenZeroes that takes as a parameter an ArrayList of integers and returns the number of
indexes apart the two farthest occurrences of the number 0 are. For example, if the list stores the values
[7, 2, 0, 0, 4, 0, 9, 0, 6, 4, 8] when the method is called, it should return 6, because the occurrences of 0 that are
farthest apart are at indexes 2 and 7, and the range 2 through 7 has six elements. If only one 0 occurs in the list,
your method should return 1. If no 0s occur, your method should return 0.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseNine {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 2, 0, 0, 4, 0, 9, 0, 6, 4, 8));
        System.out.println(rangeBetweenZeroes(arr));
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(7, 2, 4, 9, 6, 4, 8));
        System.out.println(rangeBetweenZeroes(arr1));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(7, 2, 4, 9, 6, 4, 8, 0));
        System.out.println(rangeBetweenZeroes(arr2));
    }

    public static int rangeBetweenZeroes(ArrayList<Integer> arr) {
        int farthestZero = 0;
        int secondZero = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                if (secondZero == 0) {
                    secondZero = i;
                } else {
                    farthestZero = i;
                }
            }
        }
        if (secondZero == 0) {
            return 0;
        } else {
            return Math.max(farthestZero - secondZero + 1, 1);
        }
    }
}
