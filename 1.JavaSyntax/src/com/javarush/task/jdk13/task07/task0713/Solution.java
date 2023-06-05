package com.javarush.task.jdk13.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Три массива
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int n;
        for (int i = 0; i < 20; i++) {
            n = Integer.parseInt(b.readLine());
            numbers.add(n);
            if (n % 3 == 0 && n % 2 == 0) {
                divBy3.add(n);
                divBy2.add(n);
            } else if (n % 2 == 0) {
                divBy2.add(n);
            } else if (n % 3 == 0) {
                divBy3.add(n);
            } else {
                others.add(n);
            }
        }
        printList(divBy3);
        //System.out.println("----------");
        printList(divBy2);
        //System.out.println("---------");
        printList(others);


    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
