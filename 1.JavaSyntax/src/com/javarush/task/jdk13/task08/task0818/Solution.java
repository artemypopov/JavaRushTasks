package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия" + (i + 1), (int) (Math.random() * 1000));
        }

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            String key = pair.getKey();
//            int value = pair.getValue();
//            if (value < 500) {
//                map.remove(key);
//            }
//        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Integer> pair = iterator.next();
            Integer value = pair.getValue();        //значение
            if (value < 500) {
                iterator.remove();
        }
    }
    }

//    private static void print(Map<String, Integer> map) {
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//    }

    public static void main(String[] args) {
//        Map<String, Integer> map = createMap();
//        print(map);
//        System.out.println("-----------------------");
//        removeItemFromMap(map);
//        print(map);
    }
}