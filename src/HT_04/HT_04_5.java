package HT_04;

import java.util.Random;

public class HT_04_5 {
    /*
    5 Создать матрицу 5х5. Заполнить рандомно от 1 до 9 (включительно).
Заполнить -1 строку 3 и колонку 2.
     */
    public static void main(String[] args) {
        int[][] matrix = Utils.fillMatrix(Utils.createMatrix(5, 5));
        Utils.prnArr(matrix);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 2) {
                    matrix[i][j] = -1;
                }
                if (j == 1) {
                    matrix[i][j] = -1;
                }
            }
        }
        Utils.prnArr(matrix);
    }
}

