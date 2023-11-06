package assignments.week2.chapter4;

/*
--Exercise 1--

Write a method called fractionSum that accepts an integer parameter n and returns as a double the sum of the first n
terms of the sequence

n
∑1/i
i=1
In other words, the method should generate the following sequence:
1 + 1/2 + 1/3 + 1/4 + 1/5...

You may assume that the parameter n is non-negative.

*/

public class ExerciseOne {
    public static void main(String[] args) {
        double fracSum = fractionSum(5);
        System.out.println(fracSum);
    }

    public static double fractionSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
