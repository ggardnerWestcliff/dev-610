package assignments.week2.chapter5;

/*
--Exercise 6--

Write a method called makeGuesses that guesses numbers between 1 and 50 inclusive until it makes a guess of at least 48.
It should report each guess and at the end should report the total number of guesses made.

Here is a sample execution:

guess = 43
guess = 47
guess = 45
guess = 27
guess = 49
total guesses = 5

*/

import java.util.Random;

public class ExerciseSix {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses(){
        int guess = 0;
        int guesses = 0;
        Random random = new Random();
        while (guess < 48){
            guesses++;
            guess = random.nextInt(50) + 1;
            System.out.println("guess = " + guess);
        }
        System.out.println("total guesses = " + guesses);
    }
}
