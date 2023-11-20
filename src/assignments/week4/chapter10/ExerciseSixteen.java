package assignments.week4.chapter10;

/*
--Exercise 16--
Write a method called clump that accepts an ArrayList of strings as a parameter and replaces each pair of strings with
a single string that consists of the two original strings in parentheses separated by a space. If the list is of odd
length, the final element is unchanged. For example, suppose that a list contains
["four", "score", "and", "seven", "years", "ago", "our"]. Your method should change the list to store
["(four score)", ("and seven"), ("years ago"), "our"].
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseSixteen {
    public static void main(String[] args) {
        String[] words = {"four", "score", "and", "seven", "years", "ago", "our"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        clump(arr);
        System.out.println(arr);
    }

    public static void clump(ArrayList<String> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            String s = "(" + arr.get(i) + " " + arr.get(i + 1) + ")";
            arr.set(i, s);
            arr.remove(i + 1);
        }
    }
}
