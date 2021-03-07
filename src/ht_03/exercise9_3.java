package ht_03;

public class exercise9_3 {
    /*
    3. Используя только пробелы и разрывы строки, переформатируйте фрагмент кода, чтобы
сделать поток управления легче понять.
     */
    public static void main(String[] args) {
        int aNumber = 3;

        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else
                System.out.println("second string");

        System.out.println("third string");
    }
}
