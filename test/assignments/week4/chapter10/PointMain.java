package assignments.week4.chapter10;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 10);
        System.out.println(p1.compareTo(p2));
        Point p3 = new Point(5, 5);
        System.out.println(p1.compareTo(p3));
        Point p4 = new Point(1, 5);
        System.out.println(p1.compareTo(p4));
    }
}
