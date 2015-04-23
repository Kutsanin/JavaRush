package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введите имя файла:");
        String fileName = reader.readLine();
        OutputStream outFile = new FileOutputStream(fileName);
        ArrayList<String> list = new ArrayList<String>();
        //System.out.println("Вводите строки:");
        while(true)
        {
            String s = reader.readLine();
            if(!s.equals("exit"))
            {
                list.add(s);
            }
            else
            {
                list.add(s);
                break;
            }
        }

        for(String s: list)
        {
            char[] tmpArr = s.toCharArray();
            for(char c : tmpArr)
                outFile.write(c);
            outFile.write(13); //новая строка
            outFile.write(10); //новая строка
        }
        outFile.close();
    }
}
