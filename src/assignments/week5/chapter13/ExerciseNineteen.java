package assignments.week5.chapter13;

/*
--Exercise 19--
Write a modified “dual” version of the selection sort algorithm that selects both the largest and smallest elements on
each pass and moves each of them to the appropriate end of the array.
Will this algorithm be faster than the standard
selection sort?
What predictions would you make about its performance relative to the merge sort algorithm?
What will its complexity class (big-Oh) be?

A: This algorithm will be slightly faster than the standard selection sort as it involves sorting the array from both
   ends at the same time. However, it will still have a complexity class of O(N^2) as the array needs to be iterated
   over for each value in the array.
*/

import java.util.Arrays;

public class ExerciseNineteen {
    public static void main(String[] args) {
        int[] numbers = {22, 44, 11, 88, 66, 33, 55, 77};
        dualSelectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void dualSelectionSort(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int smallest = i;
            int largest = i;
            for (int k = i; k <= j; k++) {
                if (a[k] > a[largest]) {
                    largest = k;
                } else if (a[k] < a[smallest]) {
                    smallest = k;
                }
            }
            swap(a, i, smallest);
            if (a[smallest] == a[largest]) {
                swap(a, j, smallest);
            } else {
                swap(a, j, largest);
            }
        }
    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
