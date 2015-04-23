package com.javarush.test.FullDrawFlatLand1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Snik on 20.03.2015.
 */
public class Mover implements ActionListener
{
    LandGenerator one;
    LandGenerator two;
    LandGenerator three;
    int speed;
    Timer t;

    public Mover(LandGenerator one_lvl, LandGenerator two_lvl, LandGenerator three_lvl, int speed)
    {
        this.one = one_lvl;
        this.two = two_lvl;
        this.three = three_lvl;
        this.speed = speed;
        t = new Timer(speed, this);
    }

    public void doStep()
    {
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        one.doMoveDynamic(1);
        two.doMoveDynamic(2);
        three.doMoveDynamic(3);
    }
}
