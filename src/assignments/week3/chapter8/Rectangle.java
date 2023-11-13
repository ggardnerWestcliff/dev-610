package assignments.week3.chapter8;

/*
--Exercise 18--
Write a class called Rectangle that represents a rectangular two-dimensional region.
Your Rectangle objects should have the following methods:

public Rectangle(int x, int y, int width, int height)

Constructs a new Rectangle whose top-left corner is specified by the given coordinates and with the given width and
height. Throw an IllegalArgumentException on a negative width or height.

public int getHeight()
Returns this Rectangle’s height.

public int getWidth()
Returns this Rectangle’s width.

public int getX()
Returns this Rectangle’s x-coordinate.

public int getY()
Returns this Rectangle’s y-coordinate.

public String toString()
Returns a String representation of this Rectangle, such as "Rectangle[x=1,y=2,width=3, height=4]".


--Exercise 19--
Add the following constructor to your Rectangle class:

public Rectangle(Point p, int width, int height)

Constructs a new Rectangle whose top-left corner is specified by the given Point and with the given width and height.


--Exercise 20--
Add the following accessor methods to your Rectangle class:

public boolean contains(int x, int y)
public boolean contains(Point p)

Returns whether the given Point or coordinates lie inside the bounds of this Rectangle.


--Exercise 21--
Add the following method to your Rectangle class:

public Rectangle union(Rectangle rect)
Returns a new Rectangle that represents the area occupied by the tightest bounding box that contains both this Rectangle
and the given other Rectangle.


--Exercise 22--
Add the following method to your Rectangle class:

public Rectangle intersection(Rectangle rect)

Returns a new Rectangle that represents the largest rectangular region completely contained within both this Rectangle
and the given other Rectangle. If the Rectangles do not intersect at all, returns a Rectangle with width and height both
equal to 0.


--Exercise 23--
Add the following method to your Rectangle class:

public boolean contains(Rectangle rect)

Returns whether the given other rectangle lies entirely within the bounds of this rectangle.

*/

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height must be greater than 0");
        }
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point p, int width, int height) {
        this(p.getX(), p.getY(), width, height);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Exercise 20
    public boolean contains(int x, int y) {
        return x >= this.x && x <= width && y <= this.y && y >= this.y - height;
    }

    public boolean contains(Point p) {
        return contains(p.getX(), p.getY());
    }

    // Exercise 21
    public Rectangle union(Rectangle rect) {
        int left = Math.min(this.x, rect.x);
        int top = Math.min(this.y, rect.y);
        int right = Math.max(this.x + this.width, rect.x + rect.width);
        int bottom = Math.max(this.y + this.height, rect.y + rect.height);

        return new Rectangle(left, top, right - left, bottom - top);
    }

    // Exercise 22
    public Rectangle intersection(Rectangle rect) {
        int left = Math.max(this.x, rect.x);
        int top = Math.max(this.y, rect.y);
        int right = Math.min(this.x + this.width, rect.x + rect.width);
        int bottom = Math.min(this.y + this.height, rect.y + rect.height);
        int width = Math.max(0, right - left);
        int height = Math.max(0, bottom - top);

        return new Rectangle(left, top, width, height);
    }

    // Exercise 23
    public boolean contains(Rectangle rect) {
        Rectangle intersection = this.intersection(rect);
        return intersection.width == rect.width && intersection.height == rect.height;
    }

    public String toString() {
        return "Rectangle[x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
}
