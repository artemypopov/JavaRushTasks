package com.javarush.task.task11.task16.task1632;

public class FourthThread extends Thread implements Message{

    @Override
    public void run() {
        while (!isInterrupted()) {

        }
    }

    @Override
    public void showWarning() {
        this.interrupt();
    }


}
