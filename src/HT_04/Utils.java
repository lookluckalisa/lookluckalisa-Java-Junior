package HT_04;

import java.util.Arrays;
import java.util.Random;

public class Utils {
    static Random random = new Random(10);

    static void prnArr(int[] ints) {
        System.out.println(Arrays.toString(ints));
    }

    static void prnArr(int[][] matrix) {
        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[] fillRnd(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(10);
        }
        return ints;
    }

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static int[][] createMatrix(int row, int col) {
        return new int[row][col];
    }

    public static int[][] fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = fillRnd(matrix[i]);
        }
        return matrix;
    }
}
