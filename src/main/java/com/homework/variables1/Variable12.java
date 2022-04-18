package com.homework.variables1;

import java.util.Scanner;

/**
 * Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
 * Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
 * Поэтому сделаем конвертер величин скорости из м/с в км/ч.
 * Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
 * Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
 * Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
 * Для округления необходимо использовать метод Math.round().
 * Требования:
 * •	Программа должна считывать целые числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить на экран целое число - результат округления введенного целого числа, умноженного на 3.6.
 * •	В программе необходимо использовать метод Math.round().
 */

public class Variable12 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int speedMpS = scanner.nextInt();
        int speedKmpH = (int) Math.round(speedMpS * 3.6);
        System.out.println(speedKmpH);
    }
}
