package assignments.week2.chapter3;

/*
--Exercise 9--

Write a method called lastDigit that returns the last digit of an integer.
For example, lastDigit(3572) should return 2.
It should work for negative numbers as well. For example, lastDigit(-947) should return 7.

*/

public class ExerciseNine {
    public static void main(String[] args) {
        int a = lastDigit(3572);
        System.out.println(a);
        int b = lastDigit(-947);
        System.out.println(b);
    }

    public static int lastDigit(int num) {
        return Math.abs(num % 10);
    }
}
