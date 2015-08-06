package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<File> files = new TreeSet<>();
        String tmpName = "";
        //создаем список файлов
        while(true) {
            if(!(tmpName = reader.readLine()).equals("end")) {
                File file = new File(tmpName);
                files.add(file);
            }
            else break;
        }
        reader.close();

        String folder = files.iterator().next().getAbsolutePath(); //получаем название файла
        folder = folder.substring(0, folder.length() - 6); // получаем путь+название файла без partN
        FileOutputStream out = new FileOutputStream(folder, true);

        for(File f : files) { //перебираем файлы и записываем в выходной файл
            FileInputStream in = new FileInputStream(f);
            byte[] data  = new byte[in.available()];
            in.read(data);
            in.close();
            out.write(data);
        }
        out.close();
    }
}
