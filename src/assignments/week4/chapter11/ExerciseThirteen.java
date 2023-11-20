package assignments.week4.chapter11;

/*
--Exercise 13--
Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if no two
keys map to the same value (and false if any two or more keys do map to the same value). For example, if the map
contains the following key/value pairs, your method would return true:
{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the following map would
return false, because of two mappings for Perkins and Reges:
{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ExerciseThirteen {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");
        System.out.println(isUnique(map));

        Map<String, String> map1 = new HashMap<>();
        map1.put("Kendrick", "Perkins");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Bruce", "Reges");
        map1.put("Hal", "Perkins");
        System.out.println(isUnique(map1));
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        for (String key : map.keySet()) {
            if (set.contains(map.get(key))) {
                return false;
            }
            set.add(map.get(key));
        }
        return true;
    }
}
