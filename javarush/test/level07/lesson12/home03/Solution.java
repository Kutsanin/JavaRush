package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++ )
            list.add(Integer.parseInt(reader.readLine()));




        //Напишите тут ваш код


        System.out.println(maximumFx(list)+" "+minimumFx(list));
    }

    public static int minimumFx(ArrayList<Integer> list)
    {
        int  minimum=list.get(0);
        for(int i = 0; i<list.size(); i++)
        {
            if (minimum > list.get(i))
                minimum = list.get(i);
        }

        return minimum;
    }

    public static int maximumFx(ArrayList<Integer> list)
    {
        int  maximum=list.get(0);
        for(int i = 0; i<list.size(); i++)
        {
            if (maximum < list.get(i))
                maximum = list.get(i);
        }
        return maximum;
    }
}


