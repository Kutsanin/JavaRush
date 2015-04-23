package com.javarush.test.FullDrawFlatLand1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 17.03.15.
 */
public class StarGenerator
{
    double y;
    double x;
    ArrayList<Double> XY1 = new ArrayList<Double>(); //яркие звезды
    ArrayList<Double> XY2 = new ArrayList<Double>(); //Средние звезды
    ArrayList<Double> XY3 = new ArrayList<Double>(); //Тусклые звезды


    public StarGenerator(double x, double y)
    {
        this.y = y/1.6;
        this.x = x;



    }

    public void calcPoints()
    {
        for (double i = 0; i < y; i += 6.9)//i+=3.9
        {
            for (int k = 0; k < 2; k++)
            {
                double xPos = newStar(0, x);
                XY1.add(xPos);//Добавляем Координату по Х
                XY1.add(i); //Добавляем координату по Y
            }
            for (int k = 0; k < 2; k++)
            {
                double xPos = newStar(0, x);
                XY2.add(xPos);//Добавляем Координату по Х
                XY2.add(i); //Добавляем координату по Y
            }
            for (int k = 0; k < 2; k++)
            {
                double xPos = newStar(0, x);
                XY3.add(xPos);//Добавляем Координату по Х
                XY3.add(i); //Добавляем координату по Y
            }

        }
    }

    public static  double newStar(double x1,double x2)
    {
        Random r = new Random();
        double xLow = x1;
        double xHigh = x2;
        double randX = xLow + (xHigh - xLow) * r.nextDouble();
        return randX;
    }
}
