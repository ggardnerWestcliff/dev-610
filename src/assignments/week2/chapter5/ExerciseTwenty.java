package assignments.week2.chapter5;

/*
--Exercise 20--

Write a method called digitRange that accepts an integer as a parameter and returns the range of values of its digits.
The range is defined as 1 more than the difference between the largest and smallest digit value.
For example, the call of digitRange(68437) would return 6 because the largest digit value is 8 and the smallest is 3, so
8 − 3 + 1 = 6.
If the number contains only one digit, return 1. You should solve this problem without using a String.
*/

public class ExerciseTwenty {
    public static void main(String[] args) {
        System.out.println(digitRange(68437));
        System.out.println(digitRange(1));
        System.out.println(digitRange(-68437));
    }

    public static int digitRange(int number) {
        int cleanNumber = Math.abs(number);
        int largestDigit = Integer.MIN_VALUE;
        int smallestDigit = Integer.MAX_VALUE;
        while (cleanNumber > 0) {
            int digit = cleanNumber % 10;
            largestDigit = Math.max(largestDigit, digit);
            smallestDigit = Math.min(smallestDigit, digit);
            cleanNumber /= 10;
        }
        return largestDigit - smallestDigit + 1;
    }
}
