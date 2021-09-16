/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramashankar kumar
 */
public class DBConnection {
     private static Connection conn;
    
   static
    {
        try
        {   
            Class.forName("oracle.jdbc.OracleDriver");
             conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-FG0KF7D:1521/xe","system","12345");
            
        }
        catch(SQLException ex)
        {
              JOptionPane.showMessageDialog(null,"Error with database !");
        }
        catch(ClassNotFoundException ex)
        {
              JOptionPane.showMessageDialog(null,"Error with Loading Databse Driver !");
        }
    }
    public static Connection  getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        try
        {
            conn.close();
              //JOptionPane.showMessageDialog(null,"Disconnected from DataBase Successfully !");
        }
        catch(SQLException ex)
        {
             ex.printStackTrace();
             //JOptionPane.showMessageDialog(null,"Cannot Close Successfully !");
        }
    }
    
}
