package com.javarush.task.jdk13.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String mama = "Мама";
        String mila = "Мыла";
        String ramy = "Раму";

        System.out.printf("%s%s%s%n", mama, mila, ramy);
        System.out.printf("%s%s%s%n", mama, ramy, mila);
        System.out.printf("%s%s%s%n", mila, mama, ramy);
        System.out.printf("%s%s%s%n", mila, ramy, mama);
        System.out.printf("%s%s%s%n", ramy, mila, mama);
        System.out.printf("%s%s%s%n", ramy, mama, mila);

    }
}
