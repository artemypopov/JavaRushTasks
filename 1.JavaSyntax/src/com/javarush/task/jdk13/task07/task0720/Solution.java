package com.javarush.task.jdk13.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();
        String s;
        for (int i = 0; i < n; i++) {
            s = reader.readLine();
            list.add(s);
        }

        while (m > 0) {
            s = list.get(0);
            list.remove(s);
            list.add(list.size(), s);
            m--;
        }

        for (String l : list) {
            System.out.println(l);
        }

    }
}
