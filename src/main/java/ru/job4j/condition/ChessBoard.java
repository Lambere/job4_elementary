package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int raznostKoordinat1 = Math.abs((x2 - y2));
        int raznostKoordinat = Math.abs((x1 - y1));
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (x1 != x2 && (y1 != y2)) {
                rsl = Math.abs(y2 - y1);
            }
            if (raznostKoordinat != raznostKoordinat1) {
                rsl = 0;
            }

        }
        return rsl;

  }




    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}