package GameBase.Base;

public class Coordinate {
    private int x, y; // координаты, как описание свойств фигуры

    public Coordinate(int x, int y) {  // инициализация координат, чтобы с ними работать
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    public int getX() {
        return x;
    }  // возвращение значения х

    public int getY() {
        return y;
    }  // возвращение значения у
}
