package assignments.week3.chapter7;

/*
--Exercise One--

Write a method called lastIndexOf that accepts an array of integers and an integer value as its parameters and returns
the last index at which the value occurs in the array. The method should return –1 if the value is not found.

For example, in the array [74, 85, 102, 99, 101, 85, 56], the last index of the value 85 is 5.

*/

public class ExerciseOne {
    public static void main(String[] args) {
        int[] arr = {74, 85, 102, 99, 101, 85, 56};
        System.out.println(lastIndexOf(arr, 85));
    }

    public static int lastIndexOf(int[] arr, int value) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
