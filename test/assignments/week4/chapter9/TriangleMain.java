package assignments.week4.chapter9;

/*
--Exercise 14--
Add an equals method to each of the Rectangle, Circle, and Triangle classes introduced in this chapter.
Two shapes are considered equal if their fields have equivalent values.
*/

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Triangle triangle3 = new Triangle(5, 6, 7);
        System.out.println(triangle1.equals(triangle2));
        System.out.println(triangle1.equals(triangle3));
    }
}
