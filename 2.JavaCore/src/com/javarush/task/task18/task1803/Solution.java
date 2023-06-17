package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         String nameFile = bufferedReader.readLine();

         FileInputStream fileInputStream = new FileInputStream(nameFile);

        Map<Integer, Integer> count = new HashMap<>();

         while (fileInputStream.available() > 0) {
             int data = fileInputStream.read();

             if (!count.containsKey(data)) {
                count.put(data, 1);
             }
             count.put(data, count.get(data) + 1);
         }

         fileInputStream.close();
         bufferedReader.close();

         int maxCountByte = Collections.max(count.values());

         for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
             if (entry.getValue() == maxCountByte) {
                 System.out.print(entry.getKey() + " ");
             }
         }
    }
}
