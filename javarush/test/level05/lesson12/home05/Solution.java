package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму,
пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String in;
        String quit = "сумма";

        while (true)
        {
            int pl = 0;
            in = reader.readLine();
            if (!in.equals(quit))
            {
                pl = Integer.parseInt(in);
                sum += pl;
            }
            else
            {
                System.out.println(sum);
                break;
            }
        }
    }
}