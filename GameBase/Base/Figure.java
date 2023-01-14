package GameBase.Base;

public abstract class Figure {

    protected boolean isOnBoard;  // находиться ли фигура на доске
    protected char symbol;  // символ фигуры
    protected Coordinate from;  // координаты, где находиться фигура, "начальные координаты"


    public Figure(char symbol, Coordinate from) {     // возвращение всех значений фигуры
        this.isOnBoard = true;
        this.symbol = symbol;
        this.from = from;
    }

    public void moveTo(Coordinate to) {
        this.from = to;
    }  // координаты, куда пойдет фигура

}
