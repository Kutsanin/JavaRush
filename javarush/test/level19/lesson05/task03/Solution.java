package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String input = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();
        FileReader fRead = new FileReader(f1);
        FileWriter fWrite = new FileWriter(f2,true);
        //читаем файл
        while (fRead.ready()) {
            input+=(char)fRead.read();
        }

        fRead.close();
        //разбиваем по пробелам
        String[] inputSplit = input.split(" ");

        //избавляемся от лишних символов(все кроме 0-9)
        //и записываем в промежуточный String
        String result = "";
        for(String s: inputSplit) {
            try {
                Integer.parseInt(s);
                result+=s + " ";
            }
            catch(Exception e) {}
        }
        //пишем в файл
        fWrite.write(result);
        fWrite.close();
    }
}
