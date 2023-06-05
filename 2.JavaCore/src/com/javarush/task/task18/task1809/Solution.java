package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        ArrayList<Integer> line = new ArrayList<>();
        while (inputStream.available() > 0) {
            int count  = inputStream.read();
            line.add(count);
        }

        for (int i = line.size() - 1;  i >= 0 ; i--) {
            outputStream.write(line.get(i));
        }

        inputStream.close();
        outputStream.close();

    }
}
