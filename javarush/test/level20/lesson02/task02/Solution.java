package com.javarush.test.level20.lesson02.task02;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("saves", ".txt", new File("C:\\jvr\\"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            User user1 = new User();
            user1.setBirthDate(dateFormat.parse("26.12.1991"));
            user1.setCountry(User.Country.RUSSIA);
            user1.setFirstName("Skut");
           // user1.setLastName("Sanin");
            user1.setMale(true);

            User user2 = new User();
            user2.setBirthDate(dateFormat.parse("24.03.1992"));
            user2.setCountry(User.Country.OTHER);
            user2.setFirstName("Helen");
            user2.setLastName("Fox");
            user2.setMale(false);

            javaRush.users.add(user1);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

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

    public static class JavaRush {
        public List<User> users = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            for(User user : users) {
                writer.println("@"); //символ начала профиля юзера
                String firstName = (user.getFirstName() != null) ? user.getFirstName() : "noName";
                writer.println(firstName); //пишем имя
                String lastName = (user.getLastName() != null) ? user.getLastName() : "noLastname";
                writer.println(lastName); //пишем фамилию
                writer.println(dateFormat.format(user.getBirthDate())); //пишем др
                writer.println(String.valueOf(user.isMale())); //пишем пол true - муж
                writer.println(user.getCountry()); //пишем страну
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while(reader.ready()) {
                String newUser = reader.readLine();
                if(newUser.equals("@")) {
                    User user = new User();
                    String firstName = reader.readLine();
                    user.setFirstName(firstName.equals("noName") ? null : firstName); //получаем имя юзера
                    String lastName = reader.readLine();
                    user.setLastName(lastName.equals("noLastname") ? null : lastName); //получаем фамилию юзера
                    user.setBirthDate(dateFormat.parse(reader.readLine())); //получаем др
                    String male = reader.readLine();
                    user.setMale(male.equals("true")); //получаем пол
                    user.setCountry(User.Country.valueOf(reader.readLine())); //получаем страну

                    users.add(user);
                }
            }
            reader.close();
        }
    }
}
