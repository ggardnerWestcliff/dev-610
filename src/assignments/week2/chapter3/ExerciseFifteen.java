package assignments.week2.chapter3;

/*
--Exercise 15--

Write a method called sphereVolume that accepts a radius as a parameter and returns the volume of a sphere with
that radius.

For example, the call sphereVolume(2.0) should return 33.510321638291124.

The formula for the volume of a sphere with radius r is the following:
(4/3)*pi*r^3

*/

public class ExerciseFifteen {
    public static void main(String[] args) {
        double volume = sphereVolume(2.0);
        System.out.println(volume);
    }

    public static double sphereVolume(double radius){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
