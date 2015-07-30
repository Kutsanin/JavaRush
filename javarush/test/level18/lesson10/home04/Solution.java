package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        FileInputStream in1 = new FileInputStream(f1);
        FileInputStream in2 = new FileInputStream(f2);

        byte[] buffer1 = new byte[in1.available()];
        in1.read(buffer1);
        in1.close();

        byte[] buffer2 = new byte[in2.available()];
        in2.read(buffer2);
        in2.close();

        FileOutputStream out = new FileOutputStream(f1);
        out.write(buffer2);
        out.close();

        FileOutputStream fileOutputStream11 = new FileOutputStream(f1, true);
        fileOutputStream11.write(buffer1);
        fileOutputStream11.close();
    }
}
