package assignments.week4.chapter11;

/*
--Exercise 10--
Write a method removeEvenLength that accepts a set of strings as a parameter and that removes all of the strings of
even length from the set.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExerciseTen {
    public static void main(String[] args) {
        String[] words = {"hello", "goodbye", "yes", "no", "maybe", "greeting"};
        Set<String> set = new HashSet<>(Arrays.asList(words));
        removeEvenLength(set);
        System.out.println(set);
    }

    public static void removeEvenLength(Set<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            if (itr.next().length() % 2 == 0) {
                itr.remove();
            }
        }
    }
}
