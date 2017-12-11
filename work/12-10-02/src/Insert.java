import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Insert {
    public static void main(String[] args) throws Exception{
        Class.forName("sun.jdbc.odbc.jdbcOdbcDriver");
        Connection conn = DriverManager.getConnection("jdbc:odbc:DDSchool");
        Statement state = conn.createStatement();
        String sql = "";
        ResultSet rs = state.executeQuery(sql);
        while(rs.next()){
            String stuno = rs.getString("STUNO");
            String stuname = rs.getString("STUNAME");
            System.out.println(stuno+" "+stuname);
        }
        state.close();
        conn.close();
    }
}
