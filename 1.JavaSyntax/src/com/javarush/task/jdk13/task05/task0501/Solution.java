package com.javarush.task.jdk13.task05.task0501;

/* 
Кошачья бойня(1)
*/

public class Solution {

    public static class Cat {
        //напишите тут ваш код
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int fightAge = Integer.compare(this.age, anotherCat.age);
            int fightWeight = Integer.compare(this.weight, anotherCat.weight);
            int fightStrength = Integer.compare(this.strength, anotherCat.strength);

            int fight = fightAge + fightStrength + fightWeight;
            return fight > 0;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("name1", 1, 1, 1);
        Cat cat2 = new Cat("name2", 2, 3, 1);
        Cat cat3 = new Cat("name3", 1, 3, 2);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));

    }
}
