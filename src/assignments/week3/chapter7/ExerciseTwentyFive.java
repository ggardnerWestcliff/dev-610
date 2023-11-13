package assignments.week3.chapter7;

/*
--Exercise 25--

Write methods rotateLeft and rotateRight that rotate the pixels of an image counter-clockwise or clockwise by 90 degrees
respectively. You should not assume that the image is square in shape; its width and height might be different.
*/


import utils.DrawingPanel;

import java.awt.Color;
import java.awt.Graphics;

public class ExerciseTwentyFive {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        g.setColor(Color.RED);
        g.fillRect(200, 150, 100, 200);
        g.drawOval(350, 300, 100, 100);
        panel.sleep(1000);
        rotateRight(panel);
        panel.sleep(1000);
        rotateLeft(panel);
    }

    public static void rotateRight(DrawingPanel panel){
        int[][] pixels = panel.getPixelsRGB();
        int[][] newPixels = new int[panel.getWidth()][panel.getHeight()];

        int width = panel.getWidth();
        int height = panel.getHeight();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                newPixels[j][width - i - 1] = pixels[i][j];
            }
        }
        panel.setPixels(newPixels);
    }

    public static void rotateLeft(DrawingPanel panel){
        int[][] pixels = panel.getPixelsRGB();
        int[][] newPixels = new int[panel.getWidth()][panel.getHeight()];

        int width = panel.getWidth();
        int height = panel.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = height - 1; j > 0; j--) {
                newPixels[height - j][i] = pixels[i][j];
            }
        }
        panel.setPixels(newPixels);
    }
}
