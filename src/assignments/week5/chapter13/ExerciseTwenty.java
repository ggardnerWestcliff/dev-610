package assignments.week5.chapter13;

/*
--Exercise 20--
Implement an algorithm to shuffle an array of numbers or objects. The algorithm for shuffling should be the following:


for (each index i) {
    choose a random index j where j >= i.
    swap the elements at indexes i and j.
}
*/

import java.util.Arrays;

public class ExerciseTwenty {
    public static void main(String[] args) {
        int[] numbers = {22, 44, 11, 88, 66, 33, 55, 77};
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
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
