package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int a = Integer.parseInt(reader.readLine());
        //int b = Integer.parseInt(reader.readLine());
        int[] arr = {0,0,0,0,0};
        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());
        arr[3] = Integer.parseInt(reader.readLine());
        arr[4] = Integer.parseInt(reader.readLine());
        Arrays.sort(arr);

        //int minimum = min(a, b);

        System.out.println("Minimum = " + arr[0]);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

}
