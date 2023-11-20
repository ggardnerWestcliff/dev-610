package assignments.week4.chapter10;

/*
--Exercise 13--
Write a method called reverse3 that accepts an ArrayList of integer values as a parameter and reverses each successive
sequence of three values in the list. If the list has extra values that are not part of a sequence of three, those
values are unchanged. For example, if a list stores values [3, 8, 19, 42, 7, 26, 19, -8], after the call the list
should store the values [19, 8, 3, 26, 7, 42, 19, -8]. The first sequence of three (3, 8, 19) has been reversed to be
(19, 8, 3). The second sequence (42, 7, 26) has been reversed to be (26, 7, 42), and so on. Notice that 19 and –8 are
unchanged because they were not part of a sequence of three values.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseThirteen {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 8, 19, 42, 7, 26, 19, -8));
        reverse3(arr);
        System.out.println(arr);
    }

    public static void reverse3(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 2; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(i + 2));
            arr.set(i + 2, temp);
            i += 2;
        }
    }
}
