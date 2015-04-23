package com.javarush.test.FullDrawFlatLand1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsGUI extends JFrame
{
    private JButton button = new JButton("Start!");
    private JLabel labelFPS = new JLabel("FPS:");
    private JTextField textFieldFPS = new JTextField("40");
    private JLabel labelSpeed = new JLabel("Speed(10-slow to 1-fast):");
    private JTextField textFieldSpeed = new JTextField("5");
    private JLabel labelWidth = new JLabel("Width:");
    private JTextField textFieldWidth = new JTextField("1300");
    private JLabel labelHeight = new JLabel("Height");
    private JTextField textFieldHeight = new JTextField("1000");

    int fps = 0;
    int speed = 0;
    int width = 0;
    int height = 0;

	public SettingsGUI() {
        super("MoveLand Settings");
	    this.setBounds(100,100,450,200);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(5,2,2,2));
        container.add(labelWidth);
        container.add(textFieldWidth);
        container.add(labelHeight);
        container.add(textFieldHeight);
	    container.add(labelFPS);
	    container.add(textFieldFPS);
        container.add(labelSpeed);
        container.add(textFieldSpeed);



	    button.addActionListener(new ButtonEventListener());
	    container.add(button);
	}

	class ButtonEventListener implements ActionListener
    {
		public void actionPerformed(ActionEvent e) {
            fps = Integer.parseInt(textFieldFPS.getText());
            speed = Integer.parseInt(textFieldSpeed.getText());
            width = Integer.parseInt(textFieldWidth.getText());
            height = Integer.parseInt(textFieldHeight.getText());
            ActionFrame frame = new ActionFrame(width, height, fps, speed);
            frame.createFrame();


		}
	}

/*	public static void main(String[] args) {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch(Exception e){
        }


		MainGUI app = new MainGUI();
		app.setVisible(true);
	}*/
}