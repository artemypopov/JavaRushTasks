package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = bufferedReader.readLine();

        FileInputStream inputStream = new FileInputStream(nameFile);

        int maxByte = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();

            if (data > maxByte) {
                maxByte = data;
            }
        }

        inputStream.close();
        System.out.println(maxByte);
    }
}
