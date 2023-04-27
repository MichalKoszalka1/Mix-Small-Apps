package pl.SmallApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Additional implements ActionListener {
JFrame frame;
    JLabel Welcome;
JButton [] options = new JButton[4];
JButton currency,generate,back,exit;
Font font = new Font("Font",Font.BOLD,15);

    Font label = new Font("label",Font.BOLD,60);
JPanel panel;
Additional(){
  //Create Frame
    frame = new JFrame("Mix Off Small Apps");
    frame.setResizable(false);
    frame.getContentPane().setBackground(Color.DARK_GRAY);
    frame.setSize(400,350);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLayout(null);
    Welcome = new JLabel("Welcome!!");
    Welcome.setHorizontalAlignment(SwingConstants.CENTER);
    Welcome.setVerticalAlignment(SwingConstants.CENTER);
    Welcome.setFont(label);

    //Create Panel
    panel = new JPanel();
    panel.setBackground(Color.lightGray);
    panel.setBounds(15,10,350,350);
    panel.setLayout(new GridLayout(6,1,5,5));

    //Create buttons
    currency = new JButton("Currency Converter");
    generate = new JButton("Lucky-Draw");
    back = new JButton("Back");
    exit = new JButton("Exit");

    options[0] = currency;
    options[1] = generate;
    options[2] = back;
    options[3] = exit;

    for (int i=0;i<4;i++){
        options[i].addActionListener(this);
        options[i].setBackground(Color.black);
        options[i].setForeground(Color.green);
        options[i].setLayout(null);
        options[i].setFocusable(false);
        options[i].setFont(font);
    }
   //Panel add
    panel.add(currency);
    panel.add(generate);
    panel.add(back);
    panel.add(exit);
    panel.add (Welcome);
   //Frame add
    frame.add(panel);
    frame.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        //Close Application
         if (e.getSource() == exit){
             System.exit(0);
         }
         //Back to Previous Functions
         if (e.getSource() == back){
             new Main();
             frame.dispose();
         }
         //Open new Windows
         if (e.getSource() == currency) {
             new CurrencyConverter();
         }
         if (e.getSource() == generate){
             new Generate();
         }
    }
}
