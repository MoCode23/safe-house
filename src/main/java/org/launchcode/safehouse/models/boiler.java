package org.launchcode.safehouse.models;

import java.sql.*;

public class boiler {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/safe-house", "safe-house", "safehouse");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from house");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

