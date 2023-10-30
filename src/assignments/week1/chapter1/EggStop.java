package assignments.week1.chapter1;

/*
--Exercise 15--

Write a Java program called EggStop that generates the following output.
Use static methods to show structure and eliminate redundancy in your solution.

  _______
 /       \
/         \
\         /
 \_______/
\         /
 \_______/
+-------+
  _______
 /       \
/         \
|   STOP  |
\         /
 \_______/
  _______
 /       \
/         \
+---------+

*/

public class EggStop {
    public static void main(String[] args) {
        drawEgg();
        drawEggBottom();
        System.out.println("+-------+");
        drawEggStop();
        drawEggTop();
        System.out.println("+---------+");
    }

    public static void drawEgg() {
        drawEggTop();
        drawEggBottom();
    }

    public static void drawEggStop() {
        drawEggTop();
        System.out.println("|   STOP  |");
        drawEggBottom();
    }

    public static void drawEggTop() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void drawEggBottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

}
