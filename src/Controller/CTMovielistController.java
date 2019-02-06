
package Controller;

import Model.CTButtonFuctions;
import Model.CTCustomers;
import Model.CTReserveSeats;
import Model.DatabaseConnection;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;


public class CTMovielistController implements Initializable {

    @FXML
    private JFXRadioButton TCMovielist_horror1;
    @FXML
    private JFXRadioButton TCMovielist_horror2;
    @FXML
    private JFXRadioButton TCMovielist_horror3;
    @FXML
    private JFXRadioButton TCMovielist_romance1;
    @FXML
    private JFXRadioButton TCMovielist_romance2;
    @FXML
    private JFXRadioButton TCMovielist_romance3;
    @FXML
    private JFXRadioButton TCMovielist_comedy1;
    @FXML
    private JFXRadioButton TCMovielist_comedy2;
    @FXML
    private JFXRadioButton TCMovielist_comedy3;
    @FXML
    private JFXRadioButton TCMovielist_musical1;
    @FXML
    private JFXRadioButton TCMovielist_musical2;
    @FXML
    private JFXRadioButton TCMovielist_musical3;
    @FXML
    private Label TCMovielist_horror1_name;
    @FXML
    private Label TCMovielist_horror1_guidance;
    @FXML
    private Label TCMovielist_horror1_price;
    @FXML
    private Label TCMovielist_horror2_name;
    @FXML
    private Label TCMovielist_horror2_guidance;
    @FXML
    private Label TCMovielist_horror2_price;
    @FXML
    private Label TCMovielist_horror3_name;
    @FXML
    private Label TCMovielist_horror3_guidance;
    @FXML
    private Label TCMovielist_horror3_price;
    @FXML
    private Label TCMovielist_romance1_name;
    @FXML
    private Label TCMovielist_romance1_guidance;
    @FXML
    private Label TCMovielist_romance1_price;
    @FXML
    private Label TCMovielist_romance2_name;
    @FXML
    private Label TCMovielist_romance2_guidance;
    @FXML
    private Label TCMovielist_romance2_price;
    @FXML
    private Label TCMovielist_romance3_name;
    @FXML
    private Label TCMovielist_romance3_guidance;
    @FXML
    private Label TCMovielist_romance3_price;
    @FXML
    private Label TCMovielist_comedy1_name;
    @FXML
    private Label TCMovielist_comedy1_guidance;
    @FXML
    private Label TCMovielist_comedy1_price;
    @FXML
    private Label TCMovielist_comedy2_name;
    @FXML
    private Label TCMovielist_comedy2_guidance;
    @FXML
    private Label TCMovielist_comedy2_price;
    @FXML
    private Label TCMovielist_comedy3_name;
    @FXML
    private Label TCMovielist_comedy3_guidance;
    @FXML
    private Label TCMovielist_comedy3_price;
    @FXML
    private Label TCMovielist_musical1_name;
    @FXML
    private Label TCMovielist_musical1_guidance;
    @FXML
    private Label TCMovielist_musical1_price;
    @FXML
    private Label TCMovielist_musical2_name;
    @FXML
    private Label TCMovielist_musical2_guidance;
    @FXML
    private Label TCMovielist_musical2_price;
    @FXML
    private Label TCMovielist_musical3_name;
    @FXML
    private Label TCMovielist_musical3_guidance;
    @FXML
    private Label TCMovielist_musical3_price;  
    @FXML
    private JFXButton TCMovielist_button_reserveseats;
    @FXML
    private JFXButton TCMovielist_button_resetallseats;
    @FXML
    private ImageView TCMovielist_exit;

    //Database Setup
    DatabaseConnection databaseconnection = new DatabaseConnection();
    Connection con = databaseconnection.DatabaseConnection();
    
