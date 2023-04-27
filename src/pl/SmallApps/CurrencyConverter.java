package pl.SmallApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Objects;

public class CurrencyConverter extends Component implements ActionListener {
JFrame frame;
String[] convert ={"USD","EUR","JPY","GBP","AUD","CAD","CHF","CNH","SEK","NZD","PLN","Russian Rubel"};
String[] secondConvert ={"USD","EUR","JPY","GBP","AUD","CAD","CHF","CNH","SEK","NZD","PLN","Russian Rubel"};
JComboBox comboBox, on;
JTextField amount;
JTextField equals;
JLabel amountText,equalsText,count,count2;
Font font = new Font("FONT",Font.BOLD,15);
JButton buttonClick,reset;
    CurrencyConverter() {
      //Create Frame
        frame  = new JFrame("Currency Converter");
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
       //Create Labels
        count = new JLabel("Convert");
        count.setBounds(70,0,100,100);
        count.setForeground (Color.white);
        count.setFont(font);

        count2 = new JLabel("ON");
        count2.setBounds(260,0,100,100);
        count2.setForeground (Color.white);
        count2.setFont(font);

        amountText = new JLabel("Amount");
        amountText.setBounds(70,140,100,100);
        amountText.setForeground (Color.white);
        amountText.setFont(font);

        equalsText = new JLabel("Equals");
        equalsText.setBounds(250,140,100,100);
        equalsText.setForeground (Color.white);
        equalsText.setFont(font);
        //Create TextFields
        equals = new JTextField();
        equals.setBackground(Color.black);
        equals.setForeground(Color.green);
        equals.addActionListener(this);
        equals.setBounds(200,130,150,50);
        equals.setFont(font);
        equals.setEditable(false);

        amount = new JTextField();
        amount.setBackground(Color.black);
        amount.setForeground(Color.green);
        amount.addActionListener(this);
        amount.setBounds(20,130,150,50);
        amount.setFont(font);
      // Block Letters
        amount.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '-'
                        && amount.getText().indexOf('-') > -1) {
                    e.consume();
                    return;
                }
                if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9'))
                    e.consume();
            }
        });
        //Create ComboBox
        on = new JComboBox(secondConvert);
        on.setBackground(Color.black);
        on.setForeground(Color.green);
        on.setBounds(200,70,150,50);
        on.setFont(font);

        comboBox = new JComboBox(convert);
        comboBox.setBackground(Color.black);
        comboBox.setForeground(Color.green);
        comboBox.setBounds(20,70,150,50);
        comboBox.setFont(font);
        //Create Buttons
        buttonClick = new JButton("Check");
        buttonClick.setForeground (Color.black);
        buttonClick.setBackground(Color.gray);
        buttonClick.addActionListener(this);
        buttonClick.setBounds(20,220,150,60);
        buttonClick.setFont(font);

        reset = new JButton("Reset");
        reset.setForeground (Color.black);
        reset.setBackground(Color.gray);
        reset.addActionListener(this);
        reset.setBounds(200,220,150,60);
        reset.setFont(font);

        //Frame Add All
        frame.add(buttonClick);
        frame.add(reset);
        frame.add(count);
        frame.add(count2);
        frame.add(amountText);
        frame.add(equalsText);
        frame.add(equals);
        frame.add(amount);
        frame.add(comboBox);
        frame.add(on);

        frame.setVisible(true);
    }
    public void money() {}
    @Override
    public void actionPerformed(ActionEvent  e) {
        //USD//
double conv;
double amo= Double.parseDouble(amount.getText());
if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "USD") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *136.38;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.98 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.83 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *1.44 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo *1.29 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo * 0.96;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *6.76444 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *10.18  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    conv = amo *1.60  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *4.61  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *58.13 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("USD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}
//Euro//
   else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "EUR") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *136.22 ;
    equals.setText(equals.getText().concat(("" + conv)));
        }
     else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);

        }else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
            conv = amo *0.84 ;
            equals.setText(equals.getText().concat(("" + conv)));
        }
        else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
            conv = amo *1.46 ;
            equals.setText(equals.getText().concat(("" + conv)));
        }
        else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
            conv = amo *1.31 ;
            equals.setText(equals.getText().concat(("" + conv)));
        }else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
            conv = amo * 0.97;
            equals.setText(equals.getText().concat(("" + conv)));

        }else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
            conv = amo *6.9035;
            equals.setText(equals.getText().concat(("" + conv)));
        }else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
            conv = amo *10.36;
            equals.setText(equals.getText().concat(("" + conv)));
        }
        else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
            conv = amo *1.65;
            equals.setText(equals.getText().concat(("" + conv)));
        }
        else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
            conv = amo *4.74  ;
            equals.setText(equals.getText().concat(("" + conv)));
        }
        else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
            conv = amo *63.66 ;
            equals.setText(equals.getText().concat(("" + conv)));
        }else if (comboBox.getSelectedItem().toString().equals("EUR") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
          conv = amo *1.02;
          equals.setText(equals.getText().concat(("" + conv)));
        }
        //JPY//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "JPY") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}
