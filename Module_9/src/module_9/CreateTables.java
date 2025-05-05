/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module_9;

/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */

import java.sql.*;

public class CreateTables {

  Connection con;
  Statement stmt;

  public CreateTables() {
    try {
      // Load MySQL driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Database connection URL
      String url = "jdbc:mysql://localhost:3306/databasedb?";

      // Connect to the database
      con = DriverManager.getConnection(url + "user=student1&password=pass");
      stmt = con.createStatement();
    } catch (Exception e) {
      System.out.println("Error connecting to the database.");
      e.printStackTrace();
      System.exit(0);
    }

    try {
      // Attempt to drop the table if it exists
      stmt.executeUpdate("DROP TABLE IF EXISTS address33");
      System.out.println("Table address33 dropped.");
    } catch (SQLException e) {
      System.out.println("Table address33 does not exist or could not be dropped.");
    }

    try {
      // Create the table address33
      stmt.executeUpdate("CREATE TABLE address33 (" +
                         "ID INT PRIMARY KEY, " +
                         "LASTNAME VARCHAR(40), " +
                         "FIRSTNAME VARCHAR(40), " +
                         "STREET VARCHAR(40), " +
                         "CITY VARCHAR(40), " +
                         "STATE VARCHAR(40), " +
                         "ZIP VARCHAR(40))");
      System.out.println("Table address33 created.");
    } catch (SQLException e) {
      System.out.println("Table address33 creation failed.");
      e.printStackTrace();
    }

    try {
      // Close the statement and connection
      stmt.close();
      con.close();
      System.out.println("Database connections closed.");
    } catch (SQLException e) {
      System.out.println("Connection close failed.");
    }
  }

  public static void main(String args[]) {
    // Instantiate CreateTables class to execute the code
    new CreateTables();
  }
}
