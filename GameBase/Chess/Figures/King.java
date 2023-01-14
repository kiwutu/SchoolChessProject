package GameBase.Chess.Figures;

import GameBase.Base.Coordinate;
import GameBase.Chess.ChessFigure;

public class King extends ChessFigure {
    public King(boolean colorIsWhite, Coordinate coordinateFrom) {      // присвоение качеств и свойств фигуры
        super(colorIsWhite, colorIsWhite ? '\u2654' : '\u265a', coordinateFrom);
    }

    @Override
    public boolean canMove(Coordinate to) {
        return Math.abs(from.getX() - to.getX()) == 1 && Math.abs(from.getY() - to.getY()) == 1 ||   //  логика ходьбы по диагонали
                Math.abs(from.getX() - to.getX()) == 0 && Math.abs(from.getY() - to.getY()) == 1 ||  //  логика ходьбы по горизонтали
                Math.abs(from.getX() - to.getX()) == 1 && Math.abs(from.getY() - to.getY()) == 0;    //  логика ходьбы по вертикали
    }
}
