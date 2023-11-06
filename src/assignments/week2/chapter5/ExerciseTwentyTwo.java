package assignments.week2.chapter5;

/*
--Exercise 22--
Write a method called allDigitsOdd that returns whether every digit of a positive integer is odd. Return true if the
number consists entirely of odd digits (1, 3, 5, 7, 9) and false if any of its digits are even (0, 2, 4, 6, 8).

For example, the call allDigitsOdd(135319) returns true but allDigitsOdd(9145293) returns false.
*/

public class ExerciseTwentyTwo {
    public static void main(String[] args) {
        System.out.println(allDigitsOdd(135319));
        System.out.println(allDigitsOdd(9145293));
        System.out.println(allDigitsOdd(-1));
        System.out.println(allDigitsOdd(0));
    }

    public static boolean allDigitsOdd(int number) {
        if (number <= 0) {
            return false;
        }
        while (number > 0) {
            if (number % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
