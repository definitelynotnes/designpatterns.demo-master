package com.bootcamp.patterns.factorymethod;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MessageFrame extends JFrame {
    private static final long serialVersionUID = 621520174016304822L;
    private JButton button;
    private JPanel panel;
    public MessageFrame() {
        button = new JButton("Click Me");
        button.setBackground(Color.BLUE);
        panel = new JPanel();
        panel.add(button);
        getContentPane().add(panel);
    }
    
    public static void main(String[] args) {
        MessageFrame messageFrame = new MessageFrame();
        messageFrame.setSize(500, 400);
        messageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageFrame.setVisible(true);
    }
}
