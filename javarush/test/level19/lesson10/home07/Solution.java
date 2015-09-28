package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileIn = args[0];
        String fileOut = args[1];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOut));
        String nextLine = "";
        String result = "";

        while((nextLine = fileReader.readLine()) != null) {
            String[] arr = nextLine.split(" ");
            String out = "";
            for(String s : arr) {
                if(s.length() > 6) {
                    out+= s + ",";
                }
            }
            result += out;
        }
        result = result.substring(0, result.length() - 1);
        fileWriter.write(result);
        fileReader.close();
        fileWriter.close();

    }
}
