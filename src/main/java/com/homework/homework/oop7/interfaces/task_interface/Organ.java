package com.homework.homework.oop7.interfaces.task_interface;

import com.homework.oop7.interfaces.task_interface.MusicalInstrument;

public class Organ implements MusicalInstrument {
  @Override
  public void play() {
    System.out.println("Играет орган.");
  }
}
