package defalut;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
	Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///project2","root","");
            s =c.createStatement();

        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        new conn();
        System.out.println("Database Connected");
    }
}
