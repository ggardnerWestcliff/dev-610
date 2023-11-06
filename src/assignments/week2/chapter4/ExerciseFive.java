package assignments.week2.chapter4;

/*
--Exercise 5--

Write a method called pow that accepts a base and an exponent as parameters and
returns the base raised to the given power.

For example, the call pow(3, 4) should return 3 * 3 * 3 * 3, or 81.
Assume that the base and exponent are non-negative.
*/

public class ExerciseFive {
    public static void main(String[] args) {
        System.out.println(pow(3, 4));
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
