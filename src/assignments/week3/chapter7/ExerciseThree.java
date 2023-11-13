package assignments.week3.chapter7;

/*
--Exercise 3--

Write a method called countInRange that accepts an array of integers, a minimum value, and a maximum value as parameters
and returns the count of how many elements from the array fall between the minimum and maximum (inclusive).

For example, in the array [14, 1, 22, 17, 36, 7, –43, 5],
for minimum value 4 and maximum value 17, there are four elements whose values fall between 4 and 17.
*/

public class ExerciseThree {
    public static void main(String[] args) {
        int[] arr = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(arr, 4, 17));
    }

    public static int countInRange(int[] arr, int min, int max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                count++;
            }
        }
        return count;
    }
}
