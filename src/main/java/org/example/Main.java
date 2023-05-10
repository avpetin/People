package org.example;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonalBuilder()
                .setName("Anna")
                .setSurname("Wolf")
                .setAge(31)
                .setAddress("Sidney")
                .build();
        System.out.println("У " + mom + " есть сын, " + "");
    }
}