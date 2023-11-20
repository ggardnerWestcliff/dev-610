package assignments.week4.chapter10;

/*
--Exercise 4--
Write a method called doubleList that takes an ArrayList of strings as a parameter and replaces every string with two
of that same string. For example, if the list stores the values ["how", "are", "you?"] before the method is called, it
should store the values ["how", "how", "are", "are", "you?", "you?"] after the method finishes executing.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseFour {
    public static void main(String[] args) {
        String[] words = {"how", "are", "you?"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        doubleList(arr);
        System.out.println(arr);
        ArrayList<String> arr1 = new ArrayList<>();
        doubleList(arr1);
        System.out.println(arr1);
    }

    public static void doubleList(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.add(i + 1, arr.get(i));
            i++;
        }
    }
}
