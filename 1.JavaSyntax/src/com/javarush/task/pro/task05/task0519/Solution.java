package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 7;

    public static void main(String[] args) {
        //напишите тут ваш код
        int[] arr = Arrays.copyOf(array, array.length);
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, element);

        boolean b = index > -1 ? true : false;

        System.out.println(b);
    }
}
