package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        List<Integer> number = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            number.add(data);
        }

        fileInputStream.close();
        bufferedReader.close();

        List<Integer> newList = number.stream().distinct().sorted().collect(Collectors.toList());

        for (Integer i : newList) {
            System.out.print(i + " ");
        }
    }
}
