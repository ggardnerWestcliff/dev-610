package assignments.week2.chapter3;

/*
--Exercise 6--

Write a method called largerAbsVal that takes two integers as parameters and returns the
larger of the two absolute values. A call of largerAbsVal(11, 2) would return 11, and a call of
largerAbsVal(4, –5) would return 5.

*/

public class ExerciseSix {
    public static void main(String[] args) {
        int lAbsVal1 = largerAbsVal(11, 2);
        System.out.println(lAbsVal1);
        int lAbsVal2 = largerAbsVal(4, -5);
        System.out.println(lAbsVal2);
    }

    // Solution using Math module.
    public static int largerAbsVal(int a, int b) {
        return Math.max(Math.abs(a), Math.abs(b));
    }
}
