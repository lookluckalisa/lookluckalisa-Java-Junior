package HT_03;

import java.util.Scanner;

public class HT_03_3 {
    /*
        3. Вам дается двузначное число. Выведите его первую цифру (то есть количество десятков).
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите двузначное целое число от 10 до 99: ");
        int x = scan.nextInt();
        if (x > 9 && x < 100) {
            System.out.println("Количество десятков равно " + (x / 10));
        } else {
            System.out.println("Проверьте правильность ввода!");
        }
    }
}
