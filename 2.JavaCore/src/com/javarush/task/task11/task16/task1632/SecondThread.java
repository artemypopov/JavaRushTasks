package com.javarush.task.task11.task16.task1632;

public class SecondThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
