package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Administrator on 24.04.15.
 */
public class Mouse implements CompItem
{
    @Override
    public String getName()
    {
        return getClass().getSimpleName();
    }
}
