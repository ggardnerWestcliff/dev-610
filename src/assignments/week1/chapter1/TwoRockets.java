package assignments.week1.chapter1;

/*
--Exercise 11--

Write a Java program called TwoRockets that generates the following output.
Use static methods to show structure and eliminate redundancy in your solution.
Note that there are two rocket ships next to each other.

Questions:
1. What redundancy can you eliminate using static methods?
    A: The redundancies for drawing the box and cone shapes for each rocket can be eliminated,
       calling the drawBoxes and drawCones methods multiple times to draw the same shape.
2. What redundancy cannot be eliminated?
    A: Due to the side-by-side nature of two rockets, the redundancy of drawing duplicated shapes laterally could not
       be eliminated as each line needs to be printed sequentially, without being able to return to a previous line.

   /\       /\
  /  \     /  \
 /    \   /    \
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
|United| |United|
|States| |States|
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
   /\       /\
  /  \     /  \
 /    \   /    \

*/

public class TwoRockets {
    public static void main(String[] args) {
        drawCones();
        drawBoxes();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        drawBoxes();
        drawCones();
    }

    public static void drawCones() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void drawBoxes() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
}
