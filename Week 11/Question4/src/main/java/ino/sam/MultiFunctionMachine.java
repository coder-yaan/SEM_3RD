package ino.sam;

public class MultiFunctionMachine implements Printer, Scanner {

    @Override
    public void connect() {
        System.out.println("Connected to MultiFunctionMachines.");
    }

    @Override
    public void details() {
        Printer.super.details();
        Scanner.super.details();
        System.out.println("MultiFunctionMachine: Combines printer and scanner in one device.");
    }

}