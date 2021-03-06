package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream file = new FileInputStream(fileName);
        ArrayList<Integer> allBytes = new ArrayList<Integer>();
        ArrayList<Integer> resultBytes = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        String result = "";

        while(file.available()>0) {
            int tmp = file.read();
            allBytes.add(tmp);
        }


        //считаем количество повторов:

        int[] count = new int[allBytes.size()];
        for (int i = 0; i < allBytes.size(); i++) {
            for (int j = i+1; j < allBytes.size()-1; j++) {
                if (allBytes.get(i).equals(allBytes.get(j)) )
                    count[i] += 1;
            }
        }

        //определяю максимальное значение
        for (int n : count) {
            if(n > max) max = n;
        }

        for(int i = 0; i < allBytes.size(); i++) {
            if(!resultBytes.contains(allBytes.get(i)) && count[i]==max)
            {
                resultBytes.add(allBytes.get(i));
            }
        }

        for(int n : resultBytes)
            result += n + " ";

        System.out.println(result);
        reader.close();
        file.close();
    }
}