    //Functions
    CTButtonFuctions functions = new CTButtonFuctions();
    CTCustomers customers = new CTCustomers();
    CTReserveSeats seats = new CTReserveSeats();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        setRadioButtonRestriction();
        getCustomersDetails();
        getButtonFunctions();
   
    }    
    //METHODS
    public void setRadioButtonRestriction()
    {
        TCMovielist_horror1.setOnAction(e->{
            if (TCMovielist_horror1.isSelected()) 
            {
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false); 
            }
        });
        TCMovielist_horror2.setOnAction(e->{
            if (TCMovielist_horror2.isSelected()) 
            {
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror3.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
                
            }
        });
        TCMovielist_horror3.setOnAction(e->{
            if (TCMovielist_horror3.isSelected()) 
            {
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
                
            }
        });
        TCMovielist_romance1.setOnAction(e->{
            if (TCMovielist_romance1.isSelected()) 
            {
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
                
            }
        });
        TCMovielist_romance2.setOnAction(e->{
            if (TCMovielist_romance2.isSelected()) 
            {
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
                
            }
        });
        TCMovielist_romance3.setOnAction(e->{
            if (TCMovielist_romance3.isSelected()) 
            {
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
                
            }
        });
        TCMovielist_comedy1.setOnAction(e->{
            if (TCMovielist_comedy1.isSelected()) 
            {
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false); 
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
            }
        });
        TCMovielist_comedy2.setOnAction(e->{
            if (TCMovielist_comedy2.isSelected()) 
            {
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false); 
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
            }
        });
        TCMovielist_comedy3.setOnAction(e->{
            if (TCMovielist_comedy3.isSelected()) 
            {
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false); 
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
            }
        });
        TCMovielist_musical1.setOnAction(e->{
            if (TCMovielist_musical1.isSelected()) 
            {
                TCMovielist_musical2.setSelected(false);
                TCMovielist_musical3.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false); 

            }
        });
        TCMovielist_musical2.setOnAction(e->{
            if (TCMovielist_musical2.isSelected()) 
            {
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical3.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false); 

            }
        });
        TCMovielist_musical3.setOnAction(e->{
            if (TCMovielist_musical3.isSelected()) 
            {
                TCMovielist_musical1.setSelected(false);
                TCMovielist_musical2.setSelected(false);
                TCMovielist_comedy1.setSelected(false);
                TCMovielist_comedy2.setSelected(false);
                TCMovielist_comedy3.setSelected(false);
                TCMovielist_romance1.setSelected(false);
                TCMovielist_romance2.setSelected(false);
                TCMovielist_romance3.setSelected(false);
                TCMovielist_horror1.setSelected(false);
                TCMovielist_horror2.setSelected(false);
                TCMovielist_horror3.setSelected(false); 

            }
        });
    }

    public void getCustomersDetails()
    {
        TCMovielist_button_reserveseats.setOnAction(event->{
            if (TCMovielist_horror1.isSelected()) {
                customers.getMovieDetails(TCMovielist_horror1_name.getText(), Float.parseFloat(TCMovielist_horror1_price.getText()), TCMovielist_horror1_guidance.getText());
                functions.setShowReserveSeats(event);
            }else if (TCMovielist_horror2.isSelected()) {
                customers.getMovieDetails(TCMovielist_horror2_name.getText(), Float.parseFloat(TCMovielist_horror2_price.getText()), TCMovielist_horror2_guidance.getText());
                functions.setShowReserveSeats(event);
            }else if (TCMovielist_horror3.isSelected()) {
                customers.getMovieDetails(TCMovielist_horror3_name.getText(), Float.parseFloat(TCMovielist_horror3_price.getText()), TCMovielist_horror3_guidance.getText());
                functions.setShowReserveSeats(event);      
            }else if(TCMovielist_romance1.isSelected()) {
                customers.getMovieDetails(TCMovielist_romance1_name.getText(), Float.parseFloat(TCMovielist_romance1_price.getText()), TCMovielist_romance1_guidance.getText());
                functions.setShowReserveSeats(event);
            }else if(TCMovielist_romance2.isSelected()) {
                customers.getMovieDetails(TCMovielist_romance2_name.getText(), Float.parseFloat(TCMovielist_romance2_price.getText()), TCMovielist_romance2_guidance.getText());
                functions.setShowReserveSeats(event);
            }else if(TCMovielist_romance3.isSelected()) {
                customers.getMovieDetails(TCMovielist_romance3_name.getText(), Float.parseFloat(TCMovielist_romance3_price.getText()), TCMovielist_romance3_guidance.getText());
                functions.setShowReserveSeats(event); 
            }else if (TCMovielist_comedy1.isSelected()) {
                customers.getMovieDetails(TCMovielist_comedy1_name.getText(), Float.parseFloat(TCMovielist_comedy1_price.getText()), TCMovielist_comedy1_guidance.getText());
                functions.setShowReserveSeats(event);
            }else if (TCMovielist_comedy2.isSelected()) {
                customers.getMovieDetails(TCMovielist_comedy2_name.getText(), Float.parseFloat(TCMovielist_comedy2_price.getText()), TCMovielist_comedy2_guidance.getText());
                functions.setShowReserveSeats(event);
            }else if (TCMovielist_comedy3.isSelected()) {
                customers.getMovieDetails(TCMovielist_comedy3_name.getText(), Float.parseFloat(TCMovielist_comedy3_price.getText()), TCMovielist_comedy3_guidance.getText());
                functions.setShowReserveSeats(event);
            }        
            else if (TCMovielist_musical1.isSelected()) {
                customers.getMovieDetails(TCMovielist_musical1_name.getText(), Float.parseFloat(TCMovielist_musical1_price.getText()), TCMovielist_musical1_guidance.getText());
                functions.setShowReserveSeats(event);
            }else if (TCMovielist_musical2.isSelected()) {
                customers.getMovieDetails(TCMovielist_musical2_name.getText(), Float.parseFloat(TCMovielist_musical2_price.getText()), TCMovielist_musical2_guidance.getText());
                functions.setShowReserveSeats(event);
            }else if (TCMovielist_musical3.isSelected()) {
                customers.getMovieDetails(TCMovielist_musical3_name.getText(), Float.parseFloat(TCMovielist_musical3_price.getText()), TCMovielist_musical3_guidance.getText());
                functions.setShowReserveSeats(event);
            }
        });
    }
    
    public void getButtonFunctions()
    {
        TCMovielist_exit.setOnMouseClicked(e->{
            functions.setExit();
        });
        
        TCMovielist_button_resetallseats.setOnAction(event->{
            seats.setResetSeats();
        });
        
        
        
    }
    
}
