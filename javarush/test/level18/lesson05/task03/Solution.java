package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);
        int fileCount1 = 0;
        int fileCount2 = 0;

        if(file1.available()%2 == 0) {
            fileCount1 = file1.available()/2;
            byte[] buff = new byte[fileCount1];
            while(file1.available() > 0 ) {
                file1.read(buff);
                file2.write(buff);
                file1.read(buff);
                file3.write(buff);
            }
        }
        else {
            fileCount2 = file1.available()/2;
            fileCount1 = file1.available() - fileCount2;
            byte[] buff1 = new byte[fileCount1];
            byte[] buff2 = new byte[fileCount2];
            while(file1.available() > 0 ) {
                file1.read(buff1);
                file2.write(buff1);
                file1.read(buff2);
                file3.write(buff2);
            }
        }
        file1.close();
        file2.close();
        file3.close();
        reader.close();
    }
}
