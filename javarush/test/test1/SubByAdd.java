package com.javarush.test.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Оператор on 14.12.2015.
 */
public class SubByAdd
{
    public static void main(String[] args) throws IOException
    {
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;
        String[] s = new String[2];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s[0] = reader.readLine();
        s[1] = reader.readLine();
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);

        sum = a + b;

        sub = ((a + (~b + 1)) << 1) >>> 1;

        System.out.println("sum: " + a + " + " + b + " = " + sum);
        System.out.println("sub: " + a + " - " + b + " = " + sub);
    }
}
