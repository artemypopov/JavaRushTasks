package com.javarush.task.jdk13.task16.task1605;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;

/* 
Пробрасываем исключения
*/

public class Solution {

    public void method1() throws SocketException {
        throw new SocketException();

    }
    public void method2() throws FileNotFoundException {

    }
    public void method3() throws NumberFormatException {

    }
    public void method4() throws ArithmeticException {

    }
}
