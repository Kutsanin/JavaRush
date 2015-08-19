package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1, f2;
        f1 = reader.readLine();
        f2 = reader.readLine();
        FileReader in = new FileReader(f1);
        FileWriter out = new FileWriter(f2);
        String input = "";
        String output = "";
        //читаем входные данные
        while(in.ready()) {
            input+=(char)in.read();
        }
        byte[] inputB = input.getBytes();

        for(int i = 0; i < inputB.length; i++) {
            if(i%2 == 0) {
                out.write(inputB[i]);
            }
        }
        reader.close();
        in.close();
        out.close();
    }
}
