package assignments.week3.chapter7;

/*
--Exercise 5--

Write a method called mode that returns the most frequently occurring element of an array of integers.
Assume that the array has at least one element and that every element in the array has a value between 0 and 100
inclusive. Break ties by choosing the lower value.

For example, if the array passed contains the values [27, 15, 15, 11, 27], your method should return 15.
(Hint: You may wish to look at the Tally program from this chapter to get an idea how to solve this problem.)
Can you write a version of this method that does not rely on the values being between 0 and 100?

*/

public class ExerciseFive {

    public static void main(String[] args) {
        int[] arr = {27, 15, 15, 11, 27};
        System.out.println(mode(arr));
        int[] arr2 = {27, 15, 15, 11, 11, 27};
        System.out.println(mode(arr2));
    }

    public static int mode(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minValue = Math.min(arr[i], minValue);
            maxValue = Math.max(arr[i], maxValue);
        }

        int[] counterArr = new int[maxValue - minValue + 1];
        for (int i = 0; i < arr.length; i++) {
            counterArr[arr[i] - minValue]++;
        }

        int count = 0;
        int mode = maxValue + 1;

        for (int j = 0; j < counterArr.length; j++) {
            if (counterArr[j] > count) {
                count = counterArr[j];
                mode = j + minValue;
            }
        }
        return mode;
    }
}
