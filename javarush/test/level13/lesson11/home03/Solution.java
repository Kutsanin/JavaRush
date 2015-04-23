package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inputFile = new FileInputStream(fileName);
        while(inputFile.available() > 0)
        {
            char data = (char)inputFile.read();
            System.out.print(data);
        }
        inputFile.close();
    }
}
