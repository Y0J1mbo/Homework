package com.homework.homework.oop7.poliformism.superMethod;

import com.homework.oop7.poliformism.superMethod.Cat;
import com.homework.oop7.poliformism.superMethod.Dog;

/**
 * Класс Pet является родительским классом для классов Cat и Dog. В нем реализован метод printInfo(), который сообщает,
 * что данный объект является питомцем.
 * В классах Cat и Dog переопредели метод printInfo(), дополнив его функционал следующим образом:
 *
 * вначале вызови метод printInfo() родительского класса;
 * потом дополнительно выведи в консоли "Я не люблю людей" для класса Cat или "Я люблю людей" для класса Dog.
 * Пример вывода для класса Cat:
 * Я домашний питомец.
 * Я не люблю людей.
 *
 * Пример вывода для класса Dog:
 * Я домашний питомец.
 * Я люблю людей.
 * Требования:
 * •	Метод printInfo() должен быть переопределен в классе Cat.
 * •	Метод printInfo() должен быть переопределен в классе Dog.
 * •	В методе printInfo() класса Cat должен вызываться printInfo() родительского класса.
 * •	В методе printInfo() класса Dog должен вызываться printInfo() родительского класса.
 * •	Метод printInfo() класса Cat должен выводить в консоли текст согласно условию.
 * •	Метод printInfo() класса Dog должен выводить в консоли текст согласно условию.
 */

public class Solution {
  public static void main(String[] args) {
    com.homework.oop7.poliformism.superMethod.Cat cat = new Cat();
    cat.printInfo();
    com.homework.oop7.poliformism.superMethod.Dog dog = new Dog();
    dog.printInfo();
  }
}
