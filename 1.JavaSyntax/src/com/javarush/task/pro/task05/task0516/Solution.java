package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 13;



    public static void main(String[] args) {
        //напишите тут ваш код
        int middle = array.length / 2;
        int fillIndex = (array.length % 2 == 0) ? middle : middle + 1;

        Arrays.fill(array, 0, fillIndex, valueStart);
        Arrays.fill(array, fillIndex, array.length, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}
