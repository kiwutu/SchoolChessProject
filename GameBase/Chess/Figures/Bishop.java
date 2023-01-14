package GameBase.Chess.Figures;

import GameBase.Base.Coordinate;
import GameBase.Chess.ChessFigure;

public class Bishop extends ChessFigure {
    public Bishop(boolean colorIsWhite, Coordinate coordinateFrom) {      // присвоение качеств и свойств фигуры
        super(colorIsWhite, colorIsWhite ? '\u2657' : '\u265d', coordinateFrom);
    }

    @Override
    public boolean canMove(Coordinate to) {     //  логика ходьбы по диагонали
        return Math.abs(from.getX() - to.getX()) == Math.abs(from.getY() - to.getY()) && Math.abs(from.getX() - to.getX()) != 0 ;
    }
}


