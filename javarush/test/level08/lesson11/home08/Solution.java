package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[array.length-1]);
        System.out.println(array[array.length-2]);
        System.out.println(array[array.length-3]);
        System.out.println(array[array.length-4]);
        System.out.println(array[array.length-5]);
    }

    public static void sort(int[] array)
    {
        Arrays.sort(array);
    }
}
