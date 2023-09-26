package org.example;

public class ConsoleLoger implements ILogable{
    @Override
    public void log(String message) {
        System.out.println(" LOG :  " + message);
    }
}
