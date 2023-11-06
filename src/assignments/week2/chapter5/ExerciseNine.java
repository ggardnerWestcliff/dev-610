package assignments.week2.chapter5;

/*
--Exercise 9--
Write a method called printFactors that accepts an integer as its parameter and uses a fencepost loop to
print the factors of that number, separated by the word "and".

For example, the factors of the number 24 should print as the following:

1 and 2 and 3 and 4 and 6 and 8 and 12 and 24

You may assume that the parameter’s value is greater than 0, or you may throw an exception if it is 0 or negative.

*/

public class ExerciseNine {
    public static void main(String[] args) {
        printFactors(24);
        printFactors(13);
        printFactors(1);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        for (int i = 1; i <= number; i++) {
            if (i == number) {
                System.out.println(i);
            } else if (number % i == 0) {
                System.out.print(i + " and ");
            }
        }
    }
}
