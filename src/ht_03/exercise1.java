package ht_03;

import java.util.Scanner;

public class exercise1 {
    /*
    1. Вычисляет следующее выражение: 100 - (2 * (n + 3) * n - 7) * n + 3,где. n - натуральное число,
      вводится из консоли
      */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = scan.nextInt();
        if (n > 0) {
            System.out.println("Результат операции: " + (100 - (2 * (n + 3) * n - 7) * n + 3));
        } else {
            System.out.println("Проверьте правильность ввода!");
        }
    }
}
