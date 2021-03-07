package HT_03;

public class HT_03_5 {
    /*
    5. В три переменные a , b и c явно записаны программистом три целых попарно неравных
между собой числа. Создать программу, которая переставит числа в переменных таким
образом, чтобы при выводе на экран последовательность a , b и c оказалась строго
возрастающей.
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 32;
        int c = 2;

        if (a < b && a < c) {
            System.out.print(a + ", ");
            if (b < c) {
                System.out.print(b + ", " + c);
            } else {
                System.out.print(c + ", " + b);
            }
        } else if (b < c && b < a) {
            System.out.print(b + ", ");
            if (a < c) {
                System.out.print(a + ", " + c);
            } else {
                System.out.print(c + ", " + a);
            }
        } else if (c < b && c < a) {
            System.out.print(c + ", ");
            if (a < b) {
                System.out.print(a + ", " + b);
            } else {
                System.out.print(b + ", " + a);
            }
        }
    }
}
