package assignments.week2.chapter3;

/*
--Exercise 7--

Write a variation of the largestAbsVal method from the last exercise that takes three integers as parameters
and returns the largest of their three absolute values. For example, a call of largestAbsVal(7, –2, –11)
would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.

*/

public class ExerciseSeven {
    public static void main(String[] args) {
        int largestAbsVal = largestAbsVal(7, -2, -11);
        System.out.println(largestAbsVal);
        int largestAbsVal2 = largestAbsVal(-4, 5, 2);
        System.out.println(largestAbsVal2);
    }

    public static int largestAbsVal(int num1, int num2, int num3) {
        return Math.max(Math.abs(num1), Math.max(Math.abs(num2), Math.abs(num3)));
    }
}
