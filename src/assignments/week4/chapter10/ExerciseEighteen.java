package assignments.week4.chapter10;

/*
--Exercise 18--
Write a method called mirror that accepts an ArrayList of strings as a parameter and produces a mirrored copy of the
list as output, with the original values followed by those same values in the opposite order. For example, if an
ArrayList variable called list contains the values ["a", "b", "c"], after a call of mirror(list); it should contain
["a", "b", "c", "c", "b", "a"].
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseEighteen {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        mirror(list);
        System.out.println(list);
    }

    public static void mirror(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.add(list.get(i));
        }
    }
}
