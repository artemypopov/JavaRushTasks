package com.javarush.task.task11.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FifthThread extends Thread {

    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum = 0;
        while (true) {
            try {
                s = bufferedReader.readLine();
                if (s.equals("N")) {
                    break;
                } else {
                    sum = sum + Integer.parseInt(s);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(sum);
        }
    }
}
