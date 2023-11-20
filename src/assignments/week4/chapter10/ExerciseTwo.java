package assignments.week4.chapter10;

/*
--Exercise 2--
Write a method called swapPairs that switches the order of values in an ArrayList of strings in a pairwise fashion.
Your method should switch the order of the first two values, then switch the order of the next two, then the next two,
and so on. If the number of values in the list is odd, the method should not move the final element. For example, if
the list initially stores ["to", "be", "or", "not", "to", "be", "hamlet"], your method should change the list’s
contents to ["be", "to", "not", "or", "be", "to", "hamlet"].
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseTwo {
    public static void main(String[] args) {
        String[] words = {"to", "be", "or", "not", "to", "be", "hamlet"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        swapPairs(arr);
        System.out.println(arr);
        ArrayList<String> arr1 = new ArrayList<>();
        swapPairs(arr1);
        System.out.println(arr1);
    }

    public static void swapPairs(ArrayList<String> arr) {
        for (int i = 0; i < arr.size() - 1; i += 2) {
            if (i + 1 < arr.size()) {
                String temp = arr.get(i);
                arr.set(i, arr.get(i + 1));
                arr.set(i + 1, temp);
            }
        }
    }
}
