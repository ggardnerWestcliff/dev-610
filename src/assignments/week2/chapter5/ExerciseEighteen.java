package assignments.week2.chapter5;

/*
--Exercise 18--
Write a method called digitSum that accepts an integer as a parameter and returns the sum of the digits of that number.
For example, the call digitSum(29107) returns 2 + 9 + 1 + 0 + 7 or 19.
For negative numbers, return the same value that would result if the number were positive.
For example, digitSum(-456) returns 4 + 5 + 6 or 15.
The call digitSum(0) returns 0.

*/

public class ExerciseEighteen {
    public static void main(String[] args) {
        System.out.println(digitSum(29107));
        System.out.println(digitSum(-456));
        System.out.println(digitSum(0));
    }

    public static int digitSum(int number) {
        int sum = 0;
        int cleanNumber = Math.abs(number);
        while (cleanNumber > 0) {
            sum += cleanNumber % 10;
            cleanNumber /= 10;
        }
        return sum;
    }
}
