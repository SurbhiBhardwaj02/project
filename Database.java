import java.sql.*;

public class Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yy", "root", "");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from stud");
        while (rs.next()) {
            System.out.println(rs.getInt(1) +" "+rs.getString("name") );
        }
        con.close();
    }
}







