package assignments.week5.chapter12;

/*
--Exercise 18--
The Sierpinski carpet is a fractal that is defined as follows:

The construction of the Sierpinski carpet begins with a square.
The square is cut into nine congruent subsquares in a 3-by-3 grid, with the central subsquare removed.
The same process is then applied recursively to the eight other subsquares.

Write a program to draw the carpet on a DrawingPanel recursively.

*/

import utils.DrawingPanel;

import java.awt.Color;
import java.awt.Graphics;

public class ExerciseEighteen {
    public static final int LEVELS = 10;
    public static void main(String[] args) throws InterruptedException {
        DrawingPanel panel = new DrawingPanel(500, 500);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLACK);
        drawSierpinskiCarpet(g, 0, 0, 500, 500, LEVELS);
    }

    public static void drawSierpinskiCarpet(Graphics g, int x, int y, int width, int height, int level) {
        int newX = (width / 3) + x;
        int newY = (height / 3) + y;
        int newWidth = width / 3;
        int newHeight = height / 3;
        g.fillRect(newX, newY, newWidth, newHeight);
        if (level > 0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int subX = i * (width / 3) + x;
                    int subY = j * (height / 3) + y;
                    drawSierpinskiCarpet(g, subX, subY, newWidth, newHeight, level - 1);
                }
            }
        }
    }
}
