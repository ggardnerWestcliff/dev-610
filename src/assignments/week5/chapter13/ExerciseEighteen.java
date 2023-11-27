package assignments.week5.chapter13;

/*
--Exercise 18--
Write a modified version of the selection sort algorithm that selects the largest element each time and moves it to the
end of the array, rather than selecting the smallest element and moving it to the beginning.
Will this algorithm be faster than the standard selection sort? What will its complexity class (big-Oh) be?

A: This algorithm will not be faster as it is still required to iterate over the provided array twice with a complexity
   of O(N^2).
*/

import java.util.Arrays;

public class ExerciseEighteen {
    public static void main(String[] args) {
        int[] numbers = {22, 44, 11, 88, 66, 33, 55, 77};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
	}

    public static void selectionSort(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            int largest = i;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[largest]) {
                    largest = j;
                }
            }
            swap(a, i, largest);
        }
    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
