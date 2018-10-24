package eckel.ch4.eightqueens;

import java.awt.*;

public class Queen {

    private int row;
    private int column;
    private Queen neighbor;

    Queen(int column, Queen neighbor) {
        row = 1;
        this.column = column;
        this.neighbor = neighbor;
    }

    public boolean findSolution() {
        while (neighbor != null && neighbor.canAttack(row, column)) {
            if (!advance()) {
                return false;
            }
        }
        return true;
    }

    boolean advance() {
        if (row < 8) {
            row++;
            return findSolution();
        }
        if (neighbor != null && !neighbor.advance()) {
            return false;
        }
        row = 1;
        return findSolution();
    }

    private boolean canAttack(int testRow, int testColumn) {
        int columnDifference;
        /*Проверка на ту же строку*/
        if (row == testRow) {
            return true;
        }
        /*Проверка диагонали*/
        columnDifference = testColumn - column;
        if (row + columnDifference == testRow || row - columnDifference == testRow) {
            return true;
        }
        /*Мы не можем бить, а соседи?*/
        return neighbor.canAttack(testRow, testColumn);
    }

    public void paint(Graphics g) {
        // x, y — левый верхний угол
        int x = (row - 1) * 50;
        int y = (column - 1) * 50;
        g.drawLine(x + 5, y + 45, x + 45, y + 45);
        g.drawLine(x + 5, y + 45, x + 5, y + 5);
        g.drawLine(x + 45, y + 45, x + 45, y + 5);
        g.drawLine(x + 5, y + 35, x + 45, y + 35);
        g.drawLine(x + 5, y + 5, x + 15, y + 20);
        g.drawLine(x + 15, y + 20, x + 25, y + 5);
        g.drawLine(x + 25, y + 5, x + 35, y + 20);
        g.drawLine(x + 35, y + 20, x + 45, y + 5);
        g.drawLine(x + 20, y + 20, 10, 10);

        // затем рисуем соседа
        if (neighbor != null) {
            neighbor.paint(g);
        }
    }
}
