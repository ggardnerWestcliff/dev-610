package assignments.week4.chapter11;

/*
--Exercise 19--
Write a method called rarest that accepts a map whose keys are strings and whose values are integers as a parameter and
returns the integer value that occurs the fewest times in the map. If there is a tie, return the smaller integer value.
If the map is empty, throw an exception.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExerciseNineteen {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "Marty", 17,
                "Sue", 81,
                "Ed", 17,
                "Dave", 81,
                "Matt", 100,
                "Owen", 100,
                "Logan", 100
        );
        System.out.println(rarest(map));
    }

    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Map cannot be empty.");
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        Iterator<Integer> itr = map.values().iterator();
        while (itr.hasNext()) {
            int value = itr.next();
            if (countMap.containsKey(value)) {
                countMap.put(value, countMap.get(value) + 1);
            } else {
                countMap.put(value, 1);
            }
        }
        Iterator<Integer> counterItr = countMap.keySet().iterator();
        int minVal = counterItr.next();
        int minCount = countMap.get(minVal);
        while (counterItr.hasNext()) {
            int val = counterItr.next();
            if (countMap.get(val) < minCount) {
                minCount = countMap.get(val);
                minVal = val;
            } else if (countMap.get(val) == minCount && val < minVal) {
                minVal = val;
            }
        }
        return minVal;
    }
}
