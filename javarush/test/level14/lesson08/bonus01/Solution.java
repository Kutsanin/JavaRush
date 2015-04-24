package com.javarush.test.level14.lesson08.bonus01;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try //1
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try //2
        {
           throw new NullPointerException("lol");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //3
        {
            int[] a = new int[2];
            int b = a[1] + a[5];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //4
        {
            throw new RuntimeException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //5
        {
            throw new ClassCastException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try //6
        {
            throw new ArrayStoreException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //7
        {
            throw new CloneNotSupportedException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //8
        {
            throw new NoSuchMethodException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //9
        {
            int[] b = new int[-2];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try //10
        {
            throw new IllegalAccessException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        //Add your code here

    }
}
