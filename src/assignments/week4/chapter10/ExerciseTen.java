package assignments.week4.chapter10;

/*
--Exercise 10--
Write a method called removeInRange that accepts three parameters, an ArrayList of strings, a beginning string, and an
ending string, and removes from the list any strings that fall alphabetically between the start and end strings.
For example, if the method is passed a list containing the elements
["to", "be", "or", "not", "to", "be", "that", "is", "the", "question"], "free" as the start String, and "rich" as the
end String, the list’s elements should be changed to ["to", "be", "to", "be", "that", "the"]. The "or", "not", "is",
and "question" should be removed because they occur alphabetically between "free" and "rich".
You may assume that the start string alphabetically precedes the ending string.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseTen {
    public static void main(String[] args) {
        String[] words = {"to", "be", "or", "not", "to", "be", "that", "is", "the", "question"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(words));
        removeInRange(arr, "free", "rich");
        System.out.println(arr);
    }

    public static void removeInRange(ArrayList<String> arr, String start, String end) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).compareToIgnoreCase(start) >= 0 && arr.get(i).compareToIgnoreCase(end) <= 0) {
                arr.remove(i);
                i--;
            }
        }
    }
}
