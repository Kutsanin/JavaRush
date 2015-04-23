package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine()); //вводим n
        int m = Integer.parseInt(reader.readLine()); //вводим m

        ArrayList<String> list = new ArrayList<String>(); //создаём список

        for (int i=0;i<n;i++) list.add(reader.readLine()); //вводим n строк

        //переставляем m первых строк в конец списка
        //т.е. копируем и удаляем
        //так как мы удаляем строки, то работаем всегда с 0 позицией
        for (int i=0; i<m; i++){
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }

        //печатаем
        for (String s : list) System.out.println(s);
    }
}
