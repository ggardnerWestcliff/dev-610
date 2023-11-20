package assignments.week4.chapter10;

/*
--Exercise 6--
Write a method called minToFront that takes an ArrayList of integers as a parameter and moves the minimum value in the
list to the front, otherwise preserving the order of the elements. For example, if a variable called list stores
[3, 8, 92, 4, 2, 17, 9], the value 2 is the minimum, so your method should modify the list to store the values
[2, 3, 8, 92, 4, 17, 9].
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseSix {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 8, 92, 4, 2, 17, 9));
        minToFront(arr);
        System.out.println(arr);
    }

    public static void minToFront(ArrayList<Integer> arr) {
        int min = arr.get(0);
        int minIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
                minIndex = i;
            }
        }
        arr.remove(minIndex);
        arr.add(0, min);
    }
}
