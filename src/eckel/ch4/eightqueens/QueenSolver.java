package eckel.ch4.eightqueens;

import java.applet.Applet;
import java.awt.*;

public class QueenSolver extends Applet {
    private Queen lastQueen;

    public void init() {
        lastQueen = null;
        for (int i = 1; i <= 8; i++)

        {
            lastQueen = new Queen(i, lastQueen);
            lastQueen.findSolution();
        }
    }

    public void paint(Graphics g) { // рисуем доску
        for (int i = 0; i <= 8; i++) {
            g.drawLine(50 * i, 0, 50 * i, 400);
            g.drawLine(0, 50 * i, 400, 50 * i);
        }
        // рисуем ферзей
        lastQueen.paint(g);
    }

    public boolean mouseDown(java.awt.Event evt, int x,
                             int y) {
        // найти и напечатать следующее решение
        lastQueen.advance();
        repaint();
        return true;
    }
}
