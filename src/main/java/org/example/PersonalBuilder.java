package org.example;

public class PersonalBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;


    public PersonalBuilder() {
    }

    public PersonalBuilder setName(String name) {
        return new PersonalBuilder().setName(name);
    }

    public PersonalBuilder setSurname(String surname) {
        return new PersonalBuilder().setSurname(surname);
    }

    public PersonalBuilder setAge(int age) {
        return new PersonalBuilder().setAge(age);
    }

    public PersonalBuilder setAddress(String address) {
        return new PersonalBuilder().setAddress(address);
    }

    public Person build() {
        return new Person(name, surname);
    }
}