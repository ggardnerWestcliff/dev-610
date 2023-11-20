package assignments.week4.chapter9;

/*
--Exercise 14--
Add an equals method to each of the Rectangle, Circle, and Triangle classes introduced in this chapter.
Two shapes are considered equal if their fields have equivalent values.
*/

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(10);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));
    }
}
