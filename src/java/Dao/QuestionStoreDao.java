/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBUtil.DBConnection;
import DTO.QuestionStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramashankar kumar
 */
public class QuestionStoreDao {
    public static ArrayList<QuestionStore> getAllQuestionByLanguageAndId(String language,String setid)throws SQLException
    {
        ArrayList<QuestionStore> array=new ArrayList();
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from QuestionStore where language=? and setid=?");

        int index=language.indexOf(".");
        String coursename=language.substring(0,index);
         
        ps.setString(1,coursename);
        ps.setInt(2,Integer.parseInt(setid));
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            int Qno=rs.getInt(1);
            String Question=rs.getString(2);
            String Answer1=rs.getString(3);
            String Answer2=rs.getString(4);
            String Answer3=rs.getString(5);
            String Answer4=rs.getString(6);
            String RightAnswer=rs.getString(7);
            int totalQno=rs.getInt(8);
           
            QuestionStore obj=new QuestionStore(Qno,Question,Answer1,Answer2,Answer3,Answer4,RightAnswer,totalQno,Integer.parseInt(setid),coursename);
            array.add(obj);
        }  
      return array;  
    }
}
