package assignments.week3.chapter7;

/*
--Exercise 9--

Write a method called minGap that accepts an integer array as a parameter and returns the minimum difference or gap
between adjacent values in the array, where the gap is defined as the later value minus the earlier value.

For example, in the array [1, 3, 6, 7, 12], the first gap is 2 (3 - 1), the second gap is 3 (6 - 3), the third gap is
1 (7 - 6) and the fourth gap is 5 (12 - 7).

So your method should return 1 if passed this array. The minimum gap could be a negative number if the list is not in
sorted order. If you are passed an array with fewer than two elements, return 0.
*/

public class ExerciseNine {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 12};
        System.out.println(minGap(arr));
    }

    public static int minGap(int[] arr) {
        int minGap = Integer.MAX_VALUE;
        if (arr.length < 2) {
            return 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            minGap = Math.min(minGap, arr[i + 1] - arr[i]);
        }
        return minGap;
    }
}
