package com.homework.for_while_do_while4;

/**
 * Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
 * Каждое значение нужно выводить с новой строки.
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить чётные числа от 1 до 15. Каждое значение вывести с новой строки.
 * •	В программе необходимо использовать цикл for.
 */

public class Cycle6 {

    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 1, b = 15;
        for (int i = a; i < b; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
