package assignments.week4.chapter11;

/*
--Exercise 21--
Write a method called pairCounts that accepts a list of strings representing individual words and counts the number of
occurrences of all 2-character sequences of letters in those words. For example, suppose the list contains
["banana", "bends", "i", "mend", "sandy"]. This list contains the following two-character pairs:
"ba", "an", "na", "an", "na" from "banana"; "be", "en", "nd", "ds" from "bends";
"me", "en", "nd" from "mend"; and "sa", "an", "nd", "dy" from "sandy".
(Note that "i" is only one character long, so it contains no pairs.)

Your method should count the occurrences of these pairs of letters and return the counts as a Map. In this case you
would return {an=3, ba=1, be=1, ds=1, dy=1, en=2, me=1, na=2, nd=3, sa=1}.

Notice that pairings that occur more than once in the same word should be counted as separate occurrences.
For example, "an" and "na" each occur twice in "banana".
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        List<String> list = List.of("banana", "bends", "i", "mend", "sandy");
        System.out.println(pairCounts(list));
    }

    public static Map<String, Integer> pairCounts(List<String> list) {
        Iterator<String> itr = list.iterator();
        Map<String, Integer> map = new HashMap<>();
        while (itr.hasNext()) {
            String word = itr.next();
            for (int i = 0; i < word.length() - 1; i++) {
                String charPair = word.substring(i, i + 2);
                if (map.containsKey(charPair)) {
                    map.put(charPair, map.get(charPair) + 1);
                } else {
                    map.put(charPair, 1);
                }
            }
        }
        return map;
    }
}
