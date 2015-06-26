package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = reader.readLine();
        String file2Name = reader.readLine();
        FileInputStream file1 = new FileInputStream(file1Name);
        FileOutputStream file2 = new FileOutputStream(file2Name);
        byte[] buf = new byte[file1.available()];
        file1.read(buf);
        for(int i = buf.length-1; i >= 0; i--) {
            file2.write(buf[i]);
        }
        file1.close();
        file2.close();
        reader.close();
    }
}
