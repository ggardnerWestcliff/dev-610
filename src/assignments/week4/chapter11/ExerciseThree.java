package assignments.week4.chapter11;

/*
--Exercise 3--
Write a method called removeInRange that accepts four parameters: a LinkedList, an element value, a starting index, and
an ending index.The method’s behavior is to remove all occurrences of the given element that appear in the list between
the starting index (inclusive) and the ending index (exclusive). Other values and occurrences of the given value that
appear outside the given index range are not affected.

For example, for the list [0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16], a call of
removeInRange(list, 0, 5, 13) should produce the list [0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16].
Notice that the zeros located at indexes between 5 inclusive and 13 exclusive in the original list (before any
modifications were made) have been removed.
*/

import java.util.Iterator;
import java.util.LinkedList;

public class ExerciseThree {
    public static void main(String[] args) {
        int[] nums = {0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16};
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        removeInRange(list, 0, 5, 13);
        System.out.println(list);
    }

    public static void removeInRange(LinkedList<Integer> list, int value, int start, int end) {
        Iterator<Integer> itr = list.iterator();
        int index = 0;
        while (itr.hasNext()) {
            int ele = itr.next();
            if (index >= start && index <= end && ele == value) {
                itr.remove();
            }
            index++;
        }
    }
}
