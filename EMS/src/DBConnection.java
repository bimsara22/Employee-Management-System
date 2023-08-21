import jdk.internal.dynalink.beans.StaticClass;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection con;
    static Connection createDBConnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
            String username="root";
            String password="Yb16842.";
           con= DriverManager.getConnection(url,username,password);

        }
        catch (Exception ex){
           ex.printStackTrace();
        }
        return con;
    }


}
