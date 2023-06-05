package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
Публичный статический метод toHex(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод toDecimal(String) наоборот — из строкового представления шестнадцатеричного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод toHex(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
Твоя задача реализовать эти методы.

Также в классе Solution есть константа HEX, которая содержит в себе все символы, используемые в шестнадцатеричной системе.

Один из алгоритмов перевода десятичного числа в шестнадцатеричное следующий:
while(десятичное число не равно 0) {
представление шестнадцатеричного числа = символ из строки HEX с индексом, равным остатку от деления десятичного числа на 16
+ представление шестнадцатеричного числа
десятичное число = десятичное число / 16
}

Один из алгоритмов перевода шестнадцатеричного числа в десятичное следующий:
for (int i = 0; i < длина входящей строки; i++) {
десятичное число = 16 * десятичное число + индекс символа из строки HEX, равного символу из входящей строки с индексом i
}

Метод main() не принимает участие в тестировании.


Requirements:
1. Нужно, чтобы метод toHex(int) был реализован согласно условию.
2. Нужно, чтобы метод toDecimal(String) был реализован согласно условию.
3. Методы Integer.toHexString(int) и Long.toHexString(int) использовать нельзя.
4. Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
5. Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
6. Объект типа BigInteger использовать нельзя.
7. Объект типа BigDecimal использовать нельзя.
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    /*
    while(десятичное число не равно 0) {
    представление шестнадцатеричного числа = символ из строки HEX с индексом, равным остатку от деления десятичного числа на 16
    + представление шестнадцатеричного числа
    десятичное число = десятичное число / 16
    }
    */
    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        }
        int number = decimalNumber;
        while (decimalNumber != 0) {
            number = decimalNumber % 16;
            if (number < 10) {
                hexNumber = number + hexNumber;
            } else if (number == 10) {
                hexNumber = "A" + hexNumber;
            } else if (number == 11) {
                hexNumber = "B" + hexNumber;
            } else if (number == 12) {
                hexNumber = "C" + hexNumber;
            } else if (number == 13) {
                hexNumber = "D" + hexNumber;
            } else if (number == 14) {
                hexNumber = "E" + hexNumber;
            }  else if (number == 15) {
                hexNumber = "F" + hexNumber;
            }
            decimalNumber = decimalNumber / 16;
        }

        return hexNumber;
    }

    /*
    for (int i = 0; i < длина входящей строки; i++) {
    десятичное число = 16 * десятичное число + индекс символа из строки HEX, равного символу из входящей строки с индексом i
    }
    */
    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        if (hexNumber == null || hexNumber.equals("")) {
            return decimalNumber;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            int index = hexNumber.length() - 1 - i;
            int value = Character.getNumericValue(hexNumber.charAt(index));
            decimalNumber += value * Math.pow(16, i);
        }

        return decimalNumber;
    }
}
