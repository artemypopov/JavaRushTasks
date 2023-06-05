package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
            fileInputStream.close();
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}