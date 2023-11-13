package assignments.week3.chapter7;

/*
--Exercise 10--

Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of even
numbers in the array as a real number.
For example, if the array stores the elements [6, 2, 9, 11, 3], then your method should return 40.0.
If the array contains no even elements or no elements at all, return 0.0.

*/

public class ExerciseTen {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 11, 3};
        System.out.println(percentEven(arr));
    }

    public static double percentEven(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return (count * 100.0) / arr.length;
    }
}
