
package Controller;

import Model.CTButtonFuctions;
import Model.CTCustomers;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class CTPaymentController implements Initializable {
  
    @FXML
    private ImageView CTPayment_exit;
    @FXML
    private Label CTPayment_moviedetails_moviename;
    @FXML
    private Label CTPayment_moviedetails_movieprice;
    @FXML
    private JFXButton CTPayment_button_pay;
    @FXML
    private TextField CTPayment_txtfield_amount;
    @FXML
    private TextField CTPayment_txtfield_quantity;
    @FXML
    private Label CTPayment_moviedetails_movieguidance;   
    
    
    //CTButtonFucntions Class
    CTButtonFuctions functions = new CTButtonFuctions();
    
    //CTCustomers Class
    CTCustomers customers = new CTCustomers();

    String moviename = customers.setMovieName();
    float price = customers.setMoviePrice();
    String guidance = customers.setMovieGuidance();
    int quantity = customers.setQuantity();
    ArrayList<String> seatnumbers = customers.setSeatNumbers();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        getButtonFunctions();  
        setCustomerDetails();
    }    
    
    public void getButtonFunctions()
    {
        CTPayment_exit.setOnMouseClicked(event->{
            functions.setExit();
        });
        CTPayment_button_pay.setOnAction(event->{
            customers.setPayment(Float.parseFloat(CTPayment_txtfield_amount.getText()), event);  
        });
    }
    
    public void setCustomerDetails()
    {
        CTPayment_moviedetails_moviename.setText(moviename);
        CTPayment_moviedetails_movieprice.setText(price+"");
        CTPayment_moviedetails_movieguidance.setText(guidance);
        CTPayment_txtfield_quantity.setText(quantity+"");
 
    }
    

}
