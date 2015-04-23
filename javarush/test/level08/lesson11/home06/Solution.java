package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> child = new ArrayList<Human>();
        Human son1 = new Human("Вася",true, 15, new ArrayList<Human>());
        Human son2 = new Human("Лёша", true, 14, new ArrayList<Human>());
        Human daughter = new Human("Лена", false, 18, new ArrayList<Human>());
        child.add(son1);
        child.add(son2);
        child.add(daughter);

        ArrayList<Human> parrents1 = new ArrayList<Human>();
        ArrayList<Human> parrents2 = new ArrayList<Human>();
        Human father = new Human("Ярослав", true, 45, child);
        Human mother = new Human("Клара", false, 42, child);
        parrents1.add(father);
        parrents2.add(mother);

        Human grFather1 = new Human("Даниил", true, 72, parrents1 );
        Human grMother1 = new Human("Вероника", false, 71, parrents1);

        Human grFatger2 = new Human("Андрюха", true, 68, parrents2);
        Human grMother2 = new Human("Лиза", false, 67, parrents2);

        System.out.println(grFather1);
        System.out.println(grMother1);
        System.out.println(grFatger2);
        System.out.println(grMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        //Написать тут ваш код
        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
