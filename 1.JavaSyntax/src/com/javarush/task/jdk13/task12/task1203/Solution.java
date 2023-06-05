package com.javarush.task.jdk13.task12.task1203;

/* 
Сознательный выбор
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(isByte(12)); // true
        System.out.println(isShort(130999)); // false
        System.out.println(isInt(1999939990L)); // true
        System.out.println(isInt(19999999939990L)); // false
    }

    public static boolean isByte(long l) {
        //напишите тут ваш код
        byte b = (byte) l;
        //System.out.println(l);
        //System.out.println(b);
        return b == l;
    }

    public static boolean isShort(long l) {
        //напишите тут ваш код
        short s = (short) l;
        //System.out.println(l);
        //System.out.println(s);
        return s == l;
    }

    public static boolean isInt(long l) {
        //напишите тут ваш код
        int i = (int) l;
        //System.out.println(l);
        //System.out.println(i);
        return i == l;
    }
}
