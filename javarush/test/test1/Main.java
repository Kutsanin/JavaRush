package com.javarush.test.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 10.03.15.
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            int glub = 0, track = 0, sqr = 0;
            System.out.println("Введите номер дорожки (1-3)");
            track = Integer.parseInt(reader.readLine());

            System.out.println("Введите глубину дефекта (1-36)");
            glub = Integer.parseInt(reader.readLine());

            if (glub != 0)
            {
                if (track == 1 || track == 2)
                {
                    if (glub <= 12)
                        sqr = 38 - 1;
                    else if (glub >= 25)
                        sqr = 38 + 1;
                    else sqr = 38;
                } else
                {
                    if (glub <= 12)
                        sqr = 41 - 1;
                    else if (glub >= 25)
                        sqr = 41 + 1;
                    else sqr = 41;
                }
            }
            System.out.println("Квадрат: " + sqr);
        }
    }
}
