package assignments.week1.chapter2;

/*
--Exercise 1--

In physics, a common useful equation for finding the position `s` of a body in linear motion at a given time `t`,
based on its initial position `s0`, initial velocity `v0`, and rate of acceleration, is the following:
s = s0 + v0*t + (a*t^2)/2

Write code to declare variables for `s0`, `v0`, `a0`, and t, and then write the code to compute `s`
on the basis of these values.

*/

public class ExerciseOne {
    public static void main(String[] args) {
        double s0 = 10.5;
        double v0 = 3.2;
        double a0 = 4.1;
        double t = 4;

        double s = s0 + v0 * t + (a0 * t * t)/2;
        System.out.println(s);
    }
}
