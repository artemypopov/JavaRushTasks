package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int index1 = path.indexOf("jdk");
        int index2 = path.indexOf("/", index1);
        String jdk1_8 = path.substring(index1, index2);
        return path.replace(jdk1_8, jdk);
//        return path.replace("/jdk[\\w.-]*/", "/" + jdk + "/");
    }
}
