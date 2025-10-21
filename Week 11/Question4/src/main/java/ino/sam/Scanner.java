package ino.sam;
public interface Scanner {
    void connect();
    default void details() {
        System.out.println("Scanner details: Supports PDF scanning.");
    }
}