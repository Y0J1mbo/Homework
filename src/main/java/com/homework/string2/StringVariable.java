package com.homework.string2;

import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 * Требования:
 * •	Программа должна считывать две строки c клавиатуры.
 * •	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
 * •	Если строки разные, то программа должна вывести сообщение "строки разные".
 */

public class StringVariable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        //напишите тут ваш код
        if (one.equals(two)) {
            System.out.println("строки одинаковые");
        } else {
            //напишите тут ваш код
            System.out.println("строки разные");
        }
    }
}