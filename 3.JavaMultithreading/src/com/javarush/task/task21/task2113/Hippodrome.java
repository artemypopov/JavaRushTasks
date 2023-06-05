package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    static Hippodrome game;

    public static void main(String[] args) {

        Horse horse1 = new Horse("Лошадь1", 3, 0);
        Horse horse2 = new Horse("Лошадь2", 3, 0);
        Horse horse3 = new Horse("Лошадь3", 3, 0);

        List<Horse> horses = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);

        game.run();

        game.printWinner();
    }

    void run() {
        for (int i = 0; i < 100 ; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            getHorses().get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++) {
            getHorses().get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        int max = 0;
        int intDistance = 0;

        int index = 0;
        for (int i = 0; i < horses.size(); i++) {
            intDistance = (int) getHorses().get(i).getDistance();
            if (max < intDistance) {
                index = i;
            }
        }
        return getHorses().get(index);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
