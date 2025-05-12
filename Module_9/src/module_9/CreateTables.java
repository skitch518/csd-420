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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {
  public CreateTables() {
    try {
      // Load MySQL driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      // Database connection URL with proper parameters
      String url = "jdbc:mysql://localhost:3306/databasedb";
      
      // Use try-with-resources to ensure resources are properly closed
      try (Connection con = DriverManager.getConnection(url, "student1", "pass");
           Statement stmt = con.createStatement()) {
           
        // Attempt to drop the table if it exists
        stmt.executeUpdate("DROP TABLE IF EXISTS address33");
        System.out.println("Table address33 dropped.");
        
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
        
        System.out.println("Database operations completed successfully.");
      }
    } catch (ClassNotFoundException e) {
      System.out.println("MySQL JDBC Driver not found!");
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("Database error occurred:");
      e.printStackTrace();
    }
  }
  
  public static void main(String args[]) {
    // Instantiate CreateTables class to execute the code
    new CreateTables();
  }
}