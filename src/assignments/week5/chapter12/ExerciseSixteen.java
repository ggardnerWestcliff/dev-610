package assignments.week5.chapter12;

/*
--Exercise 16--
Write a recursive method called evenDigits that accepts an integer parameter and that returns the integer formed by
removing the odd digits from it.

For example, evenDigits(8342116) returns 8426 and evenDigits (-34512) returns -42.

If the number is 0 or has no even digits, such as 35159 or 7, return 0. Leading zeros in the result should be ignored.
*/

public class ExerciseSixteen {
    public static void main(String[] args) {
        System.out.println(evenDigits(8342116));
        System.out.println(evenDigits(-34512));
        System.out.println(evenDigits(35159));
    }

    public static int evenDigits(int n) {
        if (n == 0) {
            return 0;
        }
        if ((n % 10) % 2 == 0) {
            return n % 10 + evenDigits(n / 10) * 10;
        } else {
            return evenDigits(n / 10);
        }
    }
}
