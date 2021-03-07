package ht_03;

public class exercise8 {
    /*
    8 В следующей программе объясните, почему значение "6" печатается дважды подряд:
class PrePostDemo {
public static void main(String[] args){
int i = 3;
i++;
System.out.println(i); // "4"
++i;
System.out.println(i); // "5"
System.out.println(++i); // "6"
System.out.println(i++); // "6"
System.out.println(i); // "7"
}
}
     */
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // "4"
        ++i;
        System.out.println(i); // "5"
        System.out.println(++i); // "6"
        System.out.println(i++); // "6"
        System.out.println(i); // "7"
    }
}
/*
Ответ: При использовании постфиксного инкремента
после изменения возвращается то значение, которое было до изменения переменной.
 */
