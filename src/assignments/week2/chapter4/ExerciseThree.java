package assignments.week2.chapter4;

/*
--Exercise 3--

Write a method called season that takes as parameters two integers representing a month and day and returns a
String indicating the season for that month and day. Assume that the month is specified as an integer
between 1 and 12 (1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31.
If the date falls between 12/16 and 3/15, the method should return "winter".
If the date falls between 3/16 and 6/15, the method should return "spring".
If the date falls between 6/16 and 9/15, the method should return "summer".
And if the date falls between 9/16 and 12/15, the method should return "fall".
*/

public class ExerciseThree {
    public static void main(String[] args) {
        String s = season(12, 16);
        System.out.println(s);
    }

    public static String season(int month, int day) {
        if ((month == 12 && day >= 16) || month < 3 || (month == 3 && day <= 15)) {
            return "winter";
        } else if (month == 3 || month == 4 || month == 5 || (month == 6 && day <= 15)) {
            return "spring";
        } else if (month == 6 || month == 7 || month == 8 || (month == 9 && day <= 15)) {
            return "summer";
        } else {
            return "fall";
        }
    }
}
