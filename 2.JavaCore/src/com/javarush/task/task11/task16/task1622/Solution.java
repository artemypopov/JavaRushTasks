package com.javarush.task.task11.task16.task1622;

/* 
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();  // добавил join()
            //напишите тут ваш код
            //ничего уже не надо
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(10);
                    System.out.println(this);
                    if (--countdownIndex == 0) return;
                    //напишите тут ваш код
                    for (int i = COUNT; i >= 1; i--) {
                        Thread.currentThread();
                    }

                } catch (InterruptedException e) {
                    System.out.println("Нить прервана");
                    throw new RuntimeException(e);
                }

            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
