package assignments.week3.chapter7;

/*
--Exercise 18--

Write a method called evenBeforeOdd that accepts an array of integers and rearranges its elements so that all even
values appear before all odds. For example, if the array is [5, 4, 2, 11, 9, 10, 4, 7, 3], then after the method has
been called, one acceptable ordering of the elements would be [4, 2, 10, 4, 5, 11, 9, 7, 3]. The exact order of the
elements does not matter, so long as all even values appear before all odd values. The array might contain no even
elements or no odd elements.

Do not use any temporary arrays in your solution, and do not call Arrays.sort.

*/

import java.util.Arrays;

public class ExerciseEighteen {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 11, 9, 10, 4, 7, 3};
        System.out.println(Arrays.toString(evenBeforeOdd(arr)));
    }

    public static int[] evenBeforeOdd(int[] arr) {
        int even = 0;
        int odd = arr.length - 1;
        while (even < odd) {
            if (arr[even] % 2 == 0) {
                even++;
            } else {
                int c = arr[even];
                arr[even] = arr[odd];
                arr[odd] = c;
                odd--;
            }
        }
        return arr;
    }
}
