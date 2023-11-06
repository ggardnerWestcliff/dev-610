package assignments.week2.chapter5;

/*
--Exercise 8--
Write a method called randomWalk that performs steps of a random one-dimensional walk.
The random walk should begin at position 0. On each step, you should either increase or decrease the position by 1
(each with equal probability). Your code should continue making steps until a position of 3 or −3 is reached,
and then report the maximum position that was reached during the walk. The output should look like the following:


position = 1
position = 0
position = –1
position = –2
position = –1
position = –2
position = –3
max position = 1
*/

import java.util.Random;

public class ExerciseEight {
    public static void main(String[] args) {
        randomWalk();
    }

    public static void randomWalk() {
        Random random = new Random();
        int position = 0;
        int maxPosition = Integer.MIN_VALUE;
        int step;

        while (Math.abs(position) != 3) {
            step = random.nextInt(2);
            if (step == 0) {
                position--;
            } else {
                position++;
            }
            System.out.println("position = " + position);
            if (position > maxPosition) {
                maxPosition = position;
            }
        }
        System.out.println("max position = " + maxPosition);
    }
}
