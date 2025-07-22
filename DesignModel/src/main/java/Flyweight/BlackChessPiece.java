package Flyweight;

public class BlackChessPiece extends ChessPiece {
    @Override
    public void display(int x, int y) {
        System.out.println("显示黑棋 [" + x + ", " + y + "]");
    }
}
