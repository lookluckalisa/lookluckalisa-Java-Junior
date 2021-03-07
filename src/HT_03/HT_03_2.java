package HT_03;

import java.util.Scanner;

public class HT_03_2 {
    /*
    2. Вам дано неотрицательное целое число x (0 ≤ x ≤ 1000000), найдите в нем количество
десятков. Если предпоследней цифры нет, можно считать, что количество десятков равно
нулю.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите неотрицательное целое число: ");
        int x = scan.nextInt();
        if (x > 10) {
            System.out.println("Количество десятков равно " + (x / 10));
        } else {
            if (x < 0) {
                System.out.println("Проверьте правильность ввода!");
            } else {
                System.out.println("Количество десятков равно нулю");
            }
        }
    }
}
