package HT_04;

import java.util.Random;

public class HT_04_6 {
    /*
    6 Создать матрицу 5х5.
Диагоняль заполнить нолями.
Элементы матрицы ниже диагонали заполнить 1.
Элементы выше диагонали зполнять -1.
     */
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int i;
        int j;

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if (i < j) {
                    array[i][j] = -1;
                } else if (i > j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
