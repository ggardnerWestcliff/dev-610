package assignments.week2.chapter4;

/*
--Exercise 14--

Modify your pow method from Exercise 5 to make a new method called pow2 that uses the type double for the first
parameter and that works correctly for negative numbers.
For example, the call pow2(–4.0, 3) should return –4.0 * –4.0 * –4.0, or –64.0,
and the call pow2(4.0, –2) should return 1 / 16, or 0.0625.

*/
public class ExerciseFourteen {
    public static void main(String[] args) {
        double num = pow2(-4.0, 3);
        System.out.println(num);
        double num1 = pow2(4.0, -2);
        System.out.println(num1);
    }

    public static double pow2(double base, int exponent) {
        double result = 1.0;
        if (exponent < 0) {
            for (int i = 1; i <= -exponent; i++) {
                result *= base;
            }
            result = 1 / result;
        } else {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
        }
        return result;
    }
}
