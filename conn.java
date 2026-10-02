package Employee.Management.System;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection c=null;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/employee_management_system",
    "root",
    "YOUR_PASSWORD"
);
            s=c.createStatement();
            System.out.println("Connected Successfully ");

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("Database Connection failed.");
        }
    }
}



