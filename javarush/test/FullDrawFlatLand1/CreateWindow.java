package com.javarush.test.FullDrawFlatLand1;

import javax.swing.*;

/**
 * Created by Snik on 15.03.2015.
 */
public class CreateWindow extends JFrame
{
    CreateWindow()
    {
        super("MoveLand");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1980, 1000);
    }
    CreateWindow(int width, int height)
    {
        super("MoveLand");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width+1, height);
    }
}