package GameBase.Chess;

import GameBase.Base.Coordinate;

public class ChessGame {
    private final ChessBoard board;; // кземпляр класса ChessBoard
    public static ChessGame instance;  //кземпляр класса ChessGame

    private ChessGame() {
        board = ChessBoard.getInstance();
    }

    public static ChessGame getInstance() {
        if (instance == null) instance = new ChessGame();
        return instance;
    }

    public void newGame() {
        board.newField();
        this.showBoard();
    }

    public void makeStep(Coordinate[] coor) {
        if (board.canMove(coor[0], coor[1]))
            board.move(coor[0], coor[1]);
        this.showBoard();
    }

    public void showBoard() {
        System.out.println(board);
    }
}