package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fileName = br.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        int count = 0;
        while(inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == 44) {
                count++;
            }
        }

        inputStream.close();
        System.out.println(count);
    }

}
