package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

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

        //заменяем знаки
        input = input.replace(".","!");
        fWrite.write(input);
        fWrite.close();
    }
}
