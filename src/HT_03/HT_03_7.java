package HT_03;

public class HT_03_7 {
    /*
   Измените следующую программу, чтобы использовать составные присвоения:
class ArithmeticDemo {
public static void main (String[] args){
int result = 1 + 2; // result is now 3
System.out.println(result);
result = result - 1; // result is now 2
System.out.println(result);
result = result * 2; // result is now 4
System.out.println(result);
result = result / 2; // result is now 2
System.out.println(result);
result = result + 8; // result is now 10
result = result % 7; // result is now 3
System.out.println(result);
}
}
     */
    public static void main(String[] args) {
        int result = 2;
        result++;
        System.out.println(result);// result is now 3

        result -= 1;
        System.out.println(result);// result is now 2

        result *= 2;
        System.out.println(result);// result is now 4

        result /= 2;
        System.out.println(result);// result is now 2

        result += 8;
        System.out.println(result);// result is now 10

        result %= 7;
        System.out.println(result); // result is now 3
    }
}
