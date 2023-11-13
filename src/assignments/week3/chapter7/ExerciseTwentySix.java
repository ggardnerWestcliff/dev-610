package assignments.week3.chapter7;

/*
--Exercise 26--

Write a method blur that makes an image look “blurry” using the following specific algorithm. Set each pixel to be the
average of itself and the 8 pixels around it. That is, for the pixel at position (x, y), set its RGB value to be the
average of the RGB values at positions (x − 1, y − 1) through (x + 1, y + 1).

Be careful not to go out of bounds near the edge of the image; if a pixel lies along the edge of the image, average
whatever neighbors it does have.
*/

import utils.DrawingPanel;

import java.awt.*;

public class ExerciseTwentySix {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        g.setColor(Color.RED);
        g.drawOval(350, 300, 100, 100);
        panel.sleep(1000);
        blur(panel);
    }

    public static void blur(DrawingPanel panel){
        int height = panel.getHeight();
        int width = panel.getWidth();
        int[][] pixels = panel.getPixelsRGB();
        int[][] newPixels = new int[height][width];
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                int sum = 0;
                int count = 0;
                for (int k = Math.max(i - 1, 0); k <= Math.min(i + 1, height - 1); k++) {
                    sum += pixels[k][j];
                    count++;
                }
                for (int k = Math.max(j - 1, 0); k <= Math.min(j + 1, width - 1); k++) {
                    sum += pixels[i][k];
                    count++;
                }
                newPixels[i][j] = sum / count;
            }
        }
        panel.setPixels(newPixels);
    }
}
