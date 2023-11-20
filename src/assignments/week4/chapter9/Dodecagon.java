package assignments.week4.chapter9;

/*
--Exercise 17--
Write a class named Dodecagon whose objects represent regular dodecagons (12-sided polygons).
Your class should implement the Shape interface defined in this chapter.
A Dodecagon object is defined by its side length as passed to its constructor.
The common formulas for the area and perimeter of a regular dodecagon are based on its circumradius, which is the radius
of the smallest circle that would fully contain the dodecagon. We suggest reading about these formulas on a web site
such as Wikipedia or Wolfram MathWorld.
 */

public class Dodecagon implements Shape {
    private final double sideLength;
    public Dodecagon(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return 3 * Math.pow(sideLength, 2) * (2 + Math.sqrt(3));
    }

    public double getPerimeter() {
        return sideLength * 12;
    }
}
