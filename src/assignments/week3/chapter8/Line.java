package assignments.week3.chapter8;

/*
--Exercise 14--
Write a class called Line that represents a line segment between two Points.

Your Line objects should have the following methods:

public Line(Point p1, Point p2)
Constructs a new Line that contains the given two Points.

public Point getP1()
Returns this Line’s first endpoint.

public Point getP2()
Returns this Line’s second endpoint.

public String toString()
Returns a String representation of this Line, such as "[(22, 3), (4, 7)]".


--Exercise 15--
Add the following accessor method to your Line class:

public double getSlope()

Returns the slope of this Line. The slope of a line between points (x1, y1) and (x2, y2) is equal to
(y2− y1) / (x2 − x1). If x2 equals x1 the denominator is zero and the slope is undefined, so you may throw an exception
in this case.


--Exercise 16--
Add the following constructor to your Line class:

public Line(int x1, int y1, int x2, int y2)

Constructs a new Line that contains the given two Points.


--Exercise 17--
Add the following accessor method to your Line class:

public boolean isCollinear(Point p)

Returns true if the given Point is collinear with the Points of this Line—that is, if, when this Line is stretched
infinitely, it would eventually hit the given Point. Points are collinear if a straight line can be drawn that connects
them. Two basic examples are three points that have the same x- or y-coordinate. The more general case can be determined
by calculating the slope of the line between each pair of points and checking whether this slope is the same for all
pairs of points. Use the formula (y2 − y1) / (x2 − x1) to determine the slope between two points (x1, y1) and (x2, y2).
(Note that this formula fails for points with identical x-coordinates, so this will have to be a special case in your
code.) Since Java’s double type is imprecise, round all slope values to a reasonable accuracy such as four digits past
the decimal point before you compare them.
*/

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    // Exercise 14
    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }

    // Exercise 15
    public double getSlope() {
        try {
            return p1.slope(p2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean isCollinear(Point p) {
        return p1.isCollinear(p2, p);
    }
}
