package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Administrator on 24.04.15.
 */
public class USD extends Money
{

    public USD(double amount)
    {
        super(amount);
    }



    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
