package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame {

    main_class(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 650);
        add(image);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(370,155,400,40);
        heading.setFont(new Font("serif",Font.BOLD,25));
        image.add(heading);

        JButton add=new JButton("Add Employee");
        add.setBounds(335,270,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add_employee();
                setVisible(false);
            }
        });
        image.add(add);

        JButton view =new JButton("View Employees");
        view.setBounds(565,270,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.BLACK);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        image.add(view);

        JButton rem=new JButton("Remove Employee");
        rem.setBounds(440,370,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.BLACK);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        image.add(rem);

        setSize(1120,630);
        setLocation(250,100);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args){
        new main_class();
    }
}
