package com.javarush.task.task11.task16.task1633;

/* 
Отдебажим все на свете
*/

public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        threadA.start();
        threadB.start();
    // 1 решение
    //    threadA.setUncaughtExceptionHandler(handler);
    //    threadB.setUncaughtExceptionHandler(handler);

        threadA.interrupt();
        threadB.interrupt();
        // commonThread.interrupt();  // если добывать будет выводиться "Thread-0: My exception message"
    }

    public static class TestedThread extends Thread {

        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            // 2 решение
            setDefaultUncaughtExceptionHandler(handler); // 2 решение
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
