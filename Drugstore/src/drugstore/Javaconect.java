package drugstore;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author SHAWN
 */
public class Javaconect {  //class for database connection.
     public static Connection connectme(){ //method for connecting to the database.
    try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/drugs","root","");
       return conn;

    }
    catch(Exception e){
         }
        Connection conn = null;
        return conn;
    }
}


