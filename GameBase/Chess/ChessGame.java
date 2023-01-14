package GameBase.Chess;

import GameBase.Base.Coordinate;

public class ChessGame {
    private final ChessBoard board; // экземпляр класса ChessBoard
    public static ChessGame instance;  // экземпляр класса ChessGame
    private ChessGame() {
        board = ChessBoard.getInstance();
    }
    public static ChessGame getInstance() {   // если игра не запущена создается новая игра
        if (instance == null) instance = new ChessGame();
        return instance;
    }
    public void newGame() {     // создается новая игра
        board.newField();
        this.showBoard();
    }
    public void makeStep(Coordinate[] coor) {    // реализация координат и ходьбы фигур
        if (board.canMove(coor[0], coor[1]))
            board.move(coor[0], coor[1]);
        this.showBoard();
    }
    public void showBoard() {
        System.out.println(board);
    }  //  показать игровую доску
}