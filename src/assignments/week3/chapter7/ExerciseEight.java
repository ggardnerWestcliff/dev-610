package assignments.week3.chapter7;

/*
--Exercise 8--
Write a method called median that accepts an array of integers as its parameter and returns the median of the numbers
in the array. The median is the number that appears in the middle of the list if you arrange the elements in order.

Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the
array are between 0 and 99 inclusive.

For example, the median of [5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17] is 5 and the median of
[42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27] is 25.
(Hint: You may wish to look at the Tally program from earlier in this chapter for ideas.)
*/

public class ExerciseEight {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        System.out.println(median(arr));
        int[] arr2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println(median(arr2));
    }

    public static int median(int[] arr) {
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
        return arr[arr.length / 2];
    }
}
