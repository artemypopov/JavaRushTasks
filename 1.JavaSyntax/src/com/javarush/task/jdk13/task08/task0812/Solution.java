package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int count = 1;
        int maxCount = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (!Objects.equals(list.get(i), list.get(j))) {
                    break;
                }
                count++;
//                if (Objects.equals(list.get(i), list.get(j))) {
//                    count++;
//                }
            }
            if (maxCount < count) {
                maxCount = count;
//                System.out.println("В цикле :" + maxCount);
            }
            count = 1;
        }
        System.out.println(maxCount);
    }
}
/*
89
12
12
98
128
42
98
98
98
71
*/
