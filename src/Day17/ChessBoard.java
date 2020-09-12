package Day17;

public class ChessBoard {
    ChessPiece[][] chessPieces = new ChessPiece[8][8];

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }
    public void print() {
        for (int i = 0; i < chessPieces.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j].toString());
            }
        }
    }
}
