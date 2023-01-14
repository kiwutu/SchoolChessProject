package GameBase.Chess;

import GameBase.Base.Coordinate;
import GameBase.Base.Figure;
import GameBase.Base.Movable;

public abstract class ChessFigure extends Figure implements Movable {
    protected boolean colorIsWhite; // цвет фигуры правда = белые, лож = черные

    public ChessFigure(boolean colorIsWhite, char symbol, Coordinate coordinateFrom) {    // присвоение всех значений фигуры
        super(symbol, coordinateFrom);
        this.colorIsWhite = colorIsWhite;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }

    public boolean isColorIsWhite() {
        return colorIsWhite;
    }
}
