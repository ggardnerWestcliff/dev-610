package assignments.week3.chapter7;

/*
--Exercise 11--

Write a method called isUnique that accepts an array of integers as a parameter and returns a boolean value indicating
whether the values in the array are unique (true for yes, false for no).
The values in the list are considered unique if there is no pair of values that are equal.

For example, if passed an array containing [3, 8, 12, 2, 9, 17, 43, –8, 46], your method should return true,
but if passed [4, 7, 3, 9, 12, –47, 3, 74], your method should return false because the value 3 appears twice.
*/

public class ExerciseEleven {

    public static void main(String[] args) {
        int[] arr = {3, 8, 12, 2, 9, 17, 43, -8, 46};
        System.out.println(isUnique(arr));
        int[] arr2 = {4, 7, 3, 9, 12, -47, 3, 74};
        System.out.println(isUnique(arr2));
        int[] arr3 = {};
        System.out.println(isUnique(arr3));
    }

    public static boolean isUnique(int[] arr) {
        sortArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    int c = min;
                    arr[i] = arr[j];
                    arr[j] = c;
                    min = arr[i];
                }
            }
        }
    }
}
