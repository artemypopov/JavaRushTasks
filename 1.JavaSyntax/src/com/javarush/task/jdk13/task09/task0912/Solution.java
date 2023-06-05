package com.javarush.task.jdk13.task09.task0912;

/* 
Исключение при работе с числами
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int num = Integer.parseInt("XYZ");
            System.out.println(num);
            //напишите тут ваш код

        } catch (NumberFormatException | IOException e) {
            throw new RuntimeException(e);
        }


    }
}
