package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
         private String s;
         private int i;
         private short sh;

         private long l;

         private double d;

         private byte b;

        public Human() {
        }

        public Human(String s) {
            this.s = s;
        }

        public Human(int i) {
            this.i = i;
        }

        public Human(short sh) {
            this.sh = sh;
        }

        public Human(long l) {
            this.l = l;
        }

        public Human(double d) {
            this.d = d;
        }

        public Human(byte b) {
            this.b = b;
        }

        public Human(String s, int i) {
            this.s = s;
            this.i = i;
        }

        public Human(String s, int i, short sh) {
            this.s = s;
            this.i = i;
            this.sh = sh;
        }

        public Human(String s, int i, short sh, long l) {
            this.s = s;
            this.i = i;
            this.sh = sh;
            this.l = l;
        }

    }
}
