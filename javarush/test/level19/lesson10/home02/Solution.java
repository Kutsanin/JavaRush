package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        String nextLine = "";
        Double max = Double.MIN_VALUE;
        String result = "";
        while ((nextLine = fileReader.readLine()) != null) {
            String[] arr = nextLine.split(" ");
            if(map.containsKey(arr[0])) {
                Double addDouble = map.get(arr[0]) + Double.parseDouble(arr[1]);
                map.put(arr[0], addDouble);
            }
            else map.put(arr[0], Double.parseDouble(arr[1]));
        }
        for(Map.Entry<String, Double> entry : map.entrySet()) {
            Double tmp = entry.getValue();
            if(tmp > max) max = tmp;
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                result = result + entry.getKey() + " ";
            }
        }
        System.out.println(result);
        fileReader.close();
    }
}
