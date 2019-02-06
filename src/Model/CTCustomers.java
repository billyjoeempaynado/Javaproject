
package Model;

import Controller.CTPaymentController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class CTCustomers {
    
    //Database Connectivity
    DatabaseConnection databaseconnection = new DatabaseConnection();
    Connection con = databaseconnection.DatabaseConnection();
    PreparedStatement pre = null; 
    ResultSet res = null; 
    
    //CT Payment Controller
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/CTPayment.fxml"));
    CTPaymentController payment = loader.getController();
    
    //CTButtonFunctions Class
    CTButtonFuctions functions = new CTButtonFuctions();

    static String moviesname = null;
    public String setMovieName()
    {
        return moviesname;
    }
    
    static float moviesprice = 0;
    public float setMoviePrice()
    {
        return moviesprice;
    }
    
    static String moviesguidance = null;
    public String setMovieGuidance()
    {
        return moviesguidance;
    }
    
    public void getMovieDetails(String name, float price, String guidance)
    {
        moviesname = name;
        moviesprice = price;
        moviesguidance = guidance;
    }
    
    static ArrayList<String> seats = new  ArrayList<String>();
    public void getSeatNumbers(String numbers)
    {
        seats.add(numbers);
    }
    
    public ArrayList<String> setSeatNumbers()
    {
        return seats;
    }

    public void setSeatNumbers(String numbers)
    {
        String sqlquery = "insert into customers (customers_moviename, customers_seatnumber) values (?,?)";
        try {
            pre = con.prepareStatement(sqlquery); 
            pre.setString(1, moviesname);
            pre.setString(2, numbers);
            pre.executeUpdate();
            pre.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
           
    public int setQuantity()
    {
        int quantity = seats.size();
        return quantity;
    }
    
    public void setPayment(float money, Event event)
    {
        int quantity = seats.size();
        float cost = moviesprice * quantity;
        float change = money - cost;     
        if (setPaymentValidation(cost, money)) 
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Customer Bill.");
            alert.setHeaderText(null);
            alert.setContentText("Movie Details" + "\n"
                                +"Movie Name: "+ moviesname + "\n"
                                +"Movie Price: "+ moviesprice + "\n"
                                +"Movie Guidance: "+ moviesguidance + "\n"
                                +"\n"
                                +"Payment Details" + "\n"
                                +"Seat Numbers Reserved: "+ seats + "\n"
                                +"No. of Ticket bought: "+ quantity + "\n"
                                +"Movie Cost: "+ cost + "\n"
                                +"Customer Money: "+ money + "\n"
                                +"Customer Change: "+ change + "\n"
            );
            
            
            alert.showAndWait();
            seats.clear();
            functions.setShowMovielist(event);
            
        }
        
        
    }
 
    boolean setPaymentValidation(float cost, float money)
    {
        if (money < cost) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error.");
            alert.setContentText("Invalid Money!");
            alert.showAndWait();
            return false;
        }
        return true;
    }

}
