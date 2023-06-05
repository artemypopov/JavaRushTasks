package com.javarush.task.jdk13.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> set = new HashSet<>();
        set.add(new Dog());
        set.add(new Dog());
        set.add(new Dog());
        return set;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> setCatAndDog = new HashSet<>(cats);

        setCatAndDog.addAll(dogs);
        return setCatAndDog;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        Iterator<Cat> iteratorCat;

        Object obj;
        Cat cat;

        while (iterator.hasNext()) {
            obj = iterator.next();
            iteratorCat = cats.iterator();
            while (iteratorCat.hasNext()) {
                cat = iteratorCat.next();
                if (obj.equals(cat)) {
                    iterator.remove();
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    //напишите тут ваш код
    public static class Cat {

    }

    public static class Dog {

    }
}
