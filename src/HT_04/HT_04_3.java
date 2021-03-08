package HT_04;

import java.util.Random;

public class HT_04_3 {
    /*
3 Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Заменить все четные на 0, нечетные на 1.
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
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }

        System.out.print("Новый массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
