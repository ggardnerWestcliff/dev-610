package assignments.week3.chapter7;

/*
--Exercise 2--

Write a method called range that returns the range of values in an array of integers. The range is defined as 1 more
than the difference between the maximum and minimum values in the array.

For example, if an array called list contains the values [36, 12, 25, 19, 46, 31, 22],
the call of range(list) should return 35 (46 - 12 + 1).
You may assume that the array has at least one element.
*/
public class ExerciseTwo {
    public static void main(String[] args) {
        int[] arr = {36, 12, 25, 19, 46, 31, 22};
        System.out.println(range(arr));
    }

    public static int range(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        return max - min + 1;
    }
}
