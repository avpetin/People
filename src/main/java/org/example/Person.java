package org.example;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Check age & city
/*    public boolean hasAge(){

    }

    public boolean hasAddress(){

    }*/

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    // Setter
    public void setCity(String city) {
        this.city = city;
    }

//    public PersonalBuilder newChildBuilder(){}

/*     @Override
   public String toString(){

    }

    @Override
    public int hashCode(){

    }*/
}
