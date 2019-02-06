
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;


public class CTReserveSeats {
    
    //Database Connection
    DatabaseConnection databaseconnection = new DatabaseConnection();
    Connection con = databaseconnection.DatabaseConnection();
    ResultSet res = null; 
    PreparedStatement pre = null; 
    
    //CTCustomers Class
    CTCustomers customers = new CTCustomers();
    String moviename = customers.setMovieName();

    public ArrayList<String> setShowReserveSeats()
    {
        ArrayList<String> seatnumber = new ArrayList<>();
        String sqlquery = "select * from customers where customers_moviename=?";      
        try 
        {
          pre = con.prepareStatement(sqlquery);
          pre.setString(1, moviename);
          res = pre.executeQuery();
          while(res.next())
          {
              seatnumber.add(res.getString("customers_seatnumber"));
              
          }
          pre.close();
          res.close();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        return seatnumber;
    }
    
    public void setResetSeats()
    {
        Alert confirmation = new Alert(AlertType.CONFIRMATION);
        confirmation.setTitle("Confirmation Dialog");
        confirmation.setContentText("Are you sure?");
        Optional<ButtonType> result = confirmation.showAndWait();
        if (result.get() == ButtonType.OK)
        {       
           String sqlquery = "delete from Customers";
        try {
            pre = con.prepareStatement(sqlquery); 
            int x = pre.executeUpdate();
            if (x > 1) 
            {
                Alert information = new Alert(AlertType.INFORMATION);
                information.setTitle("Information Dialog");
                information.setContentText("Seats has been successfully reset.");
                information.showAndWait();
            }
            pre.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        } 
        
    }
    
}
