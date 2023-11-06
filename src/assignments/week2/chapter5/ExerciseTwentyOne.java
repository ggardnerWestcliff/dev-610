package assignments.week2.chapter5;

/*
--Exercise 21--
Write a method called swapDigitPairs that accepts an integer n as a parameter and returns a new integer whose value is
similar to n’s but with each pair of digits swapped in order. For example, the call of swapDigitPairs(482596)
would return 845269. Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8. If the number contains
an odd number of digits, leave the leftmost digit in its original place.

For example, the call of swapDigitPairs(1234567) would return 1325476.

You should solve this problem without using a String.
*/

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        System.out.println(swapDigitPairs(482596));
        System.out.println(swapDigitPairs(1234567));
        System.out.println(swapDigitPairs(-482596));
        System.out.println(swapDigitPairs(0));
    }

    public static int swapDigitPairs(int number) {
        int cleanNumber = Math.abs(number);
        int exp = 1;
        int result = 0;
        while (cleanNumber >= 10) {
            int digitOne = cleanNumber % 10;
            cleanNumber /= 10;
            int digitTwo = cleanNumber % 10;
            cleanNumber /= 10;
            int swappedDigitPair = digitOne * (int) Math.pow(10, exp) + digitTwo * (int) Math.pow(10, exp - 1);
            result += swappedDigitPair;
            exp += 2;
        }
        result += cleanNumber * Math.pow(10, exp -1);
        return result;
    }
}
