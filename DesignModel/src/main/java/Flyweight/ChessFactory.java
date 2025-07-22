package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {
    private static final Map<String, ChessPiece> chessMap = new HashMap<>();

    public static ChessPiece getChessPiece(String color) {
        ChessPiece piece = chessMap.get(color);
        if (piece == null) {
            switch (color.toLowerCase()) {
                case "black":
                    piece = new BlackChessPiece();
                    break;
                case "white":
                    piece = new WhiteChessPiece();
                    break;
                default:
                    throw new IllegalArgumentException("未知棋子颜色：" + color);
            }
            chessMap.put(color, piece);
        }
        return piece;
    }
}

