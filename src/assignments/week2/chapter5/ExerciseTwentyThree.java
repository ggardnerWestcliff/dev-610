package assignments.week2.chapter5;

/*
--Exercise 23--
Write a method called hasAnOddDigit that returns whether a given positive integer has at least one digit whose value is
odd. Return true if the number has at least one odd digit and false if none of its digits are odd.

For example, the call hasAnOddDigit(4822116) should return true and hasAnOddDigit(2448) should return false.
*/

public class ExerciseTwentyThree {
    public static void main(String[] args) {
        System.out.println(hasAnOddDigit(4822116));
        System.out.println(hasAnOddDigit(2448));
        System.out.println(hasAnOddDigit(-1));
        System.out.println(hasAnOddDigit(0));
    }

    public static boolean hasAnOddDigit(int number) {
        if (number <= 0) {
            return false;
        }
        while (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
