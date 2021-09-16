/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBUtil.DBConnection;
import DTO.QuestionStore;
import DTO.ResultStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramashankar kumar
 */
public class ResultStoreDao {
    public static boolean SetResultOfStudent(ResultStore obj) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into resultstore values(?,?,?,?,?,?)");
        ps.setString(1,obj.getUserid());
        ps.setString(2,obj.getUsername());
        ps.setInt(3,obj.getTotalrightanswer());
        ps.setInt(4,obj.getTotalwronganswer());
        ps.setInt(5,obj.getSetid());
        ps.setString(6,obj.getLanguage());
        
       int count=ps.executeUpdate();
       

        if(count>0)
        {
            
            return true;
        }
        else
            return false;
        
    }
 
  public static ResultStore getResultByLanguageAndId(String userid,String language,String setid)throws SQLException
    {
       
        
        Connection conn=DBConnection.getConnection();
        
        PreparedStatement ps=conn.prepareStatement("select * from ResultStore where language=? and setid=? and userid=?");

        int index=language.indexOf(".");
        String coursename=language.substring(0,index);
         
        ps.setString(1,coursename);
        ps.setInt(2,Integer.parseInt(setid));
        ps.setString(3,userid);
        ResultSet rs=ps.executeQuery();
        ResultStore obj=null;
        while(rs.next())
        {
           
            String useri=rs.getString(1);
            String usern=rs.getString(2);
            int rightanswer=rs.getInt(3);
            int wronganswer=rs.getInt(4);
            
          
            obj=new ResultStore(usern,useri,rightanswer,wronganswer,Integer.parseInt(setid),coursename);
           
        }  
      return obj;  
    }       
        
        
}
    

