package com.homework.classes6;

public class Planet {

  public String name;

  public long age;

  public int speed;

  public int area;

  public Planet(String name, long age, int speed, int area) {
    this.name = name;
    this.age = age;
    this.speed = speed;
    this.area = area;
  }

  public void printInformation() {
    System.out.println("Имя планеты: " + name + ".");
    System.out.println("Возраст: " + age + " лет.");
    System.out.println("Орбитальная скорость: " + speed + " км/ч.");
    System.out.println("Общая площадь: " + area + " кв. км.");
  }
}
