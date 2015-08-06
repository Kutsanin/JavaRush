package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String key = args[0];
        FileInputStream in = new FileInputStream(args[1]);
        FileOutputStream out = new FileOutputStream(args[2]);
        byte[] dataIn = new byte[in.available()];
        in.read(dataIn);
        in.close();

        out.write(crypt(dataIn));
        out.close();
    }

    public static byte[] crypt(byte[] in) {
        byte[] res = new byte[in.length];
        for(int i = 0; i < in.length; i++) {
            res[i] = (byte) (in[i] ^ 5);
        }
        return res;
    }
}

