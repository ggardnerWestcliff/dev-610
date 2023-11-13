package assignments.week3.chapter7;

/*
--Exercise 13--

Write a method called longestSortedSequence that accepts an array of integers as a parameter and returns the length of
the longest sorted (nondecreasing) sequence of integers in the array.

For example, in the array [3, 8, 10, 1, 9, 14, –3, 0, 14, 207, 56, 98, 12], the longest sorted sequence in the array
has four values in it (the sequence −3, 0, 14, 207), so your method would return 4 if passed this array.
Sorted means non-decreasing, so a sequence could contain duplicates.
Your method should return 0 if passed an empty array.
*/

public class ExerciseThirteen {
    public static void main(String[] args) {
        int[] arr = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
        System.out.println(longestSortedSequence(arr));
        int[] arr2 = {};
        System.out.println(longestSortedSequence(arr2));
    }

    public static int longestSortedSequence(int[] arr) {
        int longestSequence = 0;
        int seqCounter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                seqCounter++;
            } else {
                longestSequence = Math.max(longestSequence, seqCounter + 1);
                seqCounter = 0;
            }
        }
        return Math.max(longestSequence, seqCounter);
    }
}
