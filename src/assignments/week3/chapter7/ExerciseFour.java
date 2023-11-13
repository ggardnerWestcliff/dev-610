package assignments.week3.chapter7;

/*
--Exercise 4--

Write a method called isSorted that accepts an array of real numbers as a parameter and returns true if the list is in
sorted (non-decreasing) order and false otherwise.

For example, if arrays named list1 and list2 store [16.1, 12.3, 22.2, 14.4] and [1.5, 4.3, 7.0, 19.5, 25.1, 46.2]
respectively, the calls isSorted(list1) and isSorted(list2) should return false and true respectively.

Assume the array has at least one element. A one-element array is considered to be sorted.
*/

public class ExerciseFour {
    public static void main(String[] args) {
        double[] arr = {16.1, 12.3, 22.2, 14.4};
        System.out.println(isSorted(arr));

        double[] arr2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(arr2));

        double[] arr3 = {1.0};
        System.out.println(isSorted(arr3));
    }

    public static boolean isSorted(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
