package assignments.week2.chapter5;

/*
--Exercise 10--
Write a method called hopscotch that accepts an integer number of “hops” as its parameter and prints a pattern of
numbers that resembles a hopscotch board.
A “hop” is a three-number sequence where the output shows two numbers on a line, followed by one number on its own line.
0 hops is a board up to 1;
one hop is a board up to 4;
two hops is a board up to 7;
and so on.

For example, the call of hopscotch(3); should print the following output:

   1
2     3
   4
5     6
   7
8     9
  10
A call of hopscotch(0); should print only the number 1.
If it is passed a negative value, the method should produce no output.

*/

public class ExerciseTen {
    public static void main(String[] args) {
        hopscotch(6);
    }

    public static void hopscotch(int hops){
        int num = 1;
        System.out.println("   " + num);
        while (hops > 0) {
            System.out.println(num + 1 + "     " + (num + 2));
            num += 3;
            System.out.println("   " + num);
            hops--;
        }
    }
}
