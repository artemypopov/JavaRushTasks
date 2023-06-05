package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:

3
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся
 чисел состоит из трех четверок.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        int numberI;
        int numberJ;
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; ;) {
                numberI = numbers.get(i);
                numberJ = numbers.get(j);
                if (numberI == numberJ) {
                    max++;
                }
            }
        }

        System.out.println(max);
    }
}
