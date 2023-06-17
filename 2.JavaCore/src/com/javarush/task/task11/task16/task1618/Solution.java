package com.javarush.task.task11.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {

        @Override
        public void run() {
            while (!TestThread.interrupted()) {
                TestThread.interrupted();
            }
        }
    }
}