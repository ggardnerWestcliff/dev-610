package assignments.week4.chapter9;

/*
--Exercise 15--
Write a class named Octagon whose objects represent regular octagons (eight-sided polygons).
Your class should implement the Shape interface defined in this chapter, including methods for its area and perimeter.
An Octagon object is defined by its side length. (You may need to search online to find formulas for the area and
perimeter of a regular octagon.)
 */

public class Octagon implements Shape{
    private final double sideLength;
    public Octagon(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2);
    }

    public double getPerimeter() {
        return 8 * sideLength;
    }
}
