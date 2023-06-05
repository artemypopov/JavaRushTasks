package com.javarush.task.jdk13.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальное и минимальное числа в массиве
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        maximum = Integer.MIN_VALUE;
        minimum = Integer.MAX_VALUE;
        int number;
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            number = Integer.parseInt(reader.readLine());
            numbers[i] = number;
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
