package assignments.week1.chapter1;

/*
--Exercise 13--

Write a Java program called StarFigures that generates the following output.
Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *

*/

public class StarFigures {
    public static void main(String[] args) {
        drawStarFigure1();
        System.out.println();
        drawStarFigure2();
        System.out.println();
        drawStarFigure3();
    }

    public static void drawStarFigure1() {
        drawStarLines();
        drawDoubleStar();
        drawSingleStar();
        drawDoubleStar();
    }

    public static void drawStarFigure2() {
        drawStarFigure1();
        drawStarLines();
    }

    public static void drawStarFigure3() {
        drawSingleStar();
        drawSingleStar();
        drawSingleStar();
        drawStarFigure1();
    }

    public static void drawStarLines() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void drawSingleStar() {
        System.out.println("  *");
    }

    public static void drawDoubleStar() {
        System.out.println(" * *");
    }
}
