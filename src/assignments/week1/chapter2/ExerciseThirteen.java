package assignments.week1.chapter2;

/*
--Exercise 13--

Modify the code (from ExerciseTwelve) so that it now produces the following output:

99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000

*/

public class ExerciseThirteen {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 9; j >= 0; j--) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
