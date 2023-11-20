package assignments.week4.chapter11;

/*
--Exercise 16--
Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and returns true if
no two keys map to the same value. For example, {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567}
should return false, but {Marty=206–9024, Hawking=555–1234, Smith=949–0504, Newton=123–4567} should return true.
The empty map is considered 1-to-1 and returns true.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExerciseSixteen {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "206-9024");
        map.put("Hawking", "123-4567");
        map.put("Smith", "949-0504");
        map.put("Newton", "123-4567");
        System.out.println(is1to1(map));

        Map<String, String> map1 = new HashMap<>();
        map1.put("Marty", "206-9024");
        map1.put("Hawking", "555-1234");
        map1.put("Smith", "949-0504");
        map1.put("Newton", "123-4567");
        System.out.println(is1to1(map1));
    }

    public static boolean is1to1(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        for (String key : map.keySet()) {
            if (set.contains(map.get(key))) {
                return false;
            } else {
                set.add(map.get(key));
            }
        }
        return true;
    }
}
