package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Administrator on 23.04.15.
 */
public class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 30;
    }

    public String getDescription()
    {
        String retVal = super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return retVal;
    }
}



/*


7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
        Методы должны возвращать строку вида:
<getDescription() родительского класса>  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
        где SSSSS - название страны
        где N - количество яиц в месяц

*/
