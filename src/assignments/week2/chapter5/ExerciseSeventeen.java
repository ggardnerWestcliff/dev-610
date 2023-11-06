package assignments.week2.chapter5;

/*
Write a method called monthApart that accepts four integer parameters, m1, d1, m2, d2, representing two calendar dates.
Each date consists of a month (1 through 12) and a day (1 through the number of days in that month [28–31]).
Assume that all parameter values passed are valid.

The method should return true if the dates are at least a month apart and false otherwise.

For example, the call of monthApart(4, 15, 5, 22) would return true
while the call of monthApart(9, 19, 10, 17) would return false.

Assume that all the dates in this problem occur during the same year.

Note that the first date could come before or after the second date.
*/

public class ExerciseSeventeen {
    public static void main(String[] args) {
        System.out.println(monthApart(4, 15, 5, 22));
        System.out.println(monthApart(9, 19, 10, 17));
    }

    public static boolean monthApart(int m1, int d1, int m2, int d2) {
        if (Math.abs(m1 - m2) > 1) {
            return true;
        } else if (m1 == m2) {
            return false;
        } else if (m1 > m2) {
            return d1 >= d2;
        } else {
            return d1 <= d2;
        }
    }
}
