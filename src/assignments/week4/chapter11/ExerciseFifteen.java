package assignments.week4.chapter11;

/*
--Exercise 15--
Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the most
frequently occurring integer (the “mode”) occurs in the list. Solve this problem using a map as auxiliary storage.
If the list is empty, return 0.
*/

import java.util.*;

public class ExerciseFifteen {
    public static void main(String[] args) {
        Integer[] nums = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        List<Integer> list = new LinkedList<>(Arrays.asList(nums));
        System.out.println(maxOccurrences(list));
        System.out.println(maxOccurrences(new LinkedList<>()));
    }

    public static int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int max = 0;
        Iterator<Integer> mapItr = map.values().iterator();
        while (mapItr.hasNext()) {
            max = Math.max(max, mapItr.next());
        }
        return max;
    }
}
