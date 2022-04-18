package com.homework.homework.for_while_do_while4;

import java.util.Scanner;

/**
 * Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
 * Слово "enough" выводить не нужно.
 * Для этого необходимо использовать бесконечный цикл (while(true)).
 *
 * Подсказка: чтобы завершить бесконечный цикл, используй оператор break.
 * Требования:
 * •	Программа должна считывать данные c клавиатуры.
 * •	В программе необходимо использовать цикл while.
 * •	Для завершения бесконечного цикла необходимо использовать оператор break.
 * •	Программа должна выводить в консоли все введенные данные с новой строки, пока на будет введено слово "enough".
 */

public class Cycle4 {

  public static void main(String[] args) {
    //напишите тут ваш код
    Scanner sc = new Scanner(System.in);
    String word = "enough";
    while (true) {
      String newWord = sc.nextLine();
      if (newWord.equalsIgnoreCase(word)) {
        break;
      }
      System.out.println(newWord);
    }
    System.out.println();

  }
}
