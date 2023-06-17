package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        String inputDate = args[3];
        System.out.println(inputDate);
        SimpleDateFormat inputFormatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(inputFormatter);
//        Date date =
////        System.out.println(date);
//        SimpleDateFormat outputFormatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//        System.out.println(outputFormatter);
//        String outputDate = outputFormatter.format(date);
//        System.out.println(outputDate);

//        if (args[0].equals("-c")) {
//            if (args[2].equals("м")) {
//                allPeople.add(Person.createMale(args[1], new Date()))
//            }
//        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);


    }
}
