package eckel.ch4.eightqueens;

public class Main {
    public static void main(String[] args) {
        QueenSolver queenSolver = new QueenSolver();
        queenSolver.init();
        queenSolver.paint(queenSolver.getGraphics());
        
    }
}
