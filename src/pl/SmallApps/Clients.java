package pl.SmallApps;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public  class Clients implements ActionListener {
    JFrame frame;
    JTable table;
    Object []columns = {"Name","Surname","PhoneNumber","From","Number Client"};
    DefaultTableModel model;
    JButton add,delete,change;
    JLabel lName,lSurname,lPhoneNumber,lFrom,lNumberClient;
    JTextField name,surname,phoneNumber,from,numberClient;
    Font label = new Font("Label",Font.PLAIN,13);
    Font text = new Font("text",Font.PLAIN,20);
    Clients(){
       //Create Frame
        frame = new JFrame("Clients");
 frame.setResizable(false);
 frame.getContentPane().setBackground(new Color(0,0,0));
 frame.getContentPane().setForeground(Color.white);
 frame.setBounds(100,100,757,610);
 frame.getContentPane().setLayout(null);
 frame.setLocationRelativeTo(null);
//Create Model
 model = new DefaultTableModel();
 model.setColumnIdentifiers(columns);
//Create Table
 table  = new JTable();
 table.setBackground(Color.white);
 table.setForeground(Color.black);
 table.setSelectionBackground(Color.red);
 table.setGridColor(Color.red);
 table.setSelectionForeground(Color.white);
 table.setModel(model);
 table.setFont(new Font("Font",Font.PLAIN,17));
 table.setRowHeight(30);
 table.setAutoCreateRowSorter(true);
//Create ScrollPanel
 JScrollPane pane = new JScrollPane(table);
 pane.setForeground(Color.red);
 pane.setBackground(Color.white);
 pane.setBounds(10,10,720,400);
 frame.getContentPane().add(pane);
        //Create TextFields
        name = new JTextField();
        name.addActionListener(this);
        name.setFont(text);
        name.setBounds(100,420,150,35);
        frame.getContentPane().add(name);
        name.setColumns(10);

        surname = new JTextField();
        surname.addActionListener(this);
        surname.setFont(text);
        surname.setBounds(400,420,150,35);
        frame.getContentPane().add(surname);
        surname.setColumns(10);

        phoneNumber = new JTextField();
        phoneNumber.addActionListener(this);
        phoneNumber.setFont(text);
        phoneNumber.setBounds(100,460,150,35);
        frame.getContentPane().add(phoneNumber);
        phoneNumber.setColumns(10);
        phoneNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              //Block Letters
                if (e.getKeyChar() == '-'
                        && phoneNumber.getText().indexOf('-') > -1) {
                    e.consume();
                    return;
                }
                if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9'))
                    e.consume();
            }
        });

        from = new JTextField();
        from.addActionListener(this);
        from.setFont(text);
        from.setBounds(400,460,150,35);
        frame.getContentPane().add(from);
        from.setColumns(10);

        numberClient = new JTextField();
        numberClient.addActionListener(this);
        numberClient.setFont(text);
        numberClient.setBounds(590,440,150,35);
        frame.getContentPane().add(numberClient);
        numberClient.setColumns(10);
        numberClient.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '-'
                        && numberClient.getText().indexOf('-') > -1) {
                    e.consume();
                    return;
                }
                if (!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9'))
                    e.consume();
            }
        }
        );//Block Numbers
        name.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                name.setEditable(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c));

            }
        });
        surname.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                surname.setEditable(Character.isLetter(c) || Character.isWhitespace(c) );
            }
        });
        from.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                from.setEditable(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c));
            }
        });
        //Create Labels
        lName = new JLabel("Name:");
        lName.setForeground(Color.green);
        lName.setFont(label);
        lName.setBounds(10,429,103,20);
        frame.getContentPane().add(lName);

        lSurname = new JLabel("Surname:");
        lSurname.setForeground(Color.green);
        lSurname.setFont(label);
        lSurname.setBounds(330,420,150,35);
        frame.getContentPane().add(lSurname);

        lPhoneNumber = new JLabel("PhoneNumber:");
        lPhoneNumber.setForeground(Color.green);
        lPhoneNumber.setFont(label);
        lPhoneNumber.setBounds(10,460,150,35);
        frame.getContentPane().add(lPhoneNumber);

        lFrom = new JLabel("From:");
        lFrom.setForeground(Color.green);
        lFrom.setFont(label);
        lFrom.setBounds(330,460,150,35);
        frame.getContentPane().add(lFrom);

        lNumberClient = new JLabel("Number Client:");
        lNumberClient.setForeground(Color.green);
        lNumberClient.setFont(label);
        lNumberClient.setBounds(620,410,150,35);
        frame.getContentPane().add(lNumberClient);
        // Max Amount Numbers and Letters
        name.setDocument(new JTextSize(20));
        surname.setDocument(new JTextSize(20));
        phoneNumber.setDocument(new JTextSize(9));
        from.setDocument(new JTextSize(15));
        numberClient.setDocument(new JTextSize(9));
        //Create Button
        add = new JButton("ADD");
        add.setBackground(Color.gray);
        add.setForeground (Color.black);
        add.setFont(text);
        add.setBounds(100,500,150,25);
        frame.getContentPane().add(add);
        Object []row  = new Object[5];
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   if (e.getSource() ==add && name.getText().equals("") || surname.getText().equals("")
                           || phoneNumber.getText().equals("") || from.getText().equals("") || numberClient.getText().equals("")){
                       String error = "Error!!";
                       JOptionPane.showMessageDialog(null, "The Field Cannot Be Empty!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
                   }
                else {
                row[0] =name.getText();
                row[1] =surname.getText();
                row[2] =phoneNumber.getText();
                row[3] =from.getText();
                row[4] =numberClient.getText();
                model.addRow(row);
                }
            }
        });
        delete = new JButton("DELETE");
        delete.setBackground(Color.gray);
        delete.setForeground (Color.black);
        delete.setFont(text);
        delete.setBounds(400,500,150,25);
        frame.getContentPane().add(delete);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             int i  = table.getSelectedRow();
             if (i >=0){
                 model.removeRow(i);
             }else {
                 String error = "Error!!";
                 JOptionPane.showMessageDialog(null, "You Nothing Pick!", "InfoBox: " + error, JOptionPane.INFORMATION_MESSAGE);
             }
            }
        });
        change = new JButton("CHANGE");
        change.setBackground(Color.gray);
        change.setForeground (Color.black);
        change.setFont(text);
        change.setBounds(250,530,150,25);
        frame.getContentPane().add(change);
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                model.setValueAt(name.getText(),i,0);
                model.setValueAt(surname.getText(),i,1);
                model.setValueAt(phoneNumber.getText(),i,2);
                model.setValueAt(from.getText(),i,3);
                model.setValueAt(numberClient.getText(),i,4);
            }
        });
 frame.revalidate();
 frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {}
    }



