package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        String input;
        ArrayList<String> fileList = new ArrayList<String>();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while ((input = fileReader.readLine()) != null)
            fileList.add(input);
        fileReader.close();

        for (String aFileList : fileList)
        {
            String[] arr = aFileList.split(" ");
            String name = "";
            for (int i = 0; i < arr.length-3; i++) {
                if (i == arr.length-4)
                    name = name+arr[i];
                else
                    name = name+arr[i]+" ";
            }
            int year = Integer.parseInt(arr[arr.length-1]);
            int month = Integer.parseInt(arr[arr.length-2])-1;
            int day = Integer.parseInt(arr[arr.length-3]);
            Date birthDay = new GregorianCalendar(year, month, day).getTime();
            PEOPLE.add(new Person(name, birthDay));
        }
    }
}
