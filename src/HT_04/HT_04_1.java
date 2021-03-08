package HT_04;

import java.util.Arrays;
import java.util.Random;

public class HT_04_1 {
    /*
    1 Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Удалить 5й элемент.
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        //Создаём новый массив  и уменьшаем его длину на единицу

        int[] newArray = new int[array.length - 1];

        //Перезаписываем массив, пропуская пятый элемент

        for (int i = 0, k = 0; i < array.length; i++) {

            if (i == 5) {
                continue;
            }
            newArray[k++] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}

