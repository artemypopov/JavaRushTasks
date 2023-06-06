package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = bufferedReader.readLine();
            if (str.equals("exit")) {
                break;
            }

            if (str.matches("-?\\d+[.]\\d+")) {
                print(Double.parseDouble(str));
            } else if (str.matches("-?\\d+")) {
                int intStr = Integer.parseInt(str);
                if (intStr > 0 & intStr < 128) {
                    print((short) intStr);
                } else {
                    print(intStr);
                }
            } else {
                print(str);
            }
        }
    }



    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
