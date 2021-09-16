/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBUtil.DBConnection;
import DTO.RegisterUserPojo;
import DTO.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramashankar kumar
 */
public class LoginDao {
     public static boolean validateUser(UserPojo obj)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=?");
        ps.setString(1,obj.getUserid());
        ps.setString(2,obj.getPassword());
        //System.out.println(obj.getUsername());
        //System.out.println(obj.getPassword());
        //System.out.println(obj.getUsertype());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            
            return true;
        }
        else
            return false;
        
    }
     public static String getUserName(String userid)throws SQLException
     {
        String username="";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select username from users where userid=?");
        ps.setString(1,userid);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
          username=rs.getString(1);
        }
      return username;  
     }
    public static boolean RegisterUser(RegisterUserPojo obj)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?)");
        ps.setString(1,obj.getUserid());
        ps.setString(2,obj.getPassword());
        ps.setString(3,obj.getUsername());
        ps.setString(4,obj.getMobileno());
       // System.out.println(obj.getUsername());
        //System.out.println(obj.getPassword());
        //System.out.println(obj.getUsertype());
    
        
        int count=ps.executeUpdate();
       

        if(count>0)
        {
            
            return true;
        }
        else
            return false;
        
    }
    
}
