package assignments.week4.chapter11;

/*
--Exercise 12--
Write a method contains3 that accepts a list of strings as a parameter and returns true if any single string occurs at
least 3 times in the list, and false otherwise. Use a map as auxiliary storage.
*/

import java.util.*;

public class ExerciseTwelve {
    public static void main(String[] args) {
        String[] words = {"one", "one", "three", "four", "five", "six", "seven", "eight", "nine", "one"};
        List<String> list = new LinkedList<>(Arrays.asList(words));
        System.out.println(contains3(list));
    }

    public static boolean contains3(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        Iterator<String> itr = words.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            if (map.containsKey(word)) {
                if (map.get(word) >= 3) {
                    return true;
                }
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        Iterator<Integer> mapItr = map.values().iterator();
        while (mapItr.hasNext()) {
            if (mapItr.next() >= 3) {
                return true;
            }
        }
        return false;
    }
}
