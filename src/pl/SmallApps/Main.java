package pl.SmallApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
@SuppressWarnings("ALL")
public class Main implements ActionListener {

    JCheckBox checkBox;
    JFrame jFrame;
    JLabel Welcome;
    JButton switch1,switch2;
    JButton [] generate = new JButton[4];
    JButton [] function = new JButton[5];

    JButton Calculator,AddClient,MoreAction,Exit;
    JPanel panel;
    Font font = new Font("buttons",Font.BOLD,15);
    Font label = new Font("label",Font.BOLD,60);
    public Main (){
        //Create Frame
        jFrame = new JFrame("Mix Off Small Apps");
        jFrame.setResizable(false);
        jFrame.getContentPane().setBackground(Color.darkGray);
        jFrame.setSize(400,350);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        Welcome = new JLabel("Welcome!!");
        Welcome.setHorizontalAlignment(SwingConstants.CENTER);
        Welcome.setVerticalAlignment(SwingConstants.CENTER);
        Welcome.setFont(label);
       //Create Panel
        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setBounds(15,10,350,350);
        panel.setLayout(new GridLayout(6,1,5,5));
        //Create Buttons
        AddClient = new JButton("Table-Data");
        Calculator = new JButton ("Calculator");
        MoreAction = new JButton("More Actions");
        Exit = new JButton("Exit");

        generate[0] = AddClient;
        generate[1] = Calculator;
        generate[2] = MoreAction;
        generate[3] = Exit;

        for (int i=0;i<4;i++){
            generate[i].addActionListener(this);
            generate[i].setBackground(Color.black);
            generate[i].setForeground(Color.green);
            generate[i].setLayout(null);
            generate[i].setFocusable(false);
        }
      // Panel Add new Buttons and JLabel (welcome)
        panel.add(AddClient);
        panel.add (Calculator);
        panel.add(MoreAction);
        panel.add(Exit);
        panel.add(Welcome);
        //Frame
        jFrame.add(panel);
        jFrame.setVisible(true);
    }
    //Main class (Open)
    public static void main(String[]args){
       JFrame jFrame = new Main().jFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      //Close Apllication
        if (e.getSource() == Exit) {
            System.exit(0);
        }
        //Open new Windows
        if (e.getSource() == MoreAction) {
            Additional additional = new Additional();
              jFrame.dispose();
        }
        if (e.getSource() == AddClient){
             new Clients();
        }
        if (e.getSource () == Calculator){
            new Calculator ();
        }
    }
}


