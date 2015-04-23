package com.javarush.test.test1;

/**
 * Created by Administrator on 23.03.15.
 */
public class newMain
{
    public static void main(String[] args)
    {
        System.out.println("Program starting.");
        try
        {
            System.out.println("Before method1 calling.");

            method1();

            System.out.println("After method1 calling. Never showed.");
        }

        catch (NullPointerException e)
        {
            System.out.println("Reference is null. Exception caught.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divided by zero. Exception caught.");
        }
        catch (Exception e)
        {
            System.out.println("Any other errors. Exception caught.");
        }

        System.out.println("Program still running.");
    }

    public static void method1()
    {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}
