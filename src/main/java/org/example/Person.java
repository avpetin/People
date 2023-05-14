package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected OptionalInt age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age);
    }

    // Check age & city
    public boolean hasAge() {
        return age.isPresent();
    }

    public boolean hasAddress() {
        return address != null;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        int ret;
        if(hasAge())
          return age.getAsInt();
        else throw NoSuchElementException();
    }

    public String getAddress() {
        return address;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(5)
                .setAddress(hasAddress() ? address : null);
    }

    private int happyBirthday() {
        return age + 1;
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
/*
    @Override
    public int hashCode(){

    }*/
}
