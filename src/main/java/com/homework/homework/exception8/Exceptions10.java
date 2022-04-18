package com.homework.homework.exception8;

/**
 * Объедини блоки catch с одинаковым кодом.
 * Требования:
 * •	Количество блоков catch должно быть минимальным.
 */

public class Exceptions10 {

  public static void main(String[] args) {
    try {
      System.out.println("Программа работает от забора");
      Thread.sleep(1000);
      System.out.println("до обеда");
    } catch (NullPointerException e) {
      System.out.println("Произошло исключение на букву N");
    } catch (NumberFormatException e) {
      System.out.println("Произошло исключение на букву N");
    } catch (IllegalArgumentException e) {
      System.out.println("Произошло исключение на букву I");
    } catch (IllegalStateException e) {
      System.out.println("Произошло исключение на букву I");
    } catch (ClassCastException e) {
      System.out.println("Произошло исключение на букву C");
    } catch (InterruptedException e) {
      System.out.println("Произошло исключение на букву I");
    }
  }
}
