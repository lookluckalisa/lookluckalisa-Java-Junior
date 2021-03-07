package ht_03;

public class exercise6 {
    /*
    Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
     */
    public static void main(String[] args) {
        double m = 5;
        double n = 660;
        double x;
        double y;

        if (m > 10) {
            x = m - 10;
        } else {
            x = 10 - m;
        }

        if (n > 10) {
            y = n - 10;
        } else {
            y = 10 - n;
        }

        if (x < y) {
            System.out.print("Число ближайшее к числу 10: " + m);
        } else {
            System.out.print("Число ближайшее к числу 10: " + n);
        }
    }
}
