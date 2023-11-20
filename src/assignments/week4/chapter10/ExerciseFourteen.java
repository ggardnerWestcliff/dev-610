package assignments.week4.chapter10;

/*
--Exercise 14--
Write a method called removeShorterStrings that accepts an ArrayList of strings as a parameter and removes from each
pair of values the shorter string in the pair. If the list is of odd length, the final element is unchanged.
For example, suppose that a list contains ["four", "score", "and", "seven", "years", "ago", "our"]. In the first pair
("four" and "score") the shorter string is "four". In the second pair ("and" and "seven") the shorter string is "and".
In the third pair ("years" and "ago") the shorter string is "ago". Your method should remove these shorter strings,
changing the list to store ["score", "seven", "years", "our"]. If both strings in a pair have the same length, remove
the first string in the pair.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseFourteen {
    public static void main(String [] args) {
        String[] words = {"four", "score", "and", "seven", "years", "ago", "our"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        removeShorterStrings(arr);
        System.out.println(arr);
    }

    public static void removeShorterStrings(ArrayList<String> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).length() > arr.get(i + 1).length()) {
                arr.remove(i + 1);
            } else {
                arr.remove(i);
            }
        }
    }
}
