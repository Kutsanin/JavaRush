package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать во второй файл
Закрыть потоки
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        FileInputStream in = new FileInputStream(f1);
        BufferedWriter out = new BufferedWriter(new FileWriter(f2));
        byte[] buffer1 = new byte[in.available()];
        in.read(buffer1);
        in.close();

        String input = new String(buffer1, "UTF-8");
        String[] inputSpl = input.split(" ");

        String output = "";

        for(String s : inputSpl) {
            double d = Math.round(Double.parseDouble(s));
            output = output + (int)d + " ";
        }

        out.write(output);
        out.close();
    }
}
