package com.javarush.task.jdk13.task09.task0932;

/* 
Количество слов в строке
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Кто желает поработать?";
        int getWordCount = getWordCount(string);
        System.out.println("Количество слов в строке \"" + string + "\" равно " + getWordCount);
    }

    public static int getWordCount(String string) {
        //напишите тут ваш код
        int count = 0;
        if (string.length() != 0) {
            count++;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}
