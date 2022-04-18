package com.homework.homework.classes6;

/**
 * Сделай все переменные класса Planet не статическими.
 * После этого внеси необходимые правки в метод main.
 * Требования:
 * •	Все переменные класса Planet должны быть не статическими.
 * •	В методе main должны присваиваться значения всем переменным объекта Planet earth.
 */

public class Class {

  public static void main(String[] args) {
    Planet earth = new Planet("Земля", 4_540_000_000L, 170_218, 510_072_000);
    earth.printInformation();
  }
}
