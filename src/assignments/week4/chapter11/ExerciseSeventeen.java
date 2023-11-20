package assignments.week4.chapter11;

/*
--Exercise 17--
Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true if every
key in the first map is also contained in the second map and maps to the same value in the second map.
For example, {Smith=949–0504, Marty=206–9024} is a submap of
{Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567}.
The empty map is a submap of every map.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "206-9024");
        map.put("Hawking", "123-4567");
        map.put("Smith", "949-0504");
        map.put("Newton", "123-4567");
        System.out.println(subMap(map, map));

        Map<String, String> map1 = new HashMap<>(map);
        map1.remove("Smith");
        System.out.println(subMap(map, map1));
    }

    public static boolean subMap(Map<String, String> map1, Map<String, String> map2) {
        Iterator<String> itr = map1.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            if (!map2.containsKey(key) || !map2.get(key).equals(map1.get(key))) {
                return false;
            }
        }
        return true;
    }
}
