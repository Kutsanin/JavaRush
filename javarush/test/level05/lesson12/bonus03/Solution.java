package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(reader.readLine()); //вводим с консоли число N
        //int n = 0;


        int maximum = 0; //Инициализируем максимум

        for(int i = 0; i < n; i++)
        {
            int tmp = Integer.parseInt(reader.readLine());
            if(i==0)
                maximum = tmp;
            if(tmp>maximum)
                maximum = tmp;
        }

        System.out.println(maximum);
    }
}
