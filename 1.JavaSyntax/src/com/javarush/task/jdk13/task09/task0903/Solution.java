package com.javarush.task.jdk13.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        return  /*напишите тут ваш код*/ Thread.currentThread().getStackTrace()[2].getLineNumber();

        /*  Thread thread = new Thread();
        *   thread = Thread.currentThread();
        *   StackTraceElement[] stackTraceElements = thread.getStackTrace();
        *   int lineNumber = stackTraceElements[2].getLineNumber();
        *   return  lineNumber;
        */
    }
}
