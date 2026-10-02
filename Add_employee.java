package Employee.Management.System;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class Add_employee extends JFrame implements ActionListener {
    Random ran = new Random();
    int number = ran.nextInt(999999);
    JTextField tname, tfname, taddress, tphone, taadhar, temail, tsalary, tdesignation;
    JLabel tempID;
    JDateChooser tdob;
    JButton add, back;
    JComboBox Boxeducation;

    Add_employee() {

        getContentPane().setBackground(new Color(173, 216, 230));

        JLabel heading = new JLabel("Add Employee Details:");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 25));
        add(heading);

        tname = new JTextField();
        tname.setBounds(200, 150, 150, 30);
        tname.setBackground(new Color(173, 216, 230));
        add(tname);

        JLabel name = new JLabel("Name");
        name.setBounds(50, 150, 150, 30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(600, 150, 150, 30);
        tfname.setBackground(new Color(173, 216, 230));
        add(tfname);

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400, 150, 150, 30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(fname);

        JLabel dob = new JLabel("Date Of Birth");
        dob.setBounds(50, 200, 150, 30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(dob);

        tdob = new JDateChooser();
        tdob.setBounds(200, 200, 150, 30);
        tdob.setBackground(new Color(173, 216, 230));
        add(tdob);

        taddress = new JTextField();
        taddress.setBounds(200, 250, 150, 30);
        taddress.setBackground(new Color(173, 216, 230));
        add(taddress);

        JLabel address = new JLabel("Address");
        address.setBounds(50, 250, 150, 30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(address);

        tphone = new JTextField();
        tphone.setBounds(600, 250, 150, 30);
        tphone.setBackground(new Color(173, 216, 230));
        add(tphone);

        JLabel phone = new JLabel("Phone No.");
        phone.setBounds(400, 250, 150, 30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(phone);

        taadhar = new JTextField();
        taadhar.setBounds(600, 350, 150, 30);
        taadhar.setBackground(new Color(173, 216, 230));
        add(taadhar);

        JLabel aadhar = new JLabel("Aadhar No.");
        aadhar.setBounds(400, 350, 150, 30);
        aadhar.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(aadhar);

        temail = new JTextField();
        temail.setBounds(200, 300, 150, 30);
        temail.setBackground(new Color(173, 216, 230));
        add(temail);

        JLabel email = new JLabel("Email Id");
        email.setBounds(50, 300, 150, 30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(email);

        JLabel education = new JLabel("Highest Education");
        education.setBounds(400, 300, 150, 30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(education);

        String items[] = {"BBA", "B.TECH", "BSC", "BA", "BCA", "B.COM", "MBA", "MCA", "M.TECH", "MSC", "PHD"};
        Boxeducation = new JComboBox(items);
        Boxeducation.setBackground(new Color(173, 216, 230));
        Boxeducation.setBounds(600, 300, 150, 30);
        add(Boxeducation);

        tsalary = new JTextField();
        tsalary.setBounds(600, 200, 150, 30);
        tsalary.setBackground(new Color(173, 216, 230));
        add(tsalary);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(400, 200, 150, 30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(salary);

        tempID = new JLabel("" + number);
        tempID.setBounds(200, 400, 150, 30);
        tempID.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        tempID.setForeground(Color.RED);
        add(tempID);

        JLabel empID = new JLabel("Employee Id");
        empID.setBounds(50, 400, 150, 30);
        empID.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(empID);

        tdesignation = new JTextField();
        tdesignation.setBounds(200, 350, 150, 30);
        tdesignation.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(tdesignation);

        JLabel designation = new JLabel("Designation");
        designation.setBounds(50, 350, 150, 30);
        designation.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(designation);

        add = new JButton("ADD");
        add.setBounds(450, 550, 150, 40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);

        back = new JButton("BACK");
        back.setBounds(250, 550, 150, 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);


        setSize(900, 600);
        setLocation(300, 50);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String name = tname.getText();
            String fname = tfname.getText();
            String dob = ((JTextField) tdob.getDateEditor()).getText();
            String salary = tsalary.getText();
            String address = taddress.getText();
            String phone = tphone.getText();
            String email = temail.getText();
            String aadhar = taadhar.getText();
            String education = (String) Boxeducation.getSelectedItem();
            String designation = tdesignation.getText();
            String empID = tempID.getText();

            try {
                conn c = new conn();
                String query = "insert into employee values('" + name + "','" + fname + "','" + dob + "','" + salary + "','" + address + "','" + email + "','" + phone + "','" + education + "','" + aadhar + "','" + designation + "','" + empID + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully.");
                setVisible(false);
                new main_class();
            } catch (Exception E) {
                E.printStackTrace();
            }
        }else{
            setVisible(false);
            new main_class();
        }
    }

        public static void main (String[]args){
            new Add_employee();
        }
    }

