package assignments.week5.chapter12;

/*
--Exercise 5--
Write a recursive method called writeBinary that accepts an integer as a parameter and writes its binary representation
to the console.

For example, writeBinary(44) should print 101100.
*/

public class ExerciseFive {
    public static void main(String[] args) {
        writeBinary(44);
    }

    public static void writeBinary(int n) {
        if (n == 0) {
            return;
        }
        writeBinary(n / 2);
        System.out.print(n % 2);
    }
}
