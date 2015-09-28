package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileIn = args[0];
        String fileOut = args[1];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOut)));
        String nextLine = "";
        String tmp = "";
        while((nextLine = fileReader.readLine()) != null) {
            tmp += " " + nextLine;
        }
        String[] arr = tmp.split(" ");
        for(String s : arr) {
            System.out.println(s);
            String sTmp = s.replaceAll("[^0-9]","");
            if(!sTmp.equals(""))
                fileWriter.write(s+" ");
        }
        fileReader.close();
        fileWriter.close();
    }
}
