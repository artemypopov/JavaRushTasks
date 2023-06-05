package com.javarush.task.jdk13.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удали последнюю строку и вставь её в начало
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(b.readLine());
        }

        int lastLineIndex;
        String lastLine;
        for (int i = 0; i < 13; i++) {
            lastLineIndex = list.size()-1;
            lastLine = list.get(lastLineIndex);
            list.remove(lastLineIndex);
            list.add(0,lastLine);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
