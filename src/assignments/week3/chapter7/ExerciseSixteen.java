package assignments.week3.chapter7;

/*
--Exercise 16--

Write a method called append that accepts two integer arrays as parameters and returns a new array that contains the
result of appending the second array’s values at the end of the first array. For example, if arrays list1 and list2
store [2, 4, 6] and [1, 2, 3, 4, 5] respectively, the call of append(list1, list2) should return a new array containing
[2, 4, 6, 1, 2, 3, 4, 5]. If the call instead had been append(list2, list1), the method would return an array containing
[1, 2, 3, 4, 5, 2, 4, 6].

*/

import java.util.Arrays;

public class ExerciseSixteen {
    public static void main(String[] args) {
        int[] list1 = {2, 4, 6};
        int[] list2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(append(list1, list2)));
        System.out.println(Arrays.toString(append(list2, list1)));
    }

    public static int[] append(int[] a1, int[] a2) {
        int[] newArr = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            newArr[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            newArr[a1.length + i] = a2[i];
        }
        return newArr;
    }
}
