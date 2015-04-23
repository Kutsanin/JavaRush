package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("MARCH 17 2015");
    }

    public static boolean isDateOdd(String date)
    {
        Date today = new Date(date);
        Date startYear = new Date();
        startYear.setMonth(0);
        startYear.setDate(1);
        long msDay = 24 * 60 * 60 * 1000; //сколько милисекунд в сутках
        long howManyMs = today.getTime() - startYear.getTime();

        int howManyDays = (int) (howManyMs/msDay);
        if(howManyDays%2 == 0)
            return true;
        else return false;
    }
}
