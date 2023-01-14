package GameBase.Chess.Figures;

import GameBase.Base.Coordinate;
import GameBase.Chess.ChessFigure;

public class Rook extends ChessFigure {
    public Rook(boolean colorIsWhite, Coordinate coordinateFrom) {          // присвоение качеств и свойств фигуры
        super(colorIsWhite, colorIsWhite ? '\u2656' : '\u265c', coordinateFrom);
    }

    @Override
    public boolean canMove(Coordinate to) {

        return Math.abs(from.getX() - to.getX()) >= 1 && Math.abs(from.getX() - to.getX()) <= 8 && Math.abs(from.getY() - to.getY()) == 0 ||      //  логика ходьбы по горизонтали
                Math.abs(from.getY() - to.getY()) >= 1 && Math.abs(from.getY() - to.getY()) <= 8 && Math.abs(from.getX() - to.getX()) == 0;     //  логика ходьбы по вертикали
    }
}
