package com.javarush.task.jdk13.task09.task0931;

/* 
Удаление пробелов
*/

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String stringWithoutSpaces = deleteSpaces("Добрый день! Как дела?");
        System.out.println(stringWithoutSpaces);
    }

    public static String deleteSpaces(String string) {
        //напишите тут ваш код
        String str = string.replaceAll("\\s", "");
        return str;
    }
}

