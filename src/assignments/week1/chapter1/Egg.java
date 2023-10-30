package assignments.week1.chapter1;

/*
--Exercise 9--
Write a program called Egg that displays the following output:

   _______
  /       \
 /          \
 -"-'-"-'-"-
 \          /
  \_______/

*/

public class Egg {
    public static void main(String[] args) {
        drawTopShell();
        drawShellCrack();
        drawBottomShell();
    }

    public static void drawTopShell() {
        System.out.println("   _______");
        System.out.println("  /       \\");
        System.out.println(" /          \\");
    }

    public static void drawBottomShell() {
        System.out.println(" \\          /");
        System.out.println("  \\_______/");
    }

    public static void drawShellCrack() {
        System.out.println(" -\"-'-\"-'-\"-");
    }
}
