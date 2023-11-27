package assignments.week5.chapter12;

/*
--Exercise 19--

The Cantor set is a fractal that is defined by repeatedly removing the middle thirds of line segments.

Write a program to draw the Cantor set on a DrawingPanel recursively.
*/

import utils.DrawingPanel;

import java.awt.Graphics;

public class ExerciseNineteen {
    public static final int LEVELS = 10;
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(LEVELS * 100, LEVELS * 100 + 200);
        Graphics g = panel.getGraphics();

        drawCantorSet(g, 0, 0, LEVELS * 300, LEVELS);
    }

    public static void drawCantorSet(Graphics g, int x, int y, int width, int level) {
        if (level > 0) {
            g.drawLine(x, y, x + width, y);
            y += 100;
            drawCantorSet(g, x, y, width / 3, level - 1);
            drawCantorSet(g, x + (width * 2 / 3), y, width / 3, level - 1);
        }
    }
}
