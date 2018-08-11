package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        String connstr = "jdbc:sqlserver://localhost;instanceName=sqlexpress;databasename=Northwind;user=sqluser;password=hejsanhoppsan;";

        Connection dbconn = null;
        try {
            dbconn = DriverManager.getConnection(connstr);

            Statement stmt3 = dbconn.createStatement();
            ResultSet rs3 = stmt3.executeQuery()

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(dbconn!=null)
                dbconn.close();
        }

        System.out.println("Done");
    }
}
