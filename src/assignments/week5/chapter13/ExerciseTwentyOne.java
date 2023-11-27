package assignments.week5.chapter13;

/*
--Exercise 21--
Implement a “bogus” sorting algorithm called bogo sort that uses your shuffling algorithm from the previous exercise to
sort an array of numbers. The bogo sort algorithm is the following:


while (array is not sorted) {
    shuffle array.
}

Obviously, this is not a very efficient sorting algorithm, but it eventually does shuffle the array into order if you
let it run long enough. Try running it on a very small array, such as 8 or 10 elements, to examine its runtime.
What is your best guess about the complexity class (big-Oh) of this silly algorithm?

A: The worst case complexity of the bogo sort algorithm is infinite as the algorithm could in theory continue to run
   without ever finding a sorted array.
*/

import java.util.Arrays;

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        int[] numbers = {22, 44, 11, 88, 66, 33, 55, 77};
        bogoSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void bogoSort(int[] list) {
        while (!isSorted(list)) {
            shuffle(list);
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int j = (int) (Math.random() * (i + 1));
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}
