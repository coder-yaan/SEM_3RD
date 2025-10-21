package com.election.committee;
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name; this.age = age;
    }
    public void checkAge() throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Current age: " + age);
        }
    }
    public String getName() { return name; }
}