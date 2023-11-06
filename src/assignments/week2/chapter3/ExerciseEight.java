package assignments.week2.chapter3;

/*
--Exercise 8--

Write a method called quadratic that solves quadratic equations and prints their roots.
Recall that a quadratic equation is a polynomial equation in terms of a variable `x` with the form `ax^2 + bx + c = 0`.

The formula for solving a quadratic equation is
x = (-b +/- sqrt(b^2 - 4ac)) / 2a

Your method should accept the coefficients `a`, `b`, and `c` as parameters and should print the roots of the equation.
You may assume that the equation has two real roots, though mathematically this is not always the case.

*/

public class ExerciseEight {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
    }

    public static void quadratic(int a, int b, int c) {
        double innerSqrt = Math.sqrt(b * b - 4 * a * c);
        double y1 = (-b + innerSqrt) / (2 * a);
        double y2 = (-b - innerSqrt) / (2 * a);
        System.out.println(y1);
        System.out.println(y2);
    }

}
