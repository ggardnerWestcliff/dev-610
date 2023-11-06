package assignments.week2.chapter4;

/*
--Exercise 21--

Write a method called perfectNumbers that accepts an integer maximum as its parameter and prints all “perfect numbers”
up to and including that maximum. A perfect number is an integer that is equal to the sum of its proper factors,
that is, all numbers that evenly divide it other than 1 and itself. For example, 28 is a perfect number because
1+2+4+7+14=28.
The call perfectNumbers(500); should produce the following output:

Perfect numbers up to 500: 6 28 496
*/

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        perfectNumbers(500);
        perfectNumbers(-1);
        perfectNumbers(0);
    }

    public static void perfectNumbers(int max) {
        System.out.print("Perfect numbers up to " + max + ": ");
        if (max < 0) {
            System.out.println("None");
            return;
        }
        String numbers = "";
        for (int i = 1; i <= max; i++) {
            int sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                numbers += i + " ";
            }
        }
        if (numbers.length() == 0) {
            System.out.println("None");
        }
        System.out.println(numbers);
    }
}
