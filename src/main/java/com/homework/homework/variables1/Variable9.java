package com.homework.homework.variables1;

import java.util.Locale;

/**
 * Метод main выводит на экран четыре строки. Все они - яркий пример злоупотребления заглавными буквами.
 * Внеси изменения в код, чтобы все буквы в этих строках стали строчными.
 * Требования:
 * •	Не изменяй значения переменных title, degree и career.
 * •	У четырех строк, переданных в метод println, нужно вызвать метод toLowerCase.
 * •	Вывод программы должен содержать четыре строки.
 */

public class Variable9 {

  public static void main(String[] args) {
    String title = "Senior Lead Principal Software Engineer Data Architect";
    String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
    String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

    //напишите тут ваш код
    System.out.println("RESUME");
    System.out.println("TITLE: " + title.toLowerCase(Locale.ROOT));
    System.out.println("DEGREE: " + degree.toLowerCase(Locale.ROOT));
    System.out.println("CAREER: " + career.toLowerCase(Locale.ROOT));
    System.out.println("CAREER: " + career.toUpperCase());


  }
}
