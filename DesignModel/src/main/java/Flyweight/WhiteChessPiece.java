package Flyweight;

public class WhiteChessPiece extends ChessPiece {
    @Override
    public void display(int x, int y) {
        System.out.println("显示白棋 [" + x + ", " + y + "]");
    }
}
