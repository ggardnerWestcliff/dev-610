package assignments.week4.chapter9;

/*
--Exercise 14--
Add an equals method to each of the Rectangle, Circle, and Triangle classes introduced in this chapter.
Two shapes are considered equal if their fields have equivalent values.
*/

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(4, 5);
        Rectangle rectangle3 = new Rectangle(5, 4);
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.equals(rectangle3));
    }
}
