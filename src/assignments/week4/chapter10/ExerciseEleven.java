package assignments.week4.chapter10;

/*
--Exercise 11--
Write a method called stutter that accepts an ArrayList of strings and an integer k as parameters and that replaces
every string with k copies of that string. For example, if the list stores the values ["how", "are", "you?"] before the
method is called and k is 4, it should store the values
["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", "you?"] after the method finishes
executing. If k is 0 or negative, the list should be empty after the call.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseEleven {
    public static void main(String [] args) {
        String[] words = {"how", "are", "you?"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        stutter(arr, 4);
        System.out.println(arr);
        stutter(arr, 0);
        System.out.println(arr);
    }

    public static void stutter(ArrayList<String> arr, int k) {
        if (k <= 0) {
            arr.clear();
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 1; j < k; j++) {
                arr.add(i, arr.get(i));
                i++;
            }
        }
    }
}
