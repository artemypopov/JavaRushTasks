package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        String file3 = br.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);
        FileOutputStream outputStream3 = new FileOutputStream(file3);

        if (inputStream.available() > 0) {
           byte[] buffer = new byte[inputStream.available()];
           int count  = inputStream.read(buffer);

           outputStream2.write(buffer, 0, (count + 1) / 2);
           outputStream3.write(buffer, (count + 1) / 2, count - (count + 1) / 2);
        }

        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
