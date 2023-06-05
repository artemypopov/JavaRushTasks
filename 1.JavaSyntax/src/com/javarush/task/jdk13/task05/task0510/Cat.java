package com.javarush.task.jdk13.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.color = "black";
        this.weight = 3;
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.color = "black";
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "black";
        this.weight = 3;
    }

    public void initialize(int weight, String color) {
        this.age = 1;
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 1;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
