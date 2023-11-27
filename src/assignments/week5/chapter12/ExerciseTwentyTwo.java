package assignments.week5.chapter12;

/*
--Exercise 22--

Write a recursive method called subsets to find every possible sub-list of a given list. A sub-list of a list L
contains 0 or more of L’s elements. Your method should accept a list of strings as its parameter and print every
sub-list that could be created from elements of that list, one per line.

For example, if the list stores [Janet, Robert, Morgan, Char], the output from your method would be:

[Janet, Robert, Morgan, Char]
[Janet, Robert, Morgan]
[Janet, Robert, Char]
[Janet, Robert]
[Janet, Morgan, Char]
[Janet, Morgan]
[Janet, Char]
[Janet]
[Robert, Morgan, Char]
[Robert, Morgan]
[Robert, Char]
[Robert]
[Morgan, Char]
[Morgan]
[Char]
[]
The order in which you show the sub-lists does not matter, and the order of the elements of each sub-list also
does not matter. The key thing is that your method should produce the correct overall set of sub-lists as its output.
Notice that the empty list is considered one of these sub-lists.
You may assume that the list passed to your method is not null and that the list contains no duplicates.
Do not use any loops.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseTwentyTwo {
    public static void main(String[] args) {
        String[] tmp = {"Janet", "Robert", "Morgan", "Char"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(tmp));
        subsets(words);
    }

    public static void subsets(List<String> list) {
        subsets(list, 0, list.size());
    }

    public static void subsets(List<String> list, int start, int end) {
        if (end == 0) {
            System.out.println(list);
        } else {
            subsets(list, start + 1, end - 1);
            String word = list.remove(start);
            subsets(list, start, end - 1);
            list.add(start, word);
        }
    }
}
