package pl.SmallApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.parseDouble;

public class Calculator implements ActionListener {
JFrame frame;
JTextField textField;
JButton[]numbers=  new JButton[10];
JButton[]function = new JButton[9];
JButton add,sub,mul,div,percent,dot,equ,clear,delete;
JPanel panel;
JButton emptyButton;
Font myFont = new Font("Calculator",Font.BOLD,25);
double num1=0,num2=0,result=0;
char operator;
    Calculator (){
     //Create Frame
      frame = new JFrame("Calculator");
      frame.getContentPane().setBackground(Color.darkGray);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      frame.setSize(355,500);
      frame.setLayout(null);
      //Create TextField
      textField = new JTextField();
      textField.setBackground(Color.BLACK);
      textField.setForeground(Color.GREEN);
      textField.setBounds(10, 10, 320, 100);
      textField.setFont(myFont);
      textField.setEditable(false);
      //Create Buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        percent = new JButton("%");
        dot = new JButton(".");
        equ = new JButton("=");
        clear = new JButton("C");
        delete = new JButton("X");

        function[0] =add;
        function[1] =sub;
        function[2] =mul;
        function[3] =div;
        function[4] =percent;
        function[5] =dot;
        function[6] =equ;
        function[7] =clear;
        function[8] =delete;

         for (int i=0;i<9;i++){
             function[i].addActionListener(this);
             function[i].setForeground(Color.white);
             function[i].setBackground(Color.darkGray);
             function[i].setFont(myFont);
             function[i].setFocusable(false);
         }
         for (int i=0;i<10;i++){
             numbers [i]= new JButton(String.valueOf(i));
             numbers[i].addActionListener(this);
             numbers [i].setBackground(Color.gray);
             numbers [i].setForeground(Color.white);
             numbers[i].setFont(myFont);
             numbers[i].setFocusable(false);
         }

         emptyButton = new JButton();
        //Create Panel
         panel = new JPanel();
         panel.setBounds(10,120,320,330);
         panel.setLayout(new GridLayout(5,5,5,5));
         panel.setBackground(Color.LIGHT_GRAY);
     //Panel Add Buttons
        panel.add(clear);
        panel.add(delete);
        panel.add(percent);
        panel.add(div);
        panel.add(numbers[7]);
        panel.add(numbers[8]);
        panel.add(numbers[9]);
        panel.add(mul);
        panel.add(numbers[4]);
        panel.add(numbers[5]);
        panel.add(numbers[6]);
        panel.add(sub);
        panel.add(numbers[1]);
        panel.add(numbers[2]);
        panel.add(numbers[3]);
        panel.add(add);
        panel.add(emptyButton);
        emptyButton.setBackground(Color.BLACK);
        panel.add(numbers[0]);
        panel.add(dot);
        panel.add(equ);

        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);


    }
    public void calculator() {}
    @Override
    public void actionPerformed(ActionEvent e) {
        //Create Functions
        for(int i=0;i<10;i++) {
            if(e.getSource() == numbers[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

     if (e.getSource()  == dot){
         textField.setText(textField.getText().concat((".")));
     }
     if (e.getSource() == add){
         num1 = Double.parseDouble(textField.getText());
         operator = '+';
         textField.setText("");
     }
     if (e.getSource() == sub){
         num1 = parseDouble(textField.getText());
         operator = '-';
         textField.setText("");
     }
     if (e.getSource() == mul){
         num1 = parseDouble(textField.getText());
         operator = '*';
         textField.setText("");
     }
     if(e.getSource() == div){
         num1 = parseDouble(textField.getText());
         operator ='/';
         textField.setText("");
     }
     if (e.getSource() == percent ){
         num1 = parseDouble(textField.getText());
         operator ='%';
         textField.setText("");
     }
     if (e.getSource() == equ) {
         num2 = parseDouble(textField.getText());
         switch (operator) {
             case '+':
                 result = num1 + num2;
                 break;
             case '-':
                 result = num1 - num2;
                 break;
             case '*':
                 result = num1 * num2;
                 break;
             case '/':
                 result = num1 / num2;
                 break;
             case '%':
                 result = (num1 / 100) * num2;
                 break;
         }
         textField.setText(String.valueOf(result));
         num1 = result;
     }

     if (e.getSource()==clear){
         textField.setText("");
     }
     if (e.getSource() == delete){
         String string = textField.getText();
         textField.setText("");
         for (int i =0;i <string.length() -1;i++){
             textField.setText(textField.getText()+ string.charAt(i));
         }
     }
    }
}



