package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
            exceptions.add(new NullPointerException());
            exceptions.add(new IllegalArgumentException());
            exceptions.add(new NoSuchElementException());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new ClassCastException());
            exceptions.add(new ClassNotFoundException());
            exceptions.add(new IllegalAccessException());
            exceptions.add(new NoSuchMethodException());
            exceptions.add(new RuntimeException());
    }
}
