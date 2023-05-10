package org.example;

public class PersonalBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonalBuilder() {
    }

    public PersonalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonalBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonalBuilder setAge(int age) {
        this.age = age;
        if(age >= 0) {
            return this;
        }
        else {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }

    public PersonalBuilder setAddress(String address) {
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