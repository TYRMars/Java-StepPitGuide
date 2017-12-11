package Dao;

import java.sql.*;
import java.util.ArrayList;

public class StudentDao {
    public ArrayList quertAllStudent() throws Exception{
        Connection conn = null;
        ArrayList students = new ArrayList();
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:DSSchool";
            conn = DriverManager.getConnection(url,"","");
            String sql = "";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                Student student = new student();
                student.setStuno(rs.getString("STUNO"));
                student.setStuname(rs.getString("STUNAME"));
                student.add(student);
            }
            rs.close();
            stat.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(conn != null){
                    conn.close();
                }
            }catch (Exception ex){

            }
        }
        return students;
    }
}
