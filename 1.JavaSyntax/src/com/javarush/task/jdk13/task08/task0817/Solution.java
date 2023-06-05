package com.javarush.task.jdk13.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Удалить людей, имеющих одинаковые имена
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Фамилия1","Имя1");
        map.put("Фамилия2","Имя2");
        map.put("Фамилия3","Имя3");
        map.put("Фамилия4","Имя3");
        map.put("Фамилия5","Имя4");
        map.put("Фамилия6","Имя5");
        map.put("Фамилия7","Имя1");
        map.put("Фамилия8","Имя6");
        map.put("Фамилия9","Имя7");
        map.put("Фамилия10","Имя8");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        int count = 0;
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            String s = pair.getValue();
            for (Map.Entry<String, String> p : copy.entrySet()) {
                String l = p.getValue();
                if (s.equals(l)) {
                    count++;
                    if (count > 1) {
                        removeItemFromMapByValue(map, l);
                    }

                } else {
                    count = 0;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
