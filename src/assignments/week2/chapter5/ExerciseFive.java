package assignments.week2.chapter5;

/*
--Exercise 5--
Write a method called randomLines that prints between 5 and 10 random strings of letters (between “a” and “z”),
one per line. Each string should have random length of up to 80 characters.
*/

import java.util.Random;

public class ExerciseFive {
    public static void main(String[] args) {
        randomLines();
    }

    public static void randomLines(){
        Random random = new Random();
        for (int i = 0; i < random.nextInt(5) + 5; i++) {
            System.out.println(generateRandomString(random));
        }
    }

    public static String generateRandomString(Random random){
        String str = "";
        for (int i = 0; i < random.nextInt(80) + 1; i++) {
            str += generateRandomLetter(random);
        }
        return str;
    }

    public static char generateRandomLetter(Random random){
        return (char) (random.nextInt(26) + 97);
    }
}
