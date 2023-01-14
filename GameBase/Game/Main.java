package GameBase.Game;

import GameBase.Base.Coordinate;
import GameBase.Chess.ChessBoard;
import GameBase.Chess.ChessGame;
import GameBase.Chess.Figures.King;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static private ChessGame chessGame;
    static private boolean isEndGame;    // конец игры (правда/лож)
    static public int stepCounter;  // счетчик ходов
    static private Coordinate[] coor;  // координаты

    static {
        isEndGame = false;
        stepCounter = 0;
        coor = new Coordinate[2];
    }

    public static void main(String[] args) {   // запуск игры
        newGame();
        while (!isEndGame) {
            showMessage();
            checkAnswer(readAnswer());
            makeStep();
        }
    }

    static private void newGame() {   // запуск новой игры
        chessGame = ChessGame.getInstance();
        chessGame.newGame();
    }

    static private void showMessage() {                          // сообщение в консоли
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println("Напишите \"exit\" чтобы закончить игру!");
        System.out.println("Следующий ходят " + ANSI_YELLOW + (((stepCounter + 1) % 2 == 1) ? "Белые" : "Черные") + ANSI_RESET);
        System.out.println("Напишите по образцу: 'A1-A2' или 'A1A2'");
        System.out.println("Счетчик ходов: " + stepCounter);
    }
    static private String readAnswer() {   // считыватель ответа пользователя
        return (new Scanner(System.in)).nextLine().toLowerCase();
    }
    static private void checkAnswer(String st) {                   // читатель ответа пользователя
        if (st.equals("exit")) {
            endGame();
        } else {
            isInputCorrectStep(st);
            showStepMessage(st);
        }
    }
    static private void makeStep() {
        chessGame.makeStep(coor);
    }   // ход
    static private void endGame() {                               // конец игры
        System.out.println("Спасибо за игру! Пока!!! Пока!!!");
        isEndGame = true;
    }

    static public void end_Game(){
        endGame();
    }

    static private void isInputCorrectStep(String st) {          // проверка на правильность введенных данных
        coor = new Coordinate[2];
        char[] data = st.toCharArray();
        System.out.println(Arrays.toString(data));
        if (!(data.length == 4 || data.length == 5)) {
            System.out.println("Неверный ввод данных");
            stepCounter--;
        } else {
            int t = 0;
            for (int i = 0; i < 2; i++) {
                if ((data[i * 2 + t] >= 'a' && data[i * 2 + t] <= 'h')
                        && (data[i * 2 + 1 + t] >= '1' && data[i * 2 + 1 + t] <= '8'))
                    coor[i] = new Coordinate(data[i * 2 + t] - 'a', data[i * 2 + 1 + t] - '1');
                if (data.length == 5) t++;
            }
        }
    }

    static private void showStepMessage(String st) {        // сообщение в консоли
        System.out.println((((stepCounter) % 2 == 0) ? "Белые " : "Черные ") + ", вы сходили на: " + st);
        System.out.println("Координаты на поле:" + Arrays.toString(coor));
    }
}