package com.javarush.test.FullDrawFlatLand1;

import java.util.ArrayList;
import java.util.*;
import java.util.Random;

/**
 * Created by Snik on 14.03.2015.
 */
public class LandGenerator
{
    public ArrayList<Double> X = new ArrayList<Double>();
    public ArrayList<Double> Y = new ArrayList<Double>();
    int levelNumber = 0;
    double R = 0.1; //Шероховатость 0.17

    double xWidth;
    double yHeight;

    public LandGenerator(int x, int y, int lvl)
    {
        this.xWidth = x;
        this.yHeight = y;
        this.levelNumber = lvl;
        double yFactor=0;

        switch (lvl)
        {
            case 1:
                yFactor = 2.1;//2.3
                R = 0.2;
                break;
            case 2:
                yFactor = 1.7;//1.9
                R = 0.16;
                break;
            case 3:
                yFactor = 1.3;
                R = 0.13;
                break;
        }

        X.add(0.0);
        Y.add(yHeight/yFactor);
        X.add(xWidth*2.0);
        Y.add(yHeight/yFactor);


    }

    public void calcPoints()
    {
        while(true)
        {
            for (int p = 0; p < X.size() - 1; p++)
            {
                X.add(p+1, newPointX(X.get(p), X.get(p + 1)));
                Y.add(p+1, newPointY(Y.get(p), Y.get(p + 1),X.get(p), X.get(p + 1),R));
                p++;
            }
            if(X.get(2)-X.get(1) <= 1.0)
                break;
        }
    }

    public  double newPointX(Double x1, Double x2)
    {
        double newX = (x1+x2)/2;
        return newX;
    }

    public  double newPointY(Double y1, Double y2, Double x1, Double x2, Double R) // Добавить рандомную составляющую
    {
        double averageY = (y1+y2)/2; //Вычисляем середину
        double length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double randLow = (R*length)*-1;
        double randomHigh = (R*length);
        Random r = new Random();
        double randRes = randLow + (randomHigh - randLow) * r.nextDouble();
        double newY = averageY+randRes;
        return newY;
    }


    public void doMoveDynamic(int n)
    {
        for (int i = 0; i < n; i++)
        {
            Y.add(Y.remove(0));
        }
    }

}