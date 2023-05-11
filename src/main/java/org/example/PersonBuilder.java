package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        if(age >= 0) {
            return this;
        }
        else {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if(name != null && surname != null) {
            return new Person(name, surname);
        }
        else {
            throw new IllegalStateException("Не введено имя или фамилия");
        }
    }
}