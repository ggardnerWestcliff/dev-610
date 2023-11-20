package assignments.week4.chapter10;

/*
--Exercise 17--
Write a method called interleave that accepts two ArrayLists of integers a1 and a2 as parameters and inserts the
elements of a2 into a1 at alternating indexes. If the lists are of unequal length, the remaining elements of the longer
list are left at the end of a1. For example, if a1 stores [10, 20, 30] and a2 stores [4, 5, 6, 7, 8], the call of
interleave(a1, a2); should change a1 to store [10, 4, 20, 5, 30, 6, 7, 8]. If a1 had stored [10, 20, 30, 40, 50] and a2
had stored [6, 7, 8], the call of interleave(a1, a2); would change a1 to store [10, 6, 20, 7, 30, 8, 40, 50].
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        interleave(a1, a2);
        System.out.println(a1);
    }

    public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int minLength = Math.min(a1.size(), a2.size());
        int i;

        for (i = 0; i < minLength; i++) {
            int num = a2.get(i);
            a1.add(2 * i + 1, num);
        }

        if (i < a2.size()) {
            for (int j = i; j < a2.size(); j++) {
                a1.add(a2.get(j));
            }
        }
    }
}
