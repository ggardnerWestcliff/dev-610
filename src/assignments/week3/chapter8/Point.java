package assignments.week3.chapter8;

/*
--Exercise 1--

Add the following accessor method to the Point class:

public int quadrant()
Returns which quadrant of the x/y plane the current Point object falls in.
Quadrant 1 contains all points whose x and y values are both positive.
Quadrant 2 contains all points with negative x but positive y.
Quadrant 3 contains all points with negative x and y values.
Quadrant 4 contains all points with positive x but negative y.

If the point lies directly on the x and/or y axes, return 0.


--Exercise 2--

Add the following mutator method to the Point class:

public void flip()
Negates and swaps the x / y coordinates of the Point object.
For example, if an object pt initially represents the point (5, −3), after a call of pt.flip(); the object should
represent (3, −5). If the same object initially represents the point (4, 17), after a call to pt.flip(); the object
should represent (−17, −4).


--Exercise 3--
Add the following accessor method to the Point class:

public int manhattanDistance(Point other)
Returns the “Manhattan distance” between the current Point object and the given other Point object.
The Manhattan distance refers to the distance between two places if one can travel between them only by moving
horizontally or vertically, as though driving on the streets of Manhattan. In our case, the Manhattan distance is the
sum of the absolute values of the differences in their coordinates; in other words, the difference in x plus the
difference in y between the points.


--Exercise 4--
Add the following accessor method to the Point class:

public boolean isVertical(Point other)
Returns true if the given Point lines up vertically with this Point, that is, if their x-coordinates are the same.


--Exercise 5--
Add the following accessor method to the Point class:

public double slope(Point other)
Returns the slope of the line drawn between this Point and the given other Point. Use the formula (y2 − y1) / (x2 − x1)
to determine the slope between two points (x1, y1) and (x2, y2). Note that this formula fails for points with identical
x-coordinates, so throw an IllegalArgumentException in this case.


--Exercise 6--
Add the following accessor method to the Point class:

public boolean isCollinear(Point p1, Point p2)

Returns whether this Point is collinear with the given two other Points. Points are collinear if a straight line can be
drawn that connects them. Two basic examples are three points that have the same x- or y-coordinate. The more general
case can be determined by calculating the slope of the line between each pair of points and checking whether this slope
is the same for all pairs of points. Use the formula (y2 − y1) / (x2 − x1) to determine the slope between two points
(x1, y1) and (x2, y2). (Note that this formula fails for points with identical x-coordinates so this will have to be a
special case in your code.) Since Java’s double type is imprecise, round all slope values to a reasonable accuracy such
as four digits past the decimal point before you compare them.

*/

public class Point {
    private int x;
    private int y;

    public Point(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Exercise 1.
    public int quadrant() {
        if (this.x > 0 && this.y > 0) {
            return 1;
        }
        if (this.x < 0 && this.y > 0) {
            return 2;
        }
        if (this.x < 0 && this.y < 0) {
            return 3;
        }
        if (this.x > 0 && this.y < 0) {
            return 4;
        }
        return 0;
    }

    // Exercise 2.
    public void flip() {
        int temp = this.x;
        this.x = this.y;
        this.y = temp;

        System.out.println("x: " + this.x + " y: " + this.y);
    }

    // Exercise 3.
    public int manhattanDistance(Point other) {
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }

    // Exercise 4.
    public boolean isVertical(Point other) {
        return this.x == other.x;
    }

    // Exercise 5.
    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException("Points cannot have identical x-coordinates.");
        }
        return (this.y - other.y) * 1.0 / (this.x - other.x);
    }

    // Exercise 6.
    public boolean isCollinear(Point p1, Point p2) {
        if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
            return true;
        } else {
            double slope1 = Math.round(10000.0 * this.slope(p1)) / 10000.0;
            double slope2 = Math.round(10000.0 * this.slope(p2)) / 10000.0;
            return slope1 == slope2;
        }
    }
}
