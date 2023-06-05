package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Шахматы";
        collection[0] = chess;

        //напишите тут ваш код
        BoardGame chess1 = new BoardGame();
        chess1.name = "Шахматы1";
        collection[1] = chess1;

        BoardGame chess2 = new BoardGame();
        chess2.name = "Шахматы2";
        collection[2] = chess2;

        BoardGame chess3 = new BoardGame();
        chess3.name = "Шахматы3";
        collection[3] = chess3;

        BoardGame chess4 = new BoardGame();
        chess4.name = "Шахматы4";
        collection[4] = chess4;




        System.out.println(Arrays.toString(collection));
    }
}