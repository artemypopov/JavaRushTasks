package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.*;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Фамилия2", dateFormat.parse("JUN 1 2012"));
        map.put("Фамилия3", dateFormat.parse("JUL 1 2012"));
        map.put("Фамилия4", dateFormat.parse("AUG 1 2012"));
        map.put("Фамилия5", dateFormat.parse("SEP 1 2012"));
        map.put("Фамилия6", dateFormat.parse("OCT 1 2012"));
        map.put("Фамилия7", dateFormat.parse("NOV 1 2012"));
        map.put("Фамилия8", dateFormat.parse("DEC 1 2012"));
        map.put("Фамилия9", dateFormat.parse("JAN 1 2012"));
        map.put("Фамилия10", dateFormat.parse("FEB 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws DateTimeParseException {
        //напишите тут ваш код
//        for (Map.Entry<String, Date> pair : map.entrySet()) {
//            String key = pair.getKey();
//            String value = pair.getValue().toString();
//            if (value.contains("JUN") ||
//                    value.contains("JUL") ||
//                    value.contains("AUG")) {
//
//                map.remove(key);
//            }
//        }
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue().toString();        //значение
            if (value.contains("Jun") ||
                    value.contains("Jul") ||
                    value.contains("Aug")) {

                iterator.remove();
            }
        }
    }

//    private static void print(Map<String, Date> map) {
//        for (Map.Entry<String, Date> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//    }

    public static void main(String[] args) throws ParseException {
//        Map<String, Date> map = createMap();
//        print(map);
//        System.out.println("-----------------------");
//        removeAllSummerPeople(map);
//        print(map);
    }
}
