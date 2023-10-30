package assignments.week1.chapter2;

/*
--Exercise 7--

Write nested for loops to produce the following output:

    1
   2
  3
 4
5

*/

public class ExerciseSeven {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
