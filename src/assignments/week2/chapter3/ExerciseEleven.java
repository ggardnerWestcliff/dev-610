package assignments.week2.chapter3;

/*
--Exercise 11--

Write a method called distance that accepts four integer coordinates x1, y1, x2, y2 as parameters and computes
the distance between points (x1, y1) and (x2, y2) on the Cartesian plane.

The equation for the distance is d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
For example, the call of distance(1, 0, 4, 4) would return 5.0 and the call of distance(10, 2, 3, 15)
would return 14.7648230602334.

*/

public class ExerciseEleven {
    public static void main(String[] args) {
        double distance = distance(1, 0, 4, 4);
        System.out.println(distance);

        double distance2 = distance(10, 2, 3, 15);
        System.out.println(distance2);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
