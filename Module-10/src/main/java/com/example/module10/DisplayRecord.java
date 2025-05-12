package com.example.module10;

import java.sql.*;

public class DisplayRecord {

    public void display(int recordId) {
        try {
            Connection con;

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/database33?";
            con = DriverManager.getConnection(url + "user=student33&password=pass");

            System.out.println("Connection established - now executing a select");

            // Use PreparedStatement for parameterized query
            String query = "SELECT * FROM fans WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, recordId);

            ResultSet rs = pstmt.executeQuery();

            System.out.println("Received Results:");

            int columnCount = rs.getMetaData().getColumnCount();

            if (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("No record found with ID: " + recordId);
            }

            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

