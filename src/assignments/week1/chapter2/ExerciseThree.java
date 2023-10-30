package assignments.week1.chapter2;

/*
--Exercise 3--

The Fibonacci numbers are a sequence of integers in which the first two elements are 1,
and each following element is the sum of the two preceding elements.

The first 12 Fibonacci numbers are

1 1 2 3 5 8 13 21 34 55 89 144

Write a for loop that computes and prints the first 12 Fibonacci numbers.
*/

public class ExerciseThree {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");

        for (int i = 0; i < 10; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c);
            System.out.print(" ");
        }
    }
}
