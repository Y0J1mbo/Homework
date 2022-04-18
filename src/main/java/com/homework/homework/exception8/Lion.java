package com.homework.homework.exception8;

import com.homework.exception8.Food;

public class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("ищет еду");
            System.out.println("нашел " + food.getName());
            System.out.println("все съел");
        } catch (NullPointerException e) {
            System.out.println("ничего не нашел");
        } finally {
            System.out.println("лег спать" + (food == null ? " голодным" : ""));
        }
    }
}
