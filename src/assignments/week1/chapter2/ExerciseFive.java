package assignments.week1.chapter2;

/*
--Exercise 5--

Write nested for loops to produce the following output:

*
**
***
****
*****

*/

public class ExerciseFive {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
