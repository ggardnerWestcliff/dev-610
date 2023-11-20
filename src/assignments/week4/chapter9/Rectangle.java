package assignments.week4.chapter9;

/*
--Exercise 14--
Add an equals method to each of the Rectangle, Circle, and Triangle classes introduced in this chapter.
Two shapes are considered equal if their fields have equivalent values.
*/

// Represents rectangle shapes.
public class Rectangle implements Shape {
    private double width;
    private double height;
    
    // Constructs a new rectangle with the given dimensions.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Returns the area of this rectangle.
    public double getArea() {
        return width * height;
    }
    
    // Returns the perimeter of this rectangle.
    public double getPerimeter() {
        return 2.0 * (width + height);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return width == other.width && height == other.height;
        }
        return false;
    }
}
