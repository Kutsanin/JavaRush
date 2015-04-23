package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        set.add("Лось");
        set.add("Лук");
        set.add("Люк");
        set.add("Лак");
        set.add("Лал");
        set.add("Лоло");
        set.add("Лол");
        set.add("Лупа");
        set.add("Лучок");
        set.add("Ладога");
        set.add("Либрети");
        set.add("Лох");
        set.add("Лава");
        set.add("Лёд");
        set.add("Лом");
        set.add("Ложка");
        set.add("Литер");
        set.add("Лажа");
        set.add("Лейка");
        set.add("Лоб");

        return set;
    }
}
