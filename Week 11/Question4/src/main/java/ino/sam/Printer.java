package ino.sam;
public interface Printer {
    void connect();
    default void details() {
        System.out.println("Printer details: Supports color printing.");
    }
}