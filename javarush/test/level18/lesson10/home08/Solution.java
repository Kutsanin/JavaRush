package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> names = new ArrayList<String>();
        String tmp;
        while(true) {
            tmp = reader.readLine();
            if(!tmp.equals("exit")) {
                names.add(tmp);
            }
            else break;
        }
        reader.close();

        for(String s : names) {
            ReadThread thr = new ReadThread(s);
            thr.start();
            thr.join();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run(){
            try{
                FileInputStream in = new FileInputStream(fileName);
                ArrayList<Integer> list = new ArrayList<Integer>();
                while (in.available() > 0){
                    int data = in.read();
                    list.add(data);
                }
                in.close();

                int max = 0;
                int id = 0;
                int count;

                for(int a = 0; a < list.size(); a++){
                    count = Collections.frequency(list, list.get(a));
                    if(count>max){
                        max = count; id = list.get(a);
                    }
                }

                resultMap.put(fileName,id);

            }catch (Exception e){

            }
        }
    }
}
