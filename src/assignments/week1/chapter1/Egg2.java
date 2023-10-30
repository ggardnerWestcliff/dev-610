package assignments.week1.chapter1;

/*
--Exercise 10--

Modify the program from the previous exercise to become a new program Egg2 that displays the following output.
Use static methods as appropriate.

  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/

*/

public class Egg2 {
    public static void main(String[] args) {
        drawTopShell();
        drawBottomShell();
        drawShellCrack();
        drawTopShell();
        drawBottomShell();
        drawShellCrack();
        drawBottomShell();
        drawTopShell();
        drawShellCrack();
        drawBottomShell();
    }

    public static void drawTopShell() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void drawBottomShell() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void drawShellCrack() {
        System.out.println("-\"-'-\"-'-\"-");
    }
}
