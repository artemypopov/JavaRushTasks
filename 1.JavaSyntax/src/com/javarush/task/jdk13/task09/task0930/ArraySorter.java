package com.javarush.task.jdk13.task09.task0930;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySorter {

    public void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            if (isNumber(s)) {
                integers.add(Integer.valueOf(s));
            } else {
                if (s.length() == 0) {
                    break;
                }
                strings.add(s);
            }
        }


        System.out.println(Arrays.asList(strings));
        Collections.sort(strings);
        System.out.println(Arrays.asList(strings));
        System.out.println("-------------------------");
        System.out.println(Arrays.asList(integers));
        Collections.sort(integers, Collections.reverseOrder());
        System.out.println(Arrays.asList(integers));

        int i = 0, j = 0;
        while (i < array.length) {
            array[i] = strings.get(j);
            i++;
            array[i] = String.valueOf(integers.get(j));
            j++;
            i++;
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // Строка содержит '-'
                    || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && character == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
