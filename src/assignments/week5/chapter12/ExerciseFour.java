package assignments.week5.chapter12;

/*
--Exercise 4--
Write a recursive method called doubleDigits that accepts an integer n as a parameter and returns the integer obtained
by replacing every digit of n with two of that digit.

For example, doubleDigits(348) should return 334488.
The call doubleDigits(0) should return 0.

Calling doubleDigits on a negative number should return the negation of calling doubleDigits on the corresponding
positive number; for example, doubleDigits(–789) should return –778899.
*/

public class ExerciseFour {
    public static void main(String[] args) {
        System.out.println(doubleDigits(348));
        System.out.println(doubleDigits(0));
        System.out.println(doubleDigits(-789));
    }

    public static int doubleDigits(int n) {
        if (n < 0) {
            return -doubleDigits(-n);
        }
        if (n < 10) {
            return n * 10 + n;
        }
        return doubleDigits(n / 10) * 100 + doubleDigits(n % 10);
    }
}
