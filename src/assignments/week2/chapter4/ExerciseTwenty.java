package assignments.week2.chapter4;

/*
--Exercise 20--

Write a method called numUnique that takes three integers as parameters and returns the number of unique
integers among the three.

For example, the call numUnique(18, 3, 4) should return 3 because the parameters have three different values.
By contrast, the call numUnique(6, 7, 6) should return 2 because there are only two unique numbers
among the three parameters: 6 and 7.
*/

public class ExerciseTwenty {
    public static void main(String[] args) {
        System.out.println(numUnique(18, 3, 4));
        System.out.println(numUnique(6, 7, 6));
        System.out.println(numUnique(1, 1, 1));
    }

    public static int numUnique(int a, int b, int c) {
        int count = 0;
        if (a != b) {
            count++;
        }
        if (a != c) {
            count++;
        }
        if (b != c) {
            count++;
        }
        if (a == b && b == c) {
            count++;
        }
        return count;
    }
}
