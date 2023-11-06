package assignments.week2.chapter3;

/*
--Exercise 12--

Write a method called scientific that accepts a real number base and an exponent as parameters and computes the
base times 10 to the exponent, as seen in scientific notation.

For example, the call of scientific(6.23, 5) would return 623000.0 and the call of scientific(1.9, –2)
would return 0.019.

*/

public class ExerciseTwelve {
    public static void main(String[] args) {
        double val1 = scientific(6.23, 5);
        System.out.println(val1);

        double val2 = scientific(1.9, -2);
        System.out.println(val2);
    }

    public static double scientific(double base, int exponent) {
        return base * Math.pow(10, exponent);
    }
}
