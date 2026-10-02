package Employee.Management.System;


import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class View_Employee extends JFrame implements ActionListener {
    Choice choiceEmp;
    JTable table;
    JButton searchbtn,print,update,back;
    View_Employee(){

        getContentPane().setBackground(new Color(255,192,193));
        JLabel search=new JLabel("Search by employee id");
        search.setBounds(20,20,150,20);
        add(search);
         choiceEmp = new Choice();
         choiceEmp.setBounds(180,20,150,20);
         add(choiceEmp);

         try{
             conn c=new conn();
             ResultSet resultSet=c.s.executeQuery("select * from employee");
             while(resultSet.next()){
                 choiceEmp.add(resultSet.getString("empID"));
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         table=new JTable();
         try {
           conn c=new conn();
           ResultSet resultSet=c.s.executeQuery("select * from employee");
           table.setModel(DbUtils.resultSetToTableModel(resultSet));
         }catch(Exception e){
             e.printStackTrace();
         }
         JScrollPane jp=new JScrollPane(table);
         jp.setBounds(0,100,900,600);
         add(jp);

         searchbtn = new JButton("Search");
         searchbtn.setBounds(20,70,80,20);
         searchbtn.addActionListener(this);
         add(searchbtn);

         print=new JButton("Print");
         print.setBounds(120,70,80,20);
        print.addActionListener(this);
         add(print);

        update=new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add(update);

        back=new JButton("Back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add(back);



        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==searchbtn){
            String query="select * from employee where empID='"+choiceEmp.getSelectedItem()+"'";
            try{
                conn c=new conn();
                ResultSet resultSet=c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch(Exception E){
                E.printStackTrace();
            }
        }else if(e.getSource()==print){
            try{
                table.print();
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if(e.getSource()==update){
            setVisible(false);
        }else{
            setVisible(false);
            new main_class();
        }
    }
    public static void main(String[]args){
        new View_Employee();
    }
}
