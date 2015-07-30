package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
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
        String f3 = reader.readLine();
        FileOutputStream file1 = new FileOutputStream(f1);
        FileInputStream file2 = new FileInputStream(f2);
        FileInputStream file3 = new FileInputStream(f3);

        if(file2.available() > 0) {
            byte[] buffer = new byte[file2.available()];
            int count = file2.read(buffer);
            file1.write(buffer, 0, count);
        }

        if(file3.available() > 0) {
            byte[] buffer = new byte[file3.available()];
            int count = file3.read(buffer);
            file1.write(buffer, 0, count);
        }

        file1.close();
        file2.close();
        file3.close();



    }
}
