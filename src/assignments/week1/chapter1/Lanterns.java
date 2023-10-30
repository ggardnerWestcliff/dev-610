package assignments.week1.chapter1;

/*
--Exercise 14--

Write a Java program called Lanterns that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****

*/

public class Lanterns {
    public static void main(String[] args) {
        drawPyramid();
        System.out.println();
        drawLantern1();
        System.out.println();
        drawLantern2();
    }

    public static void drawLantern1() {
        drawPyramid();
        drawLight();
        drawPyramidBase();
        drawPyramid();
    }

    public static void drawLantern2() {
        drawPyramid();
        drawPyramidTop();
        drawLight();
        drawLight();
        drawPyramidTop();
        drawPyramidTop();
    }

    public static void drawPyramid() {
        drawPyramidTop();
        System.out.println("  *********");
        drawPyramidBase();
    }

    public static void drawPyramidTop() {
        System.out.println("    *****");
    }

    public static void drawPyramidBase() {
        System.out.println("*************");
    }

    public static void drawLight() {
        System.out.println("* | | | | | *");
    }
}
