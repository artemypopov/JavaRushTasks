package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int minlength = Integer.MAX_VALUE;
        int maxlength = 0;
        int indexMinLength = 0;
        int indexMaxLength = 0;
        String s;
        strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            s = bufferedReader.readLine();
            strings.add(s);
            if (s.length() < minlength) {
//                System.out.println("minLength " + s.length());
                minlength = s.length();
                indexMinLength = i;
//                System.out.println("indexMinLength " + indexMinLength);
//                System.out.println("--------------------------------");

            }
            if (s.length() > maxlength) {
//                System.out.println("maxLength " + s.length());
                maxlength = s.length();
                indexMaxLength = i;
//                System.out.println("indexMaxLength " + indexMaxLength);
//                System.out.println("--------------------------------");
            }
//            System.out.println("****************************");
        }

        int index = Math.min(indexMaxLength, indexMinLength);
//        System.out.println(index);
        System.out.println(strings.get(index));
    }
}
