package com.company;

import javax.imageio.ImageIO;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int clicks = 0;
    private JLabel label = new JLabel();
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();

    public static void main(String[] args) {
	// write your code here
        new GUI();
    }

    public GUI(){

        JButton button = new JButton("This is a button");


        //panel values
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,50,100));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("This is my GUI");
        frame.pack();
        frame.setVisible(true);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Total clicks: "+ clicks);
    }
}
