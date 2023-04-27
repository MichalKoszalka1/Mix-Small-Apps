package pl.SmallApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
@SuppressWarnings("ALL")
public class Generate implements ActionListener {
    JFrame frame;
    JLabel text;
    JPanel numbers ;
    JButton generate ,reset,checkButton,zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven;
    JButton [] assistance = new JButton[12];
    Font font1 = new Font("Font",Font.BOLD,26);
    JTextField textField,luckyCheck;
    Font font = new Font("Font",Font.BOLD,14);
    Font forLabel = new Font("Font",Font.BOLD,13);
     Generate() {
      //Create Frame
     frame = new JFrame("Generator 0-11");
     frame.getContentPane().setBackground(Color.darkGray);
     frame.setResizable(false);
     frame.setSize(425,345);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
     //Create Buttons
         zero = new JButton("0");
         one = new JButton("1");
         two = new JButton("2");
         three = new JButton("3");
         four = new JButton("4");
         five = new JButton("5");
         six = new JButton("6");
         seven = new JButton("7");
         eight = new JButton("8");
         nine = new JButton("9");
         ten = new JButton("10");
         eleven = new JButton ("11");


         assistance [0] = zero;
         assistance [1] = one;
         assistance [2] = two;
         assistance [3] = three;
         assistance [4] = four;
         assistance [5] = five;
         assistance [6] = six;
         assistance [7] = seven;
         assistance [8] = eight;
         assistance [9] = nine;
         assistance [10] = ten;
         assistance [11] = eleven;

         for (int i =0 ; i<12;i++){
             assistance[i].addActionListener(this);
             assistance [i].setBackground(Color.gray);
             assistance [i].setForeground(Color.white);
             assistance[i].setFont(font1);
             assistance[i].setFocusable(false);
         }
         //Create Panel
         numbers = new JPanel();
         numbers.setBackground(Color.gray);
         numbers.setBounds(5,200,400,100);
         numbers.setLayout(new GridLayout(2,2,5,5));
         //Create Label
      text = new JLabel("Wrong  Number");
      text.setForeground(Color.red);
      text.setFont(forLabel);
      text.setVisible(false);
      text.setBounds(140,50,100,40);
      //Create Buttons
     generate = new JButton("Generate");
     generate.setForeground(Color.GREEN);
     generate.setBackground(Color.black);
     generate.addActionListener(this);
     generate.setBounds(30,50,100,40);
     generate.setFont(font);

     reset = new JButton("Reset All");
     reset.setForeground(Color.GREEN);
     reset.setBackground(Color.black);
     reset.setBounds(250,50,100,40);
     reset.setFont(font);
     reset.addActionListener(this);

     checkButton = new JButton("Check");
     checkButton.setForeground(Color.GREEN);
     checkButton.setBackground(Color.black);
     checkButton.setFont(font);
     checkButton.addActionListener(this);
     checkButton.setBounds(140,100,100,40);
     // Create TextFields
     textField = new JTextField();
     textField.setVisible(false);
     textField.addActionListener(this);
     textField.setBounds(140,50,100,40);
     textField.setEditable(false);

     luckyCheck = new JTextField();
     luckyCheck.setForeground(Color.GREEN);
     luckyCheck.setBackground(Color.black);
     luckyCheck.addActionListener(this);
     luckyCheck.setBounds(140,150,100,40);
     luckyCheck.setFont(font);
    //Block letters
     luckyCheck.addKeyListener(new KeyAdapter() {
             @Override
             public void keyTyped(KeyEvent e) {
                 if (e.getKeyChar() == '-'
                         && luckyCheck.getText().indexOf('-') > -1) {
                     e.consume();
                     return;
                 }
                 if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9'))
                     e.consume();
             }
         });luckyCheck.setDocument(new JTextSize(2));
         //Panel Add Buttons
         numbers.add(zero);
         numbers.add(one);
         numbers.add(two);
         numbers.add(three);
         numbers.add(four);
         numbers.add(five);
         numbers.add(six);
         numbers.add(seven);
         numbers.add(eight);
         numbers.add(nine);
         numbers.add(ten);
         numbers.add (eleven);
       //Frame Add
         frame.add(numbers);
         frame.add(textField);
         frame.add(text);
         frame.add(luckyCheck);
         frame.add(checkButton);
         frame.add(reset);
         frame.add(generate);

         frame.setVisible(true);
    }
    public void generate() {}
    @Override
    public void actionPerformed(ActionEvent e) {
       //Generate Random Number
        Random random   = new Random();
        int a =random.nextInt(10) + 1;
        if (e.getSource() == generate){
            textField.setText(textField.getText().concat(String.valueOf(a)));
           textField.setText(""+a);
        }
        //Functions
        if (e.getSource() == checkButton && !luckyCheck.getText().isEmpty() &&  luckyCheck.getText().equals(textField.getText()) ){
            String error = "Congratulations!!";
            JOptionPane.showMessageDialog(null, "You Won!!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
        }
            else if (e.getSource() == generate  ){
            text.setVisible(false);
            String error = "Start Game!!";
            JOptionPane.showMessageDialog(null, "Number is drawn!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);

        }else  if (e.getSource() == zero ){
            luckyCheck.setText("0");

        }else  if (e.getSource() == one ){
            luckyCheck.setText("1");
        }
        else  if (e.getSource() == two ){
            luckyCheck.setText("2");
        }
        else  if (e.getSource() == three ){
            luckyCheck.setText("3");
        }
        else  if (e.getSource() == four ){
            luckyCheck.setText("4");
        }
        else  if (e.getSource() == five ){
            luckyCheck.setText("5");
        }
        else  if (e.getSource() == six ){
            luckyCheck.setText("6");
        }
        else  if (e.getSource() == seven ){
            luckyCheck.setText("7");
        }
        else  if (e.getSource() == eight ){
            luckyCheck.setText("8");
        }
        else  if (e.getSource() == nine ){
            luckyCheck.setText("9");
        }
        else  if (e.getSource() == ten ){
            luckyCheck.setText("10");
        }
        else if (e.getSource () == eleven){
            luckyCheck.setText ("11");
        }
        else {
           text.setVisible(true);
        }
        //Reset Button
        if (e.getSource() == reset){
            text.setVisible(false);
            textField.setText("");
            luckyCheck.setText("");
        }
    }}
