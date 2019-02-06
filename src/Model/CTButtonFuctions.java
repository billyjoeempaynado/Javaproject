
package Model;

import cinema.ticketing.app.CinemaTicketingApp;
import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CTButtonFuctions {
    
    CinemaTicketingApp primary = new CinemaTicketingApp();
    
    public void setExit()
    {
        System.exit(0);
    }
    
    public void setShowReserveSeats(Event event)
    {
        try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/CTSeats.fxml"));
             Parent root = (Parent) loader.load();
             Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 
             stage.hide();
             stage.setScene(new Scene(root));  
             stage.show();    
             primary.MovableStage(root, stage);

            } catch (IOException ex) {
             ex.printStackTrace();
            }
    }
    
    public void setShowMovielist(Event event)
    {
        try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/CTMovielist.fxml"));
             Parent root = (Parent) loader.load();
             Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 
             stage.hide();
             stage.setScene(new Scene(root));  
             stage.show();    
             primary.MovableStage(root, stage);

            } catch (IOException ex) {
             ex.printStackTrace();
            }
    }
    
    public void setShowPayment(Event event)
    {
        try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/CTPayment.fxml"));
             Parent root = (Parent) loader.load();
             Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 
             stage.hide();
             stage.setScene(new Scene(root));  
             stage.show();    
             primary.MovableStage(root, stage);

            } catch (IOException ex) {
             ex.printStackTrace();
            }
    }
    
}
