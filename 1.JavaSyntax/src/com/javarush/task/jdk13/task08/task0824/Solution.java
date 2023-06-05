package com.javarush.task.jdk13.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Вся семья в сборе
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Child1", true, 1);
        Human child2 = new Human("Child2", false, 1);
        Human child3 = new Human("Child3", true, 1);
        Human father = new Human("Father", true, 1, child1, child2, child3);
        Human mother = new Human("Mother", false, 1, child1, child2, child3);
        Human grandfather1 = new Human("GrandFather1", true, 1, father);
        Human grandfather2 = new Human("GrandFather2", true, 1, mother);
        Human grandMother1 = new Human("GrandMother1", false, 1, father);
        Human grandMother2 = new Human("GrandMother2", false, 1, mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;

        int age;

        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = Arrays.asList(children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
