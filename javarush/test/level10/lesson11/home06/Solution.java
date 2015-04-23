package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        String sex;
        int age;
        int weigth;
        int height;
        boolean happy;

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, String sex)
        {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, int weigth, String sex)
        {
            this.name = name;
            this.weigth =weigth;
            this.sex = sex;
        }

        public Human(String name, String sex, boolean happy)
        {
            this.name = name;
            this.sex = sex;
            this.happy = happy;
        }

        public Human(int age, int weigth, int height)
        {
            this.age = age;
            this.weigth = weigth;
            this.height = height;

        }

        public Human(String name, int weight, int height, boolean happy)
        {
            this.name = name;
            this.weigth = weight;
            this.height = height;
            this.happy = happy;
        }

        public Human(String name, String sex, int weight, int height, boolean happy)
        {
            this.name = name;
            this.weigth = weight;
            this.height = height;
            this.happy = happy;
            this.sex = sex;
        }
        public Human(String name, String sex, int weight, int age, int height, boolean happy)
        {
            this.name = name;
            this.weigth = weight;
            this.height = height;
            this.happy = happy;
            this.sex = sex;
            this.age = age;
        }
    }
}
