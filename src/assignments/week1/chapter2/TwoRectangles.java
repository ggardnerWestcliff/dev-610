package assignments.week1.chapter2;

/*
--Exercise 24--

Write a program called TwoRectangles that uses two integer class constants called WIDTH and HEIGHT to draw
two rectangles of stars of the given dimensions. The first rectangle should be flush left,
and the second should be indented horizontally by the given width.

For example, if the WIDTH and HEIGHT are 7 and 4 respectively, the program should draw the following figure:

*******
*******
*******
*******
       *******
       *******
       *******
       *******

*/

public class TwoRectangles {
    private static final int WIDTH = 10;
    private static final int HEIGHT = 6;
    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            printStars();
        }
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(" ");
            }
            printStars();
        }
    }

    public static void printStars() {
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
