package com.javarush.task.jdk13.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Нужно заменить функциональность программы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<>();
        String s;
        for (int i = 0; i < strings.size(); i++) {
            s = strings.get(i);
            if (s.length() % 2 == 0) {
                s = s  + " " + s;
                resultStrings.add(s);
            } else {
                s = s + " " + s + " " + s;
                resultStrings.add(s);
            }
        }
//        ArrayList<String> resultStrings = new ArrayList<String>();
//        for (String string : strings) {
//            resultStrings.add(string.toUpperCase());
//        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}
