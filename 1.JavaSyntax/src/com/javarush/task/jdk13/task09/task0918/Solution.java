package com.javarush.task.jdk13.task09.task0918;

/* 
Создаем свои исключения
*/

import java.io.IOException;
import java.sql.SQLException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends SQLException {

    }

    static class MyException2 extends IOException {
    }

    static class MyException3 extends ArithmeticException {
    }

    static class MyException4 extends IllegalArgumentException {
    }
}

