package com.javarush.task.jdk13.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(strings);

        for (String s : strings) {
            if (s.contains("л") && s.contains("р")) {
            } else if (s.contains("л")) {
                list.add(s);
            } else if (s.contains("р")) {
                list.remove(s);
            }
        }
        return list;
    }
}