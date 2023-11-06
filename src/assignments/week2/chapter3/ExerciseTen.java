package assignments.week2.chapter3;

/*
--Exercise 10--

Write a method called area that accepts as a parameter the radius of a circle and that returns the area of the circle.
For example, the call area(2.0) should return 12.566370614359172. Recall that area can be computed as pi times the
radius squared and that Java has a constant called Math.PI.
*/

public class ExerciseTen {
    public static void main(String[] args) {
        double area = area(2.0);
        System.out.println(area);
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
}
