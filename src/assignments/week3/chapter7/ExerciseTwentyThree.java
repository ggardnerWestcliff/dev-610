package assignments.week3.chapter7;

/*
--Exercise 23--

Write a method transpose that accepts a DrawingPanel as a parameter and inverts the image about both the x and y axes.

You may assume that the image is square, that is, that its width and height are equal.

*/

import utils.DrawingPanel;

import java.awt.*;

public class ExerciseTwentyThree {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        g.setColor(Color.RED);
        g.fillRect(10, 20, 139, 241);
        g.drawOval(350, 300, 100, 100);
        transpose(panel);
    }

    public static void transpose(DrawingPanel panel) {
        int width  = panel.getWidth();
        int height = panel.getHeight();
        int[][] pixels = panel.getPixelsRGB();
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width / 2; col++) {
                int col2 = width - 1 - col;
                int row2 = height - 1 - row;
                int temp = pixels[row][col];
                pixels[row][col] = pixels[row2][col2];
                pixels[row2][col2] = temp;
            }
        }
        panel.setPixels(pixels);
    }
}
