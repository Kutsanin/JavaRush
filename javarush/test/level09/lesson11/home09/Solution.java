package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<String, Cat>();
        Cat cat1 = new Cat("Вася");
        Cat cat2 = new Cat("Лёша");
        Cat cat3 = new Cat("Коля");
        Cat cat4 = new Cat("Тузик");
        Cat cat5 = new Cat("Дима");
        Cat cat6 = new Cat("Костя");
        Cat cat7 = new Cat("Рома");
        Cat cat8 = new Cat("Сережа");
        Cat cat9 = new Cat("Лена");
        Cat cat10 = new Cat("Бэта");
        cats.put(cat1.name, cat1);
        cats.put(cat2.name, cat2);
        cats.put(cat3.name, cat3);
        cats.put(cat4.name, cat4);
        cats.put(cat5.name, cat5);
        cats.put(cat6.name, cat6);
        cats.put(cat7.name, cat7);
        cats.put(cat8.name, cat8);
        cats.put(cat9.name, cat9);
        cats.put(cat10.name, cat10);
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код
        Set<Cat> catsSet = new HashSet<Cat>();
        for(Map.Entry<String, Cat> pair : map.entrySet())
        {
            Cat a = pair.getValue();
            catsSet.add(a);
        }
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
