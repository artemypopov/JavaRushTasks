package com.javarush.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            int num = iterator.next();
            if (num > 10) {
                iterator.remove();
            }
        }


    }

//    public static void print(Set<Integer> set) {
//        for (Integer i : set) {
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) {
//        Set<Integer> set = createSet();
//        print(set);
//        removeAllNumbersGreaterThan10(set);
//        print(set);
    }
}
