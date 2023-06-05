package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Фамилия1","Имя1");
        map.put("Фамилия2","Имя2");
        map.put("Фамилия3","Имя3");
        map.put("Фамилия4","Имя4");
        map.put("Фамилия5","Имя5");
        map.put("Фамилия6","Имя6");
        map.put("Фамилия7","Имя7");
        map.put("Фамилия8","Имя8");
        map.put("Фамилия9","Имя9");
        map.put("Фамилия10","Имя10");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
