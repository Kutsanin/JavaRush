package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Написать тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] array = s.toCharArray();
        char[] arrayVowels = s.toCharArray();
        ArrayList<Character> arrCh1 = new ArrayList<Character>();
        ArrayList<Character> arrCh2 = new ArrayList<Character>();

        for(int i = 0 ; i < array.length; i++)
        {
            if(isVowel(array[i]))
            {
                arrCh1.add(array[i]);
                arrCh1.add(' ');
            }
            else if(array[i] != ' ')
            {
                arrCh2.add(array[i]);
                arrCh2.add(' ');
            }
        }
        for(int i = 0 ; i < arrCh1.size()-1; i++)
        {
            System.out.print(arrCh1.get(i));
        }
        System.out.println();
        for(int i = 0 ; i < arrCh2.size()-1; i++)
        {
            System.out.print(arrCh2.get(i));
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
