package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла ok
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines ok
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines ok
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных ok
4.2. выбросить исключение CorruptedDataException ok
Сигнатуру метода main не менять.  Метод joinData должен вызываться в main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String fileOne = reader.readLine();
            String fileTwo = reader.readLine();
            readFile(fileOne, allLines);
            readFile(fileTwo, forRemoveLines);
            new Solution().joinData();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void joinData () throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines))
        {
            allLines.removeAll(forRemoveLines);
        }
        else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }

    public static void readFile(String fileName, List<String> list) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while(reader.ready())
        {
            String s = reader.readLine();
            list.add(s);
        }
    }
}
