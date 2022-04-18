package com.homework.for_while_do_while4;

import java.util.Scanner;

/**
 * Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
 * Вывести на экран полученную сумму и завершить программу.
 * Требования:
 * •	Программа должна считывать данные c клавиатуры.
 * •	Программа должна выводить данные на экран, если пользователь ввел слово "ENTER".
 * •	Необходимо посчитать сумму введенных целых чисел и вывести её на экран.
 * •	В программе необходимо использовать цикл while.
 */

public class Cycle2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean exit = false;
        while (!exit) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sum = sum + num;
            } else if (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.equals("ENTER")) {
                    exit = true;
                }
            }
        }
        //напишите тут ваш код
        System.out.println(sum);
    }
}
