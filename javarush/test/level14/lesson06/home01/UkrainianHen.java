package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Administrator on 23.04.15.
 */
public class UkrainianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 5;
    }

    public String getDescription()
    {
        String retVal = super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return retVal;
    }
}
