package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = {0,0,0};
        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());
        System.out.println(mid3(arr[0], arr[1], arr[2]));
    }

    public static int mid3(int a, int b, int c)
    {
        return ((b < a && b > c)||(b > a && b < c)) ? b : ((a < b && a > c)||(a > a && a < c)? a : c);
    }
}
