package com.election.committee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        Person p1 = new Person(name, age);

        try {
            p1.checkAge();
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught for " +  p1.getName() + ".");
            System.out.println(e.getMessage());
        }
    }
}