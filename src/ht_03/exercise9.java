package ht_03;

public class exercise9 {
    /*
    9 Рассмотрите следующий фрагмент кода.
if (aNumber >= 0)
if (aNumber == 0)
System.out.println("first string");
else System.out.println("second string");
System.out.println("third string");
1. Что выводит, делают Вы думаете, что код произведет если aNumber 3?
2. Запишите тестовую программу, содержащую предыдущий фрагмент кода; сделать
aNumber 3. Каков вывод программы? Это - то, что Вы предсказали? Объясните, почему
вывод состоит в том, каково это; другими словами, каков поток управления для
фрагмента кода?
3. Используя только пробелы и разрывы строки, переформатируйте фрагмент кода, чтобы
сделать поток управления легче понять.
4. Используйте фигурные скобки, {и}, чтобы далее разъяснить код.
     */
    public static void main(String[] args) {
        int aNumber = 3;

        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else System.out.println("second string");
        System.out.println("third string");
    }
}

/*
1. Что выводит, делают Вы думаете, что код произведет если aNumber 3?
Ответ:
second string
third string

2. Запишите тестовую программу, содержащую предыдущий фрагмент кода; сделать
aNumber 3. Каков вывод программы? Это - то, что Вы предсказали? Объясните, почему
вывод состоит в том, каково это; другими словами, каков поток управления для
фрагмента кода?
Ответ:
Цифра 3 больше нуля, поэтому программа переходит ко второму условию if (aNumber == 0)
Так как утверждение ложно, выполняется условие с else и на экран выводится second string.
println за пределами условного выраженя и будет выполняться всегда, поэтому следующей строкой
на консоль выведет  third string.

3. Используя только пробелы и разрывы строки, переформатируйте фрагмент кода, чтобы
сделать поток управления легче понять.

Отевет:
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

 */