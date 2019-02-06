
package Model;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    //Database name: TicketingCinema.db
    //Database Connection
    
    Connection con = null;
    public Connection DatabaseConnection()
    {
        try {
            
             Class.forName("org.sqlite.JDBC");
             con = DriverManager.getConnection("jdbc:sqlite:TicketingCinema.db");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con; 
        
    }
}
