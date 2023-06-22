/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.swingproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.reflect.Array.set;

class MyFrame extends JFrame implements ActionListener {
 
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mn;
    private JTextField tmn;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private JLabel email;
    private JTextField te;
    private JLabel password;
    private JPasswordField tp;
 
 
    private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15","16", "17", "18", "19", "20","21", "22", "23", "24", "25",
       "26", "27", "28", "29", "30", "31" };
    private String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]= { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
 
    
    public MyFrame()
    {
        setTitle("Registration Form");
        
         setSize(1000,700);
         getContentPane().setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        c = getContentPane();
        c.setLayout(null);
        setLocationRelativeTo(null);
 
        title = new JLabel("Registration Form");
        title.setForeground(Color.ORANGE);
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(400, 30);
        c.add(title);
 
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(220, 20);
        tname.setLocation(250, 100);
        c.add(tname);
 
        mn = new JLabel("Mobile");
        mn.setFont(new Font("Arial", Font.PLAIN, 20));
        mn.setForeground(Color.WHITE);
        mn.setSize(220, 20);
        mn.setLocation(100, 150);
        c.add(mn);
 
        tmn = new JTextField();
        tmn.setFont(new Font("Arial", Font.PLAIN, 15));
        tmn.setSize(220, 20);
        tmn.setLocation(250, 150);
        c.add(tmn);
        
        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setForeground(Color.WHITE);
        
        email.setSize(220, 20);
        email.setLocation(100, 200);
        c.add(email);
 
        te = new JTextField();
        te.setFont(new Font("Arial", Font.PLAIN, 15));
        te.setSize(220, 20);
        te.setLocation(250, 200);
        c.add(te);
        
         password = new JLabel("Password");
        password.setFont(new Font("Arial", Font.PLAIN, 20));
         password.setForeground(Color.WHITE);
        password.setSize(220, 20);
        password.setLocation(100, 250);
        c.add(password);
 
        tp = new JPasswordField();
        tp.setFont(new Font("Arial", Font.PLAIN, 15));
        tp.setSize(220, 20);
        tp.setLocation(250, 250);
        c.add(tp);
        
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setForeground(Color.WHITE);
        gender.setSize(100, 20);
        gender.setLocation(100, 300);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(250, 300);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(340, 300);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("Date Of Birth");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setForeground(Color.WHITE);
        dob.setSize(200, 20);
        dob.setLocation(100, 350);
        c.add(dob);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(250, 350);
        c.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(310, 350);
        c.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(380, 350);
        c.add(year);
 
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setForeground(Color.WHITE);
        add.setSize(100, 20);
        add.setLocation(100, 400);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(250, 390);
        tadd.setLineWrap(true);
        c.add(tadd);
 
        term = new JCheckBox("Accept Terms And Conditions");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(250, 500);
        c.add(term);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(350, 550);
        sub.setBackground(Color.cyan);
         sub.setForeground(Color.BLACK);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(500, 550);
        reset.setBackground(Color.CYAN);
        reset.setForeground(Color.BLACK);
        reset.addActionListener(this);
        c.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(350, 300);
        tout.setLocation(550, 100);
        
       tout.setLineWrap(true);
       tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(600, 25);
        res.setLocation(200, 600);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
 
        setVisible(true);
    }
 
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data= "Name : " + tname.getText() + "\n\n"+ "Mobile : "+ tmn.getText() + "\n\n" + "Email :"+ te.getText()+"\n\n" +"Password: " +tp.getText()+"\n\n";
                if (male.isSelected())
                    data1 = "Gender : Male" + "\n\n";
                else
                    data1 = "Gender : Female"+ "\n\n";
                String data2 = "Date Of Birth : "+ (String)date.getSelectedItem() + "/" + (String)month.getSelectedItem()+ "/" + (String)year.getSelectedItem() + "\n\n";
 
                String data3 = "Address : " + tadd.getText()+"\n\n";
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully!!!");
                res.setFont(new Font("Arial", Font.PLAIN, 25));
                
                res.setForeground(Color.ORANGE);
                
            }
            else {
                tout.setText("");
                resadd.setText("");
                
                res.setText("Please accept the terms & conditions");
                res.setFont(new Font("Arial", Font.PLAIN, 25));
                
                  res.setForeground(Color.RED);
            }
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmn.setText(def);
            te.setText(def);
            tp.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}

public class Swingproject {
   
       public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
} 
        
    
