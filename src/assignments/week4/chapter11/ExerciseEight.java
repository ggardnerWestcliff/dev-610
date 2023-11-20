package assignments.week4.chapter11;

/*
--Exercise 8--
Write a method maxLength that accepts a set of strings as a parameter and that returns the length of the longest string
in the list. If your method is passed an empty set, it should return 0.
*/

import java.util.*;

public class ExerciseEight {
    public static void main(String[] args) {
        String[] words = {"a", "bb", "ccc", "dd"};
        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(maxLength(set));
    }

    public static int maxLength(Set<String> list) {
        int maxLength = 0;
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            maxLength = Math.max(maxLength, itr.next().length());
        }
        return maxLength;
    }
}
