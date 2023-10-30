package assignments.week1.chapter2;

/*
--Exercise 14--

Modify the code so that it now produces the following output:

999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

*/

public class ExerciseFourteen {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 9; j >= 1; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
