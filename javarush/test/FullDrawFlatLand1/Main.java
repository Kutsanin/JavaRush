package com.javarush.test.FullDrawFlatLand1;


import javax.swing.*;

/**
 * Created by Snik on 14.03.2015.
 */


public class Main
{

    public static void main(String[] args) throws InterruptedException
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception e){
        }
        SettingsGUI app = new SettingsGUI();
        app.setVisible(true);
    }
}