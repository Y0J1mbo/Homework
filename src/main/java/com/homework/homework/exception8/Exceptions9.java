package com.homework.homework.exception8;

import com.homework.exception8.FileManager;

/**
 * В методе main перехвати RuntimeException. Определи, какое исключение в нем сохранено.
 * Если это FileNotFoundException, выведи в консоли сообщение: "Не удалось прочесть файл.", а если FileSystemException — "Не удалось записать в файл.".
 * Требования:
 * •	В методе main должно перехватываться RuntimeException.
 * •	Нужно вывести "Не удалось прочесть файл.", если в RuntimeException упаковано FileNotFoundException.
 * •	Нужно вывести "Не удалось записать в файл.", если в RuntimeException упаковано FileSystemException.
 * •	Класс FileManager не изменяй.
 */

public class Exceptions9 {


  public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
  public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

  public static com.homework.exception8.FileManager fileManager = new FileManager();

  public static void main(String[] args) {
    fileManager.copyFile("book.txt", "book_final_copy.txt");
    fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
    //напишите тут ваш код
  }
}
