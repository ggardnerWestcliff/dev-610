package assignments.week4.chapter10;

/*
--Exercise 3--
Write a method called removeEvenLength that takes an ArrayList of strings as a parameter and removes all of the strings
of even length from the list.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseThree {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "coding", "greeting"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        removeEvenLength(arr);
        System.out.println(arr);
        ArrayList<String> arr1 = new ArrayList<>();
        removeEvenLength(arr1);
        System.out.println(arr1);
    }

    public static void removeEvenLength(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
    }
}
