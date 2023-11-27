package assignments.week5.chapter12;

/*
--Exercise 10--
Write a recursive method called digitMatch that accepts two nonnegative integers as parameters and that returns the
number of digits that match between them. Two digits match if they are equal and have the same position relative to the
end of the number (i.e., starting with the ones digit). In other words, the method should compare the last digits of
each number, the second-to-last digits of each number, the third-to-last digits of each number, and so forth, counting
how many pairs match.

For example, for the call of digitMatch(1072503891, 62530841), the method would compare as
follows, and return 4 because four of the pairs match (2-2, 5-5, 8-8, and 1-1).

1 0 7 2 5 0 3 8 9 1
    | | | | | | | |
    6 2 5 3 0 8 4 1

*/

public class ExerciseTen {
    public static void main(String[] args) {
        System.out.println(digitMatch(1072503891, 62530841));
    }

    public static int digitMatch(int num1, int num2) {
        if (num1 == 0 && num2 == 0){
            return 0;
        }
        if (num1 % 10 == num2 % 10 && num1 > 0 && num2 > 0) {
            return 1 + digitMatch(num1 / 10, num2 / 10);
        }
        return digitMatch(num1 / 10, num2 / 10);
    }
}
