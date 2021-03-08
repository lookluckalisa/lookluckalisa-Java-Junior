package HT_04;

import java.util.Random;

public class HT_04_7 {
    /*
    7 Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Проверить, чтобы не было повторяющихся чисел. Если какое-то число повторяется, то заменить на то,
которого еще нет.
     */

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] ints = new int[10];
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
            int index = array[i];
            if (ints[index] == 0) continue;
            for (int j = 0; j < ints.length; j++) {
                if (j == index) continue;
                if (ints[j] == 0) continue;
                array[i] = ints[j];
                ints[j] = 0;
            }
        }
        Utils.prnArr(array);
    }
}
