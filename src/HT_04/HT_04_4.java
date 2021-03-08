package HT_04;

import java.util.Random;

public class HT_04_4 {
    /*
        4 Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Каждый 3й элемент заменить на 3.
         */
    public static void main(String[] args) {

        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }

        System.out.print("Начальный массив:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) {
                array[i] = 3;
            }
        }
        System.out.println();
        System.out.print("Новый массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
