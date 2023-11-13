package assignments.week3.chapter7;

/*
--Exercise 24--

Write a method zoomIn that accepts a DrawingPanel as a parameter and converts it into an image twice as large in both
dimensions.

Each pixel from the original image becomes a cluster of 4 pixels (2 rows and 2 columns) in the new zoomed image.

*/

import utils.DrawingPanel;

import java.awt.*;

public class ExerciseTwentyFour {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        g.setColor(Color.RED);
        g.fillRect(10, 20, 139, 241);
        g.drawOval(350, 300, 100, 100);
        zoomIn(panel);
    }

    public static void zoomIn(DrawingPanel panel){
        int height = panel.getHeight();
        int width = panel.getWidth();
        int[][] pixels = panel.getPixelsRGB();
        int[][] newPixels = new int[height * 2][width * 2];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                newPixels[row * 2][col * 2] = pixels[row][col];
                newPixels[row * 2][col * 2 + 1] = pixels[row][col];
                newPixels[row * 2 + 1][col * 2] = pixels[row][col];
                newPixels[row * 2 + 1][col * 2 + 1] = pixels[row][col];
            }
        }
        panel.setHeight(height * 2);
        panel.setWidth(width * 2);
        panel.setPixels(newPixels);
    }
}
