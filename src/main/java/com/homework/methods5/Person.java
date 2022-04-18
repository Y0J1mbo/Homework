package com.homework.methods5;

public class Person {
  private String firstName;
  private String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  protected String getFirstName() {
    return firstName;
  }

  String getLastName() {
    return lastName;
  }

  String getFullName(){
    return firstName + " " + lastName;
  }
}
