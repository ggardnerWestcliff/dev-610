package assignments.week4.chapter9;

/*
--Exercise 14--
Add an equals method to each of the Rectangle, Circle, and Triangle classes introduced in this chapter.
Two shapes are considered equal if their fields have equivalent values.
*/

// Represents circle shapes.
public class Circle implements Shape {
    private double radius;
    
    // Constructs a new circle with the given radius.
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Returns the area of this circle.
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    // Returns the perimeter of this circle.
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return radius == other.radius;
        }
        return false;
    }
}
