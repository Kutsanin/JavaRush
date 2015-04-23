package com.javarush.test.FullDrawFlatLand1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Snik on 20.03.2015.
 */
public class ActionFrame
{
    int fps = 0;
    int speed = 0; //10 - slow, 1 - fast
    int width = 0;
    int height = 0;
    public ActionFrame()
    {
        width = 1980;
        height = 1030;
        fps = 30;
        speed = 5;
    }

    public ActionFrame(int width, int height, int fps, int speed)
    {
        this.width = width;
        this.height = height;
        this.fps = fps;
        this.speed = speed;
    }
    public void createFrame()
    {
        JFrame frame = new CreateWindow(width, height);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(17, 14, 25));
        //frame.getContentPane().setBackground(new Color(	117, 187, 253));
        //формируем первый уровень:
        LandGenerator points_1lvl = new LandGenerator(frame.getWidth(), frame.getHeight(),1);
        points_1lvl.calcPoints();

        //Формируем второй уровень:
        LandGenerator points_2lvl = new LandGenerator(frame.getWidth(), frame.getHeight(),2);
        points_2lvl.calcPoints();

        //Формируем третий уровень:
        LandGenerator points_3lvl = new LandGenerator(frame.getWidth(), frame.getHeight(),3);
        points_3lvl.calcPoints();

        //Формируем звезды
        StarGenerator stars = new StarGenerator(frame.getWidth(), frame.getHeight());
        stars.calcPoints();

        //Рисуем все уровни:
        DrawSomeLevels levels3 = new DrawSomeLevels(points_1lvl.X, points_1lvl.Y,
                points_2lvl.X, points_2lvl.Y,
                points_3lvl.X, points_3lvl.Y,
                stars.XY1, stars.XY2, stars.XY3,
                frame.getWidth(), frame.getHeight(), fps) ;

        frame.getContentPane().add(levels3);

        frame.setSize(width, height);

        Mover move = new Mover(points_1lvl, points_2lvl, points_3lvl, speed);
        move.doStep();

    }

}
