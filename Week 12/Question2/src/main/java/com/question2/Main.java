package com.question2;
import java.io.IOException;
public class Main {
    static void thirdFunction() throws IOException {
        System.out.println("Third function: Throwing IOException...");
        throw new IOException("IOException in third function!");
    }
    static void secondFunction() throws IOException {
        System.out.println("Second function: Calling third function...");
        thirdFunction();
    }
    static void firstFunction() throws IOException {
        System.out.println("First function: Calling second function...");
        secondFunction();
    }
    public static void main(String[] args) {
        try {
            firstFunction();
        } catch (IOException e) {
            System.out.println("Main caught the exception: " + e.getMessage());
        }
        System.out.println("Program ends.");
    }
}