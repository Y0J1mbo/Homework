package com.homework.homework.oop7.poliformism.right_movement;

import com.homework.oop7.poliformism.right_movement.Bat;

/**
 * Класс Bat (летучая мышь) унаследован от класса Animal. Все логично, вот только при вызове метода move() у объекта класса Bat выведется в консоли "Я бегу!".
 * Зачем бежать, если ты умеешь летать?
 * Переопредели метод move() для класса Bat, чтобы он выводил в консоли "Я лечу!".
 * Метод main() в тестировании участия не принимает.
 * Требования:
 * •	Класс Animal не изменяй.
 * •	Класс Bat должен быть унаследован от Animal.
 * •	В классе Bat должен быть переопределен метод move().
 * •	Вызов метода move() у объекта класса Bat должен выводить в консоли "Я лечу!".
 */

public class Solution {
  public static void main(String[] args) {
    Bat bat = new Bat();
    bat.move();
  }
}
