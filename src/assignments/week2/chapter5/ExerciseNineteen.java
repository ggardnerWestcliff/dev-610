package assignments.week2.chapter5;

/*
--Exercise 19--
Write a method called firstDigit that returns the first (most significant) digit of an integer. For example,
firstDigit(3572) should return 3. It should work for negative numbers as well; firstDigit(-947) should return 9.
*/

public class ExerciseNineteen {
    public static void main(String[] args) {
        System.out.println(firstDigit(3572));
        System.out.println(firstDigit(-947));
        System.out.println(0);
    }

    public static int firstDigit(int number) {
        int cleanNumber = Math.abs(number);
        while (cleanNumber > 9) {
            cleanNumber /= 10;
        }
        return cleanNumber;
    }
}
