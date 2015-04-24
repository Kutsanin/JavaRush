package com.javarush.test.level14.lesson08.home09;
/*
1. Реализуй метод getAmount в классе Money:
        1.1. Подумай, какого типа нужно создать приватную переменную, если метод getAmount будет ее возвращать.
        1.2. Создай приватную переменную этого типа и верни ее в методе getAmount.
        1.3. В конструкторе присвой ей значение, полученное параметром.
*/

public abstract class Money
{
    private double amount;

    public Money(double amount)
    {
        this.amount = amount;
    }

    public double getAmount()
    {
        return amount;
    }

    public abstract String getCurrencyName();
}

