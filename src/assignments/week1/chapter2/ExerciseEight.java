package assignments.week1.chapter2;

/*
--Exercise 8--

Write nested for loops to produce the following output:

    1
   22
  333
 4444
55555

*/

public class ExerciseEight {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