else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.0073 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.0062 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *0.011 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo *0.0096 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo * 0.0071;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *0.051;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *13.25;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    conv = amo *0.012 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *0.035  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *2.14 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("JPY") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *0.0075;
    equals.setText(equals.getText().concat(("" + conv)));
}
//GBP//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "GBP") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *162.23 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *1.19 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}
else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *1.74 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo *1.56 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo * 1.16;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *8.21;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *12.24 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    conv = amo *1.96 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *5.64  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *75.79 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("GBP") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *1.22;
    equals.setText(equals.getText().concat(("" + conv)));
}
//AUD//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "AUD") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *93.14 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.68 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.57 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}
else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo *0.89 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo * 0.67 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *4.7177;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *7.03 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    conv = amo *1.11 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *3.24;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *43.50 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("AUD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *0.70;
    equals.setText(equals.getText().concat(("" + conv)));
}
//CAD//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "CAD") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *104.14 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.76 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.64 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *1.12  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo * 0.74 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *5.276192337;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *7.86 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    conv = amo *1.24 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *3.62;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *48.67 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("CAD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *0.78;
    equals.setText(equals.getText().concat(("" + conv)));
}
//CHF//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "CHF") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *139.74 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *1.03 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.86 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *1.50  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo * 1.35 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);

}else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *7.090059558;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *10.56 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    conv = amo *1.69 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *4.87;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *65.38 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("CHF") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *1.05;
    equals.setText(equals.getText().concat(("" + conv)));
}
//CNH//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "CNH") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *19.731094589 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.1448480378 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.1216638375 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *0.2118423586  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo * 0.1895306191 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo *0.1410425388;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *1.5027358829 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    conv = amo *0.2358883546 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *0.64;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *8.45 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("CNH") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *0.14;
    equals.setText(equals.getText().concat(("" + conv)));
}
//SEK//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "SEK") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *13.25 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.097 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.082 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *0.14  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo * 0.13;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo *0.095;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *0.66730206 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}
else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    conv = amo *0.16 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *0.46;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *6.19 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("SEK") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *0.099;
    equals.setText(equals.getText().concat(("" + conv)));
}
//NZD//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "NZD") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *82.57 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.61 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.51 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *0.89  ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo * 0.79;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo *0.60;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *4.2392936332 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *6.23 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}
else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *2.87 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *38.57 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("NZD") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *0.62;
    equals.setText(equals.getText().concat(("" + conv)));
}
//PLN//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "PLN") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *28.75 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.21 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *5.64 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *0.31   ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo * 0.28;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo *0.21;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *1.44 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *2.17 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")) {
    conv = amo * 0.35;
    equals.setText(equals.getText().concat(("" + conv)));

}
else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}
else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    conv = amo *13.43 ;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("PLN") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *0.22 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
//Russian Rubel//
else   if (Objects.equals(Objects.requireNonNull(comboBox.getSelectedItem()).toString(), "Russian Rubel") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "JPY")){
    conv = amo *2.14 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("EUR")){
    conv = amo *0.016  ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("GBP")){
    conv = amo *0.013 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("AUD")){
    conv = amo *0.021   ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.equals(Objects.requireNonNull(on.getSelectedItem()).toString(), "CAD")){
    conv = amo * 0.021;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CHF")) {
    conv = amo *0.015;
    equals.setText(equals.getText().concat(("" + conv)));
}else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("CNH")){
    conv = amo *0.10841718 ;
    equals.setText(equals.getText().concat(("" + conv)));

}else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("SEK")){
    conv = amo *0.16 ;
    equals.setText(equals.getText().concat(("" + conv)));
}
else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("NZD")) {
    conv = amo * 0.026;
    equals.setText(equals.getText().concat(("" + conv)));

}
else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("PLN")){
    conv = amo *0.074 ;
    equals.setText(equals.getText().concat(("" + conv)));

}
else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("Russian Rubel")){
    String error = "Error" ;
    JOptionPane.showMessageDialog(null, "the same currency cannot be converted!!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
}else if (comboBox.getSelectedItem().toString().equals("Russian Rubel") && Objects.requireNonNull(on.getSelectedItem()).toString().equals("USD")){
    conv = amo *0.016  ;
    equals.setText(equals.getText().concat(("" + conv)));
}

        if (e.getSource() == reset){
            equals.setText("");
            amount.setText("");
        }


}}
