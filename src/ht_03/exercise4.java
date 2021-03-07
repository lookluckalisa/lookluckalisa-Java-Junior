package ht_03;

import java.util.Scanner;

public class exercise4 {
    /*
4. Вам дано трехзначное целое число (то есть целое число от 100 до 999). Найдите сумму его
цифр.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите трехзначное целое число от 100 до 999 ");
        int x = scan.nextInt();
        if (x > 99 && x < 1000) {
            System.out.println("Сумма цифр введенного числа равна " + (x / 100 + ((x % 10) % 10) + ((x % 100) % 10)));
        } else {
            System.out.println("Проверьте правильность ввода!");
        }
    }
}
