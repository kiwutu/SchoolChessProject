package GameBase.Chess.Figures;

import GameBase.Base.Coordinate;
import GameBase.Chess.ChessFigure;

public class Knight extends ChessFigure {
    public Knight(boolean colorIsWhite, Coordinate coordinateFrom) {      // присвоение качеств и свойств фигуры
        super(colorIsWhite, colorIsWhite ? '\u2658' : '\u265e', coordinateFrom);
    }

    @Override
    public boolean canMove(Coordinate to) {       //  логика ходьбы буквой "г"
        return (Math.abs(from.getX() - to.getX()) == 1 && Math.abs(from.getY() - to.getY()) == 2) ||
                (Math.abs(from.getX() - to.getX()) == 2 && Math.abs(from.getY() - to.getY()) == 1);
    }
}
