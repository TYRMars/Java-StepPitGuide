import java.sql.*;

public class Select1 {
    public static void main() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCHOOL","root","qazxswedc");
        Statement stat = conn.createStatement();
        String sql = "SELECT STUNO,STUNAME FROM T_STUDENT WHERE STUSEX='女'";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()){
            String stuno = rs.getString("STUNO");
            String stuname = rs.getString("STUNAME");
            System.out.println(stuno + " " + stuname);
        }
        stat.close();
        conn.close();
    }
}
