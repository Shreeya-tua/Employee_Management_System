package Employee.Management.System;

import java.sql.PreparedStatement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login  extends JFrame implements ActionListener {
    JTextField t_username;
    JPasswordField t_password;
    JButton Login , Back ;
    Login(){
        JLabel username = new JLabel("Username :");
        username.setBounds(40,20,100,30);
        add(username);

        t_username= new JTextField();
        t_username.setBounds(150,20,150,30);
        add(t_username);

        JLabel password = new JLabel("Password :");
        password.setBounds(40,70,100,30);
        add(password);

        t_password=new JPasswordField();
        t_password.setBounds(150,70,150,30);
        add(t_password);

        Login = new JButton("LOGIN");
        Login.setBounds(150,140,150,30);
        Login.setBackground(Color.black);
        Login.setForeground(Color.white);
        Login.addActionListener(this);
        add(Login);

        Back = new JButton("BACK");
        Back.setBounds(150,180,150,30);
        Back.setBackground(Color.black);
        Back.setForeground(Color.white);
        Back.addActionListener(this);
        add(Back);

        ImageIcon i11= new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i22=i11.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i33= new ImageIcon(i22);
        JLabel imgg= new JLabel(i33);
        imgg.setBounds(350,10,600,400);
        add(imgg);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel img= new JLabel(i3);
        img.setBounds(0,0,600,400);
        add(img);



        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Login) {
            try {
                String username = t_username.getText();
                String password = t_password.getText();

                conn conn = new conn();

                String query = "SELECT * FROM Login WHERE username = ? AND password = ?";

                PreparedStatement ps = conn.c.prepareStatement(query);
                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet resultSet = ps.executeQuery();

                if (resultSet.next()) {
                    setVisible(false);
                    new main_class();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }

            } catch (Exception E) {
                E.printStackTrace();
            }

        } else if (e.getSource() == Back) {
            System.exit(0);
        }
    }


    public static void main(String[] args){

    new Login();
    }
}

