package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        if (url.contains("https://")) {
            return "https";
        } else if (url.contains("http://")) {
            return "http";
        }
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        if (url.contains(".com")) {
            return "com";
        } else if (url.contains(".net")) {
            return "net";
        } else if (url.contains(".org")) {
            return "org";
        } else if (url.contains(".ru")) {
            return "ru";
        }
        return "неизвестный";
    }
}
