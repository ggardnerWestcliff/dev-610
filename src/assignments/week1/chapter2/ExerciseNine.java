package assignments.week1.chapter2;

/*
--Exercise Nine--
Write nested for loops to produce the following output, with each line 40 characters wide:

----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------

*/

public class ExerciseNine {
    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print("_-^-");
        }
        System.out.println();
        for (int k = 1; k <= 20; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print(k % 10);
            }
        }
        System.out.println();
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
    }
}
