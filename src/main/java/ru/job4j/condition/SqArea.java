package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        double result2 = SqArea.square(12, 2);
        double result3 = SqArea.square(4, 1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        System.out.println(" p = 12, k = 2, s = 8, real = " + result2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result3);
    }
}