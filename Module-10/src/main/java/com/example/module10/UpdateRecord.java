package com.example.module10;

import java.sql.SQLException;

public class UpdateRecord {
    Connection con;

    Statement stmt;

    public InsertData(){

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/databasedb?";

            con = DriverManager.getConnection(url + "user=student1&password=pass");

            stmt = con.createStatement();
        }
        catch(Exception e){

            System.out.println("Error connection to database.");
            System.exit(0);
        }

        try{

            // Update record with values in the first name field last name field and favorite team field
            stmt.executeUpdate("INSERT INTO fans VALUES (firstnamefield, lastnamefield, favoriteTeamfield)")")
        }
        catch(SQLException e){

            System.out.println(e);
            System.out.println("Insert Data Failed");
        }

        try{

            stmt.close();

            con.close();
            System.out.println("Database connections closed");
        }
        catch(SQLException e){

            System.out.println("Connection close failed");
        }
    }

    public static void main(String args[]) {

        InsertData InsertData = new InsertData();
    }

}
