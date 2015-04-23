package com.javarush.test.test.kustsanin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * заготовки на формирование ландшафта
 */
public class pointUP
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //создаем основной массивы x и y:
        ArrayList<Double> pointsX = new ArrayList<Double>();
        ArrayList<Double> pointsY = new ArrayList<Double>();
        double R = 0.1; //Шероховатость
        int n = 0;

        pointsX.add(0.0);
        pointsY.add(1.0);
        pointsX.add(10.0);
        pointsY.add(1.0);

        //Выводим начальные координаты:
        System.out.println("Начальные координаты");

        for(int i = 0; i < pointsX.size(); i++)
        {
            System.out.print("(x = " +pointsX.get(i) + " y = "+ pointsY.get(i)+")");
        }
        System.out.println();
        System.out.println("Задайте коэффициент шероховатости(0.0 - 1.0):");
        R = Double.parseDouble(reader.readLine());

        while(true)
        {


            System.out.println("Добавим средние точки?? (y/n)");

            String answer = reader.readLine();

            if (answer.equals("y"))
            {
                //запускаем цикл добавления числа
                for (int p = 0; p < pointsX.size() - 1; p+=2)
                {
                    pointsX.add(p+1, newPointX(pointsX.get(p), pointsX.get(p + 1)));
                    pointsY.add(p+1, newPointY(pointsY.get(p), pointsY.get(p + 1),pointsX.get(p), pointsX.get(p + 1),R));
                    //p++;
                    n++;
                }
                n=0;
            }
            else
            {
                System.out.println("Выходим!");
                break;
            }

            //Цикл вывода массива:
            for (int i = 0; i < pointsX.size(); i++)
                System.out.print("(x"+i+" = " +pointsX.get(i) + " y"+i+" = "+ pointsY.get(i)+")");
            System.out.println();
        }

    }
    public static double newPointX(Double x1, Double x2)
    {
        double newX = (x1+x2)/2;
        return newX;
    }

    public static double newPointY(Double y1, Double y2, Double x1, Double x2, Double R) // Добавить рандомную составляющую
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

}




