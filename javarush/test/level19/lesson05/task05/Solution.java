package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
Закрыть потоки. Не использовать try-with-resources
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких либо файлов.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        FileReader fRead = new FileReader(f1);
        FileWriter fWrite = new FileWriter(f2, true);
        String input = "";
        reader.close();
        //считываем файл
        while(fRead.ready()) {
            input+=(char)fRead.read();
        }
        //разбиваем файл для сохранения пробелов
        String[] inputSplit = input.split(" ");
        //избавляемся от знаков пунктуации
        for(String s : inputSplit) {
            s = s.replaceAll("[^A-Za-z0-9]", "");
            if(!s.equals("")) {
                fWrite.write(s + " ");
            }
        }
        fRead.close();
        fWrite.close();
    }
}
