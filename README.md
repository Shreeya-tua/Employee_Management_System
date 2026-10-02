# Employee Management System

A Java-based Employee Management System developed using Java, MySQL, and JDBC to manage employee records through database operations.

## Project Overview

The Employee Management System is a database-driven application designed to manage employee information. It provides functionalities for adding, viewing, updating, and removing employee records through a Java application connected to a MySQL database using JDBC.

## Technologies Used

- Java
- MySQL
- JDBC

## Features

- User Login
- Add Employee Records
- View Employee Records
- Update Employee Records
- Remove Employee Records
- MySQL Database Connectivity
- JDBC-based Database Operations

## Database

The application uses MySQL for storing and managing employee information.

JDBC (Java Database Connectivity) is used to establish the connection between the Java application and the MySQL database.

## Project Structure

The project contains the following main Java classes:

- `Login.java` – Handles user login functionality.
- `Add_employee.java` – Adds employee records to the database.
- `View_Employee.java` – Displays employee records.
- `UpdateEmployee.java` – Updates existing employee information.
- `Remove_employee.java` – Removes employee records.
- `conn.java` – Establishes the JDBC connection with MySQL.
- `Splash.java` – Handles the application splash screen.
- `main_class.java` – Main application class.

## CRUD Operations

The system implements the basic CRUD operations:

- **Create** – Add new employee records.
- **Read** – View employee records.
- **Update** – Modify existing employee information.
- **Delete** – Remove employee records.

## How to Run

1. Install Java and MySQL.
2. Create a MySQL database named `employee_management_system`.
3. Configure your local MySQL username and password in `conn.java`.
4. Make sure the MySQL server is running.
5. Open the project in an IDE such as IntelliJ IDEA.
6. Run `main_class.java`.

## Learning Outcomes

Through this project, I gained practical experience in:

- Java programming
- Object-Oriented Programming
- MySQL database management
- JDBC connectivity
- CRUD operations
- Database-driven application development
