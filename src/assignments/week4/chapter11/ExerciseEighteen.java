package assignments.week4.chapter11;

/*
--Exercise 18--
Write a method called reverse that accepts a map from strings to strings as a parameter and returns a new map that is
the reverse of the original. The reverse of a map is a new map that uses the values from the original as its keys and
the keys from the original as its values. Since a map’s values need not be unique but its keys must be, you should have
each value map to a set of keys. In other words, if the original map maps keys of type K to values of type V, the new
map should map keys of type V to values that are Sets containing elements of type K.
For example, the map {42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed} has a reverse of
{Marty=[42, 3], Sue=[81], Ed=[17, 56, 29], Dave=[31]}. (The order of the keys and values does not matter.)
*/

import java.util.*;

public class ExerciseEighteen {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
            42, "Marty",
            81, "Sue",
            17, "Ed",
            31, "Dave",
            56, "Ed",
            3, "Marty",
            29, "Ed"
        );
        System.out.println(reverse(map));
    }

    public static Map<String, Set<Integer>> reverse(Map<Integer, String> map) {
        Map<String, Set<Integer>> reverseMap = new HashMap<>();
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            Integer key = itr.next();
            String value = map.get(key);
            if (!reverseMap.containsKey(value)) {
                Set<Integer> valSet = new HashSet<>();
                valSet.add(key);
                reverseMap.put(value, valSet);
            } else {
                Set<Integer> valSet = reverseMap.get(value);
                valSet.add(key);
            }
        }
        return reverseMap;
    }
}
