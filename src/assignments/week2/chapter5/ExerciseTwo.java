package assignments.week2.chapter5;

/*
--Exercise 2--
Write a method called gcd that accepts two integers as parameters and returns the greatest common divisor (GCD)
of the two numbers. The GCD of two integers a and b is the largest integer that is a factor of both a and b.

One efficient way to compute the GCD of two numbers is to use Euclid’s algorithm, which states the following:
GCD(a, b) = GCD(b, a % b)
GCD(a, 0) = |a|
*/

public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
        System.out.println(gcd(12, 0));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return Math.abs(a);
    }
}
