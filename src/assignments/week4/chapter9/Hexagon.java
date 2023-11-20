package assignments.week4.chapter9;

/*
--Exercise 16--
Write a class named Hexagon whose objects represent regular hexagons (6-sided polygons).
Your class should implement the Shape interface defined in this chapter.
 */

public class Hexagon implements Shape {
    private final double sideLength;
    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return 3 * Math.sqrt(3) * Math.pow(sideLength, 2) / 2;
    }

    public double getPerimeter() {
        return 6 * sideLength;
    }
}
