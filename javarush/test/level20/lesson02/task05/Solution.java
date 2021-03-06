package com.javarush.test.level20.lesson02.task05;

import java.io.*;

/* И еще раз о синхронизации
Разберитесь почему не работает метод main()
Реализуйте логику записи в файл и чтения из файла для класса Object
Метод load должен инициализировать объект данными из файла
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {

    public static void main(java.lang.String[] args) {
        int i = 1;
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("saves05", ".txt", new File("C:\\jvr\\"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Object object = new Object();
            object.string1 = new String();   //string #1
            object.string2 = new String();   //string #2
            object.save(outputStream);
            outputStream.flush();

            Object loadedObject = new Object();
            loadedObject.string1 = new String(); //string #3
            loadedObject.string2 = new String(); //string #4


            loadedObject.load(inputStream);
            //check here that the object variable equals to loadedObject - проверьте тут, что object и loadedObject равны
            object.string1.print();
            object.string2.print();
            loadedObject.string1.print();
            loadedObject.string2.print();

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Object {
        public String string1;
        public String string2;

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            java.lang.String hasString1 = (string1 != null) ? "yes" : "no";
            writer.println(hasString1);
            currentValue = countStrings-1;
            java.lang.String hasString2 = (string1 != null) ? "yes" : "no";
            writer.println(hasString2);
            currentValue = currentValue-1;
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            int countStringsTmp = countStrings;
            countStrings = currentValue;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            java.lang.String hasString1 = reader.readLine();
            if(hasString1.equals("yes"))
                this.string1 = new String();
            java.lang.String hasString2 = reader.readLine();
            if(hasString2.equals("yes"))
                this.string2 = new String();
            reader.close();
            countStrings = countStringsTmp;
        }
    }

    public static int countStrings;
    public  static int currentValue;

    public static class String {
        private final int number;

        public String() {
            number = ++countStrings;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }
}
