package assignments.week5.chapter13;

/*
--Exercise 13--
Write a Comparator that compares Point objects by their distance from the origin of (0, 0). 
Points that are closer to the origin are considered to come before those which are further from the origin.
*/



public class Point implements Comparable<Point> {
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

    public void flip() {
        int temp = this.x;
        this.x = this.y;
        this.y = temp;

        System.out.println("x: " + this.x + " y: " + this.y);
    }

    public int manhattanDistance(Point other) {
        return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }

    public boolean isVertical(Point other) {
        return this.x == other.x;
    }

    public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException("Points cannot have identical x-coordinates.");
        }
        return (this.y - other.y) * 1.0 / (this.x - other.x);
    }

    public boolean isCollinear(Point p1, Point p2) {
        if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
            return true;
        } else {
            double slope1 = Math.round(10000.0 * this.slope(p1)) / 10000.0;
            double slope2 = Math.round(10000.0 * this.slope(p2)) / 10000.0;
            return slope1 == slope2;
        }
    }

    public int compareTo(Point o) {
        return Double.compare(this.distanceFromOrigin(), o.distanceFromOrigin());
    }
}

