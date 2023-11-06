package assignments.week2.chapter4;

/*
--Exercise 13--
Write a method called average that takes two integers as parameters and returns the average of the two integers.
*/

public class ExerciseThirteen {
    public static void main(String[] args) {
        double avg = average(5, 10);
        System.out.println(avg);
    }

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }
}
