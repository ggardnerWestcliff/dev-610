package assignments.week2.chapter3;

/*
--Exercise 14--

Write a method called cylinderSurfaceArea that accepts a radius and height as parameters and returns the surface area
of a cylinder with those dimensions.

For example, the call cylinderSurfaceArea(3.0, 4.5) should return 141.3716694115407.

The formula for the surface area of a cylinder with radius r and height h is the following:
surface area = 2πr^2 + 2πrh

*/

public class ExerciseFourteen {
    public static void main(String[] args) {
        double surfaceArea = cylinderSurfaceArea(3.0, 4.5);
        System.out.println(surfaceArea);
    }

    public static double cylinderSurfaceArea(double radius, double height){
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }
}
