package assignments.week3.chapter7;

/*
--Exercise 22--

Write a method grayscale that converts a color image into a black-and-white image. This is done by averaging the red,
green, and blue components of each pixel. For example, if a pixel has RGB values of (red=100, green=30, blue=80),
the average of the three components is (100 + 30 + 80) / 3 = 70, so that pixel becomes (red=70, green=70, blue=70).

*/

import java.util.Arrays;

public class ExerciseTwentyTwo {
    public static void main(String[] args) {
        int[] rgb = {100, 30, 80};
        System.out.println(Arrays.toString(grayscale(rgb)));
    }

    public static int[] grayscale(int[] rgb){
        int[] avgRgb = new int[rgb.length];
        int sum = 0;
        for (int i = 0; i < rgb.length; i++) {
            sum += rgb[i];
        }
        int avg = sum / rgb.length;
        for (int i = 0; i < rgb.length; i++) {
            avgRgb[i] = avg;
        }
        return avgRgb;
    }
}
