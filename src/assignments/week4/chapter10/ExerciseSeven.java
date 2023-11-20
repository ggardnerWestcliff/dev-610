package assignments.week4.chapter10;

/*
--Exercise 7--
Write a method called removeDuplicates that takes as a parameter a sorted ArrayList of strings and eliminates any
duplicates from the list. For example, if the list stores the values
["be", "be", "is", "not", "or", "question", "that", "the", "to", "to"] before the method is called, it should store the
values ["be", "is", "not", "or", "question", "that", "the", "to"] after the method finishes executing. Because the
values will be sorted, all of the duplicates will be grouped together. Assume that the ArrayList contains only String
values, but keep in mind that it might be empty.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseSeven {
    public static void main(String[] args) {
        String[] words = {"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        removeDuplicates(arr);
        System.out.println(arr);
        ArrayList<String> arr1 = new ArrayList<>();
        removeDuplicates(arr1);
        System.out.println(arr1);
    }

    public static void removeDuplicates(ArrayList<String> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).equals(arr.get(i + 1))) {
                arr.remove(i + 1);
                i--;
            }
        }
    }
}
