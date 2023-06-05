package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList();
        try {
            FileInputStream fileInputStream = new FileInputStream(new Scanner(System.in).nextLine());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

            while (bufferedReader.ready()) {
                arrayList.add(Integer.parseInt(bufferedReader.readLine()));
            }
            fileInputStream.close();
            bufferedReader.close();

            Collections.sort(arrayList);
            for (Integer i : arrayList) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
