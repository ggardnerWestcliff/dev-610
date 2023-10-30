package assignments.week1.chapter2;

/*
--Exercise Two--

Write a for loop that produces the following output:

1 4 9 16 25 36 49 64 81 100

For added challenge, try to modify your code so that it does not need to use the * multiplication operator.
(It can be done! Hint: Look at the differences between adjacent numbers.)

*/

public class ExerciseTwo {
    public static void main(String[] args) {
        int num = 0;
        int increment = 1;
        for (int i = 0; i < 10; i++) {
            num += increment;
            System.out.print(num);
            System.out.print(" ");
            increment += 2;
        }
    }
}
