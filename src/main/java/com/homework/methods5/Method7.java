package com.homework.methods5;

/**
 * Давай напишем реализацию калькулятора, который будет считать степени чисел.
 * Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
 * Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
 * Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.
 * Требования:
 * •	Должен быть создан метод public static long cube(long).
 * •	Метод cube() должен возвращать результат возведения переданного ему числа в третью степень.
 */


public class Method7 {

  public static void main(String[] args) {
    System.out.println(cube(3));
  }

  //напишите тут ваш код
  public static long cube(long x) {
    return x*x*x;
  }
}
