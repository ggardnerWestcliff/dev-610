package assignments.week2.chapter4;

/*
--Exercise 19--

Write a method called quadrant that accepts as parameters a pair of double values representing an (x, y) point and
returns the quadrant number for that point.
Recall that quadrants are numbered as integers from 1 to 4 with the upper-right quadrant numbered 1 and the
subsequent quadrants numbered in a counterclockwise fashion.

Notice that the quadrant is determined by whether the x and y coordinates are positive or negative numbers.
Return 0 if the point lies on the x- or y-axis.

For example, the call of quadrant(-2.3, 3.5) should return 2 and the call of quadrant(4.5, -4.5) should return 4.

*/

public class ExerciseNineteen {
    public static void main(String[] args) {
        System.out.println(quadrant(-2.3, 3.5));
        System.out.println(quadrant(4.5, -4.5));
        System.out.println(quadrant(0, 1));
        System.out.println(quadrant(-1, -1));
        System.out.println(quadrant(1, 1));
    }

    public static int quadrant(double x, double y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        if (x > 0 && y > 0) {
            return 1;
        }
        if (x < 0 && y > 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        return 4;
    }
}
