package com.javarush.test.FullDrawFlatLand1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Created by Snik on 14.03.2015.
 */
public class DrawSomeLevels extends JComponent implements ActionListener
{
    ArrayList<Double> pointsX1 = new ArrayList<Double>();
    ArrayList<Double> pointsY1 = new ArrayList<Double>();
    ArrayList<Double> pointsX2 = new ArrayList<Double>();
    ArrayList<Double> pointsY2 = new ArrayList<Double>();
    ArrayList<Double> pointsX3 = new ArrayList<Double>();
    ArrayList<Double> pointsY3 = new ArrayList<Double>();
    ArrayList<Double> starsXY1 = new ArrayList<Double>();
    ArrayList<Double> starsXY2 = new ArrayList<Double>();
    ArrayList<Double> starsXY3 = new ArrayList<Double>();
Double x;
    Double y;
    Double moonX = 0.0;
    Double moonY = 100.0;
    double velMoonX = 0.1;
    double velMoonY = -0.05;
    Timer t ;

    public DrawSomeLevels(ArrayList<Double> pointsX1, ArrayList<Double> pointsY1,
                          ArrayList<Double> pointsX2, ArrayList<Double> pointsY2,
                          ArrayList<Double> pointsX3, ArrayList<Double> pointsY3,
                          ArrayList<Double> starsXY1, ArrayList<Double> starsXY2, ArrayList<Double> starsXY3,
                          int x, int y, int fps)
    {
        this.pointsX1 = pointsX1;
        this.pointsY1 = pointsY1;
        this.pointsX2 = pointsX2;
        this.pointsY2 = pointsY2;
        this.pointsX3 = pointsX3;
        this.pointsY3 = pointsY3;
        this.starsXY1 = starsXY1;
        this.starsXY2 = starsXY2;
        this.starsXY3 = starsXY3;
        this.x = x*1.0;
        this.y = y*1.0;
        this.t = new Timer(1000/fps, this);

    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Рисуем звезды
        g2.setPaint(new Color(255, 255, 255));
        for(int i = 0; i < starsXY1.size()-1; i+=2)
        {
            g2.draw(new Line2D.Double(starsXY1.get(i),starsXY1.get(i+1),starsXY1.get(i)+1.0,starsXY1.get(i+1)));
        }

        g2.setPaint(new Color(67, 64, 74));
        for(int i = 0; i < starsXY2.size()-1; i+=2)
        {
            g2.draw(new Line2D.Double(starsXY2.get(i),starsXY2.get(i+1),starsXY2.get(i)+1.0,starsXY2.get(i+1)));
        }

        g2.setPaint(new Color(167, 164, 174));
        for(int i = 0; i < starsXY3.size()-1; i+=2)
        {
            g2.draw(new Line2D.Double(starsXY3.get(i),starsXY3.get(i+1),starsXY3.get(i)+1.0,starsXY3.get(i+1)));
        }

        //Рисуем Луну
        g2.fill(new Ellipse2D.Double(moonX, moonY, x*0.08, x*0.08));

        //Рисуем ландшафт
        for (int i = 0; i < x; i+=1) //Цикл рисования
        {
            g2.setPaint(new Color(25,29,76)); //Night
            g2.draw(new Line2D.Double(i, pointsY2.get(i), i, pointsY1.get(i)));
            g2.setPaint(new Color(17,20,40)); //Night
            g2.draw(new Line2D.Double(i,pointsY3.get(i), i, pointsY2.get(i)));
            g2.setPaint(new Color(10,10,5)); //Night
            if(pointsY3.get(i) < y)
            g2.draw(new Line2D.Double(i, y, i, pointsY3.get(i)));
        }

        t.start();
    }


    public void actionPerformed(ActionEvent e)
    {
        moveStar();
        repaint();
    }

    public void moveStar()
    {
        if(moonY > 10)
        {
            moonX+=velMoonX;
            moonY+=velMoonY;
        }
        else
        {
        }

    }

}