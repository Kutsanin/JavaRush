package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь. так, чтобы он мог описать данную ситуацию.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String dedName = reader.readLine();
        Cat catDed = new Cat(dedName);

        String babName = reader.readLine();
        Cat catBab = new Cat(babName);

        String fatherName = reader.readLine(); //Создаем папу
        Cat catFather = new Cat(fatherName, catDed, null);

        String motherName = reader.readLine(); //Создаем маму
        Cat catMother = new Cat(motherName, null, catBab);

        String daughterName = reader.readLine(); //Создаем дочь
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        System.out.println(catDed);
        System.out.println(catBab);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSon);


    }

    public static class Cat
    {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) //кот Дед и бабушка
        {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) //Кот Сын и дочь, мама папа
        {
            this.name = name;
            this.mother = mother;
            this.father = father;

        }


        @Override
        public String toString()
        {
            if ((mother == null) && (father == null))
                return "Cat name is " + name + ", no mother" + ", no father ";
            else
            if (mother == null)
                return "Cat name is " + name + ", no mother" + ", father is " + father.name;
            else
            if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
