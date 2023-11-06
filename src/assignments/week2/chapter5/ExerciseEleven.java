package assignments.week2.chapter5;

/*
--Exercise 11--
Write a method called threeHeads that repeatedly flips a coin until the results of the coin toss are three heads
in a row. You should use a Random object to make it equally likely that a head or a tail will appear.
Each time the coin is flipped, display H for heads or T for tails. When three heads in a row are flipped,
the method should print a congratulatory message. Here is a possible output of a call to the method:


T T H T T T H T H T H H H
Three heads in a row!
*/

import java.util.Random;

public class ExerciseEleven {
    public static void main(String[] args) {
        threeHeads();
    }

    public static void threeHeads(){
        Random random = new Random();
        int counter = 0;
        int val;
        while (counter < 3){
            val = random.nextInt(2);
            if (val == 0){
                System.out.print("H ");
                counter++;
            } else {
                System.out.print("T ");
                counter = 0;
            }
        }
        System.out.println("\nThree heads in a row!");
    }
}
