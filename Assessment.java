import javax.swing.*;
import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assessment {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internal_marks", "root", "");

        PreparedStatement ps = con.prepareStatement("insert into info values(?,?)");
        String phone_no= "9652147890  9632587412 919876543234 7890654345";
        String name="aryan radhe tilu ankit";
        Pattern p1= Pattern.compile("(0|91)?" + "[7-9][0-9]{9}");
        Pattern p2=Pattern.compile("\\s[a | r][a-zA-Z]*");
        Matcher m1=p2.matcher(name);
        Matcher m2= p1.matcher(phone_no);

        int ctr=0;
        try
        {
            while(m1.find() && m2.find())
            {
                ctr++;
                ps.setString(1, m1.group());
                ps.setString(2,m2.group());
                ps.executeUpdate();
            }
            if(ctr==0)
            {
                throw new InvalidDataException("no input matches");
            }
            ResultSet rs=ps.executeQuery("select * from info;");
            while(rs.next()){
                System.out.println(rs.getString(1)+" " +rs.getString("name"));

            }
            con.close();

        }
        catch (Exception e){
            System.out.println("Exception occurs "+e);
        }

    }

}
class InvalidDataException extends Exception{
    public InvalidDataException(String a){
        super(a);
    }
}