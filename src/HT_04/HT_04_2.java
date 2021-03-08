package HT_04;

import java.util.Arrays;
import java.util.Random;

public class HT_04_2 {
/*
2 Создать массив интов длинной 10. Заполнить рандомно от 0 до 9 (включительно).
Отсортировать первую половину массива по убыванию, вторую половину по возрастанию.
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
        //Сортируем первю половину по убыванию с помощью алгоритма пузырьковой сортировки
        for (int a = 1; a < array.length / 2; a++) {
            for (int b = array.length / 2 - 1; b >= a; b--) {
                if (array[b - 1] < array[b]) { // если требуемый порядок
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }

        System.out.print("Oтcopтиpoвaнный массив с 1-ой половиной по убыванию:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();

        //Сортируем первую половину по возрастанию с помощью алгоритма пузырьковой сортировки
        for (int a = 6; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }

        System.out.print("Oтcopтиpoвaнный массив со 2-ой половиной по возрастанию:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

    }
}