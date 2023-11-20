package assignments.week4.chapter10;

/*
--Exercise 1--
Write a method called averageVowels that takes an ArrayList of strings as a parameter and returns the average number of
vowel characters (a, e, i, o, u) in all Strings in the list.
If your method is passed an empty ArrayList, it should return 0.0.
 */

import java.util.ArrayList;

public class ExerciseOne {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        System.out.println(averageVowels(words));
        System.out.println(averageVowels(new ArrayList<>()));
    }

    public static double averageVowels(ArrayList<String> words) {
        if (words.isEmpty()) {
            return 0.0;
        }
        int vowelCount = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (isVowel(words.get(i).charAt(j))) {
                    vowelCount++;
                }
            }
        }
        return (double) vowelCount / words.size();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
