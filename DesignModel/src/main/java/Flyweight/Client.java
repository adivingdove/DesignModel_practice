package Flyweight;

public class Client {
    public static void main(String[] args) {
        ChessPiece black1 = ChessFactory.getChessPiece("black");
        ChessPiece black2 = ChessFactory.getChessPiece("black");
        ChessPiece white1 = ChessFactory.getChessPiece("white");

        black1.display(2, 3);
        white1.display(5, 7);
        black2.display(4, 6);

        System.out.println("black1 == black2 ? " + (black1 == black2));
    }
}
