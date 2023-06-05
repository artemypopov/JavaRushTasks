package com.javarush.task.jdk13.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 2) {
            // Вернуть имя метода, который вызвал метод, вызвавший данный метод
            return stackTraceElements[2].getMethodName();
        } else {
            // Если стек вызовов короче двух элементов, то невозможно определить имя метода, вызвавшего данный метод
            return null;
        }
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 2) {
            // Вернуть имя метода, который вызвал метод, вызвавший данный метод
            return stackTraceElements[2].getMethodName();
        } else {
            // Если стек вызовов короче двух элементов, то невозможно определить имя метода, вызвавшего данный метод
            return null;
        }
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 2) {
            // Вернуть имя метода, который вызвал метод, вызвавший данный метод
            return stackTraceElements[2].getMethodName();
        } else {
            // Если стек вызовов короче двух элементов, то невозможно определить имя метода, вызвавшего данный метод
            return null;
        }
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 2) {
            // Вернуть имя метода, который вызвал метод, вызвавший данный метод
            return stackTraceElements[2].getMethodName();
        } else {
            // Если стек вызовов короче двух элементов, то невозможно определить имя метода, вызвавшего данный метод
            return null;
        }
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 2) {
            // Вернуть имя метода, который вызвал метод, вызвавший данный метод
            return stackTraceElements[2].getMethodName();
        } else {
            // Если стек вызовов короче двух элементов, то невозможно определить имя метода, вызвавшего данный метод
            return null;
        }
    }
}
