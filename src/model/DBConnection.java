package model;

import java.sql.*;

public class DBConnection 
{
    private static Connection con;

    public static Connection createDBConnection()
    {
        try 
        {
            String url = "jdbc:mysql://localhost/lms";
            con = DriverManager.getConnection(url, "root", "");
        } 
        catch (SQLException ex)
        {
            System.out.println("DB Connection ERROR!");
        }
        return con;
    }
}