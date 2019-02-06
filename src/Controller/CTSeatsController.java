
package Controller;

import Model.CTButtonFuctions;
import Model.CTCustomers;
import Model.CTReserveSeats;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;


public class CTSeatsController implements Initializable {
    
    @FXML
    private ImageView CTSeats_exit;
    @FXML
    private JFXButton CTSeats_button_payment;
    @FXML
    private JFXButton CTSeats_button_backtolist;
    @FXML
    private JFXCheckBox CT_seat_1;
    @FXML
    private JFXCheckBox CT_seat_7;
    @FXML
    private JFXCheckBox CT_seat_2;
    @FXML
    private JFXCheckBox CT_seat_3;
    @FXML
    private JFXCheckBox CT_seat_4;
    @FXML
    private JFXCheckBox CT_seat_5;
    @FXML
    private JFXCheckBox CT_seat_6;
    @FXML
    private JFXCheckBox CT_seat_8;
    @FXML
    private JFXCheckBox CT_seat_9;
    @FXML
    private JFXCheckBox CT_seat_10;
    @FXML
    private JFXCheckBox CT_seat_11;
    @FXML
    private JFXCheckBox CT_seat_12;
    @FXML
    private JFXCheckBox CT_seat_13;
    @FXML
    private JFXCheckBox CT_seat_14;
    @FXML
    private JFXCheckBox CT_seat_15;
    @FXML
    private JFXCheckBox CT_seat_17;
    @FXML
    private JFXCheckBox CT_seat_16;
    @FXML
    private JFXCheckBox CT_seat_18;
    @FXML
    private JFXCheckBox CT_seat_19;
    @FXML
    private JFXCheckBox CT_seat_20;
    @FXML
    private JFXCheckBox CT_seat_21;
    @FXML
    private JFXCheckBox CT_seat_22;
    @FXML
    private JFXCheckBox CT_seat_23;
    @FXML
    private JFXCheckBox CT_seat_24;
    @FXML
    private JFXCheckBox CT_seat_25;
    @FXML
    private JFXCheckBox CT_seat_26;
    @FXML
    private JFXCheckBox CT_seat_27;
    @FXML
    private JFXCheckBox CT_seat_28;
    @FXML
    private JFXCheckBox CT_seat_29;
    @FXML
    private JFXCheckBox CT_seat_30;
    @FXML
    private JFXCheckBox CT_seat_34;
    @FXML
    private JFXCheckBox CT_seat_35;
    @FXML
    private JFXCheckBox CT_seat_36;
    @FXML
    private JFXCheckBox CT_seat_37;
    @FXML
    private JFXCheckBox CT_seat_38;
    @FXML
    private JFXCheckBox CT_seat_39;
    @FXML
    private JFXCheckBox CT_seat_33;
    @FXML
    private JFXCheckBox CT_seat_40;
    @FXML
    private JFXCheckBox CT_seat_41;
    @FXML
    private JFXCheckBox CT_seat_42;
    @FXML
    private JFXCheckBox CT_seat_32;
    @FXML
    private JFXCheckBox CT_seat_31;
    @FXML
    private JFXCheckBox CT_seat_43;
    @FXML
    private JFXCheckBox CT_seat_44;
    @FXML
    private JFXCheckBox CT_seat_58;
    @FXML
    private JFXCheckBox CT_seat_55;
    @FXML
    private JFXCheckBox CT_seat_57;
    @FXML
    private JFXCheckBox CT_seat_56;
    @FXML
    private JFXCheckBox CT_seat_54;
    @FXML
    private JFXCheckBox CT_seat_53;
    @FXML
    private JFXCheckBox CT_seat_52;
    @FXML
    private JFXCheckBox CT_seat_51;
    @FXML
    private JFXCheckBox CT_seat_50;
    @FXML
    private JFXCheckBox CT_seat_49;
    @FXML
    private JFXCheckBox CT_seat_48;
    @FXML
    private JFXCheckBox CT_seat_47;
    @FXML
    private JFXCheckBox CT_seat_46;
    @FXML
    private JFXCheckBox CT_seat_45;
 
    //CTButtonFunctions Class
    CTButtonFuctions functions = new CTButtonFuctions();
    
    //CTCustomers Class
    CTCustomers customers = new CTCustomers();  
    
    //CTReserveSeats Class
    CTReserveSeats seats = new CTReserveSeats();
    ArrayList<String> seatnumber = seats.setShowReserveSeats();

    String movie_name;
    String movie_guidance;
    Float movie_price;
    String movie_seatnumber;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        getButtonFunctions();
        setRefreshReserveSeats();
        getSeatsReserved();
        

    }    
    

    public void getSeatsReserved()
    {
        if (CT_seat_1.isSelected()) {
            customers.setSeatNumbers("1");
            customers.getSeatNumbers("1");
            
        }
        if (CT_seat_2.isSelected()) {
            customers.setSeatNumbers("2");
            customers.getSeatNumbers("2");
        }
        if (CT_seat_3.isSelected()) {
            customers.setSeatNumbers("3");
            customers.getSeatNumbers("3");
        }
        if (CT_seat_4.isSelected()) {
            customers.setSeatNumbers("4");
            customers.getSeatNumbers("4");
        }
        if (CT_seat_5.isSelected()) {
            customers.setSeatNumbers("5");
            customers.getSeatNumbers("5");
        }
        if (CT_seat_6.isSelected()) {
            customers.setSeatNumbers("6");
            customers.getSeatNumbers("6");
        }
        if (CT_seat_7.isSelected()) {
            customers.setSeatNumbers("7");
            customers.getSeatNumbers("7");
        }
        if (CT_seat_8.isSelected()) {
            customers.setSeatNumbers("8");
            customers.getSeatNumbers("8");
        }
        if (CT_seat_9.isSelected()) {
            customers.setSeatNumbers("9");
            customers.getSeatNumbers("9");
        }
        if (CT_seat_10.isSelected()) {
            customers.setSeatNumbers("10");
            customers.getSeatNumbers("10");
        }
        
        if (CT_seat_11.isSelected()) {
            customers.setSeatNumbers("11");
            customers.getSeatNumbers("11");
        }
        if (CT_seat_12.isSelected()) {
            customers.setSeatNumbers("12");
            customers.getSeatNumbers("12");
        }
        if (CT_seat_13.isSelected()) {
            customers.setSeatNumbers("13");
            customers.getSeatNumbers("13");
        }
        if (CT_seat_14.isSelected()) {
            customers.setSeatNumbers("14");
            customers.getSeatNumbers("14");
        }
        if (CT_seat_15.isSelected()) {
            customers.setSeatNumbers("15");
            customers.getSeatNumbers("15");
        }
        if (CT_seat_16.isSelected()) {
            customers.setSeatNumbers("16");
            customers.getSeatNumbers("16");
        }
        if (CT_seat_17.isSelected()) {
            customers.setSeatNumbers("17");
            customers.getSeatNumbers("17");
        }
        if (CT_seat_18.isSelected()) {
            customers.setSeatNumbers("18");
            customers.getSeatNumbers("18");
        }
        if (CT_seat_19.isSelected()) {
            customers.setSeatNumbers("19");
            customers.getSeatNumbers("19");
        }
        if (CT_seat_20.isSelected()) {
            customers.setSeatNumbers("20");
            customers.getSeatNumbers("20");
        }
        
        if (CT_seat_21.isSelected()) {
            customers.setSeatNumbers("21");
            customers.getSeatNumbers("21");
        }
        if (CT_seat_22.isSelected()) {
            customers.setSeatNumbers("22");
            customers.getSeatNumbers("22");
        }
        if (CT_seat_23.isSelected()) {
            customers.setSeatNumbers("23");
            customers.getSeatNumbers("23");
        }
        if (CT_seat_24.isSelected()) {
            customers.setSeatNumbers("24");
            customers.getSeatNumbers("24");
        }
        if (CT_seat_25.isSelected()) {
            customers.setSeatNumbers("25");
            customers.getSeatNumbers("25");
        }
        if (CT_seat_26.isSelected()) {
            customers.setSeatNumbers("26");
            customers.getSeatNumbers("26");
        }
        if (CT_seat_27.isSelected()) {
            customers.setSeatNumbers("27");
            customers.getSeatNumbers("27");
        }
        if (CT_seat_28.isSelected()) {
            customers.setSeatNumbers("28");
            customers.getSeatNumbers("28");
        }
        if (CT_seat_29.isSelected()) {
            customers.setSeatNumbers("29");
            customers.getSeatNumbers("29");
        }
        if (CT_seat_30.isSelected()) {
            customers.setSeatNumbers("30");
            customers.getSeatNumbers("30");
        }
        
        if (CT_seat_31.isSelected()) {
            customers.setSeatNumbers("31");
            customers.getSeatNumbers("31");
        }
        if (CT_seat_32.isSelected()) {
            customers.setSeatNumbers("32");
            customers.getSeatNumbers("32");
        }
        if (CT_seat_33.isSelected()) {
            customers.setSeatNumbers("33");
            customers.getSeatNumbers("33");
        }
        if (CT_seat_34.isSelected()) {
            customers.setSeatNumbers("34");
            customers.getSeatNumbers("34");
        }
        if (CT_seat_35.isSelected()) {
            customers.setSeatNumbers("35");
            customers.getSeatNumbers("35");
        }
        if (CT_seat_36.isSelected()) {
            customers.setSeatNumbers("36");
            customers.getSeatNumbers("36");
        }
        if (CT_seat_37.isSelected()) {
            customers.setSeatNumbers("37");
            customers.getSeatNumbers("37");
        }
        if (CT_seat_38.isSelected()) {
            customers.setSeatNumbers("38");
            customers.getSeatNumbers("38");
        }
        if (CT_seat_39.isSelected()) {
            customers.setSeatNumbers("39");
            customers.getSeatNumbers("39");
        }
        if (CT_seat_40.isSelected()) {
            customers.setSeatNumbers("40");
            customers.getSeatNumbers("40");
        }
        
        if (CT_seat_41.isSelected()) {
            customers.setSeatNumbers("41");
            customers.getSeatNumbers("41");
        }
        if (CT_seat_42.isSelected()) {
            customers.setSeatNumbers("42");
            customers.getSeatNumbers("42");
        }
        if (CT_seat_43.isSelected()) {
            customers.setSeatNumbers("43");
            customers.getSeatNumbers("43");
        }
        if (CT_seat_44.isSelected()) {
            customers.setSeatNumbers("44");
            customers.getSeatNumbers("44");
        }
        if (CT_seat_45.isSelected()) {
            customers.setSeatNumbers("45");
            customers.getSeatNumbers("45");
        }
        if (CT_seat_46.isSelected()) {
            customers.setSeatNumbers("46");
            customers.getSeatNumbers("46");
        }
        if (CT_seat_47.isSelected()) {
            customers.setSeatNumbers("47");
            customers.getSeatNumbers("47");
        }
        if (CT_seat_48.isSelected()) {
            customers.setSeatNumbers("48");
            customers.getSeatNumbers("48");
        }
        if (CT_seat_49.isSelected()) {
            customers.setSeatNumbers("49");
            customers.getSeatNumbers("49");
        }
        if (CT_seat_50.isSelected()) {
            customers.setSeatNumbers("50");
            customers.getSeatNumbers("50");
        }
        
        if (CT_seat_51.isSelected()) {
            customers.setSeatNumbers("51");
            customers.getSeatNumbers("51");
        }
        if (CT_seat_52.isSelected()) {
            customers.setSeatNumbers("52");
            customers.getSeatNumbers("52");
        }
        if (CT_seat_53.isSelected()) {
            customers.setSeatNumbers("53");
            customers.getSeatNumbers("53");
        }
        if (CT_seat_54.isSelected()) {
            customers.setSeatNumbers("54");
            customers.getSeatNumbers("54");
        }
        if (CT_seat_55.isSelected()) {
            customers.setSeatNumbers("55");
            customers.getSeatNumbers("55");
        }
        if (CT_seat_56.isSelected()) {
            customers.setSeatNumbers("56");
            customers.getSeatNumbers("56");
        }
        if (CT_seat_57.isSelected()) {
            customers.setSeatNumbers("57");
            customers.getSeatNumbers("57");
        }
        if (CT_seat_58.isSelected()) {
            customers.setSeatNumbers("58");
            customers.getSeatNumbers("58");
        }
    }
    
    public void setRefreshReserveSeats()
    {
        for (String x : seatnumber) {
            
        if (x.equals("1")) {
            CT_seat_1.setVisible(false);  
        }
        if (x.equals("2")) {
            CT_seat_2.setVisible(false);
        }
        if (x.equals("3")) {
            CT_seat_3.setVisible(false);
        }
        if (x.equals("4")) {
            CT_seat_4.setVisible(false);
        }
        if (x.equals("5")) {
            CT_seat_5.setVisible(false);
        }
        if (x.equals("6")) {
            CT_seat_6.setVisible(false);
        }
        if (x.equals("7")) {
            CT_seat_7.setVisible(false);
        }
        if (x.equals("8")) {
            CT_seat_8.setVisible(false);
        }
        if (x.equals("9")) {
            CT_seat_9.setVisible(false);
        }
        if (x.equals("10")) {
            CT_seat_10.setVisible(false);
        }
        
        if (x.equals("11")) {
            CT_seat_11.setVisible(false);  
        }
        if (x.equals("12")) {
            CT_seat_12.setVisible(false);
        }
        if (x.equals("13")) {
            CT_seat_13.setVisible(false);
        }
        if (x.equals("14")) {
            CT_seat_14.setVisible(false);
        }
        if (x.equals("15")) {
            CT_seat_15.setVisible(false);
        }
        if (x.equals("16")) {
            CT_seat_16.setVisible(false);
        }
        if (x.equals("17")) {
            CT_seat_17.setVisible(false);
        }
        if (x.equals("18")) {
            CT_seat_18.setVisible(false);
        }
        if (x.equals("19")) {
            CT_seat_19.setVisible(false);
        }
        if (x.equals("20")) {
            CT_seat_20.setVisible(false);
        }
        
        if (x.equals("21")) {
            CT_seat_21.setVisible(false);  
        }
        if (x.equals("22")) {
            CT_seat_22.setVisible(false);
        }
        if (x.equals("23")) {
            CT_seat_23.setVisible(false);
        }
        if (x.equals("24")) {
            CT_seat_24.setVisible(false);
        }
        if (x.equals("25")) {
            CT_seat_25.setVisible(false);
        }
        if (x.equals("26")) {
            CT_seat_26.setVisible(false);
        }
        if (x.equals("27")) {
            CT_seat_27.setVisible(false);
        }
        if (x.equals("28")) {
            CT_seat_28.setVisible(false);
        }
        if (x.equals("29")) {
            CT_seat_29.setVisible(false);
        }
        if (x.equals("30")) {
            CT_seat_30.setVisible(false);
        }
        
        if (x.equals("31")) {
            CT_seat_31.setVisible(false);  
        }
        if (x.equals("32")) {
            CT_seat_32.setVisible(false);
        }
        if (x.equals("33")) {
            CT_seat_33.setVisible(false);
        }
        if (x.equals("34")) {
            CT_seat_34.setVisible(false);
        }
        if (x.equals("35")) {
            CT_seat_35.setVisible(false);
        }
        if (x.equals("36")) {
            CT_seat_36.setVisible(false);
        }
        if (x.equals("37")) {
            CT_seat_37.setVisible(false);
        }
        if (x.equals("38")) {
            CT_seat_38.setVisible(false);
        }
        if (x.equals("39")) {
            CT_seat_39.setVisible(false);
        }
        if (x.equals("40")) {
            CT_seat_40.setVisible(false);
        }
        
        if (x.equals("41")) {
            CT_seat_41.setVisible(false);  
        }
        if (x.equals("42")) {
            CT_seat_42.setVisible(false);
        }
        if (x.equals("43")) {
            CT_seat_43.setVisible(false);
        }
        if (x.equals("44")) {
            CT_seat_44.setVisible(false);
        }
        if (x.equals("45")) {
            CT_seat_45.setVisible(false);
        }
        if (x.equals("46")) {
            CT_seat_46.setVisible(false);
        }
        if (x.equals("47")) {
            CT_seat_47.setVisible(false);
        }
        if (x.equals("48")) {
            CT_seat_48.setVisible(false);
        }
        if (x.equals("49")) {
            CT_seat_49.setVisible(false);
        }
        if (x.equals("50")) {
            CT_seat_50.setVisible(false);
        }
        
        if (x.equals("51")) {
            CT_seat_51.setVisible(false);  
        }
        if (x.equals("52")) {
            CT_seat_52.setVisible(false);
        }
        if (x.equals("53")) {
            CT_seat_53.setVisible(false);
        }
        if (x.equals("54")) {
            CT_seat_54.setVisible(false);
        }
        if (x.equals("55")) {
            CT_seat_55.setVisible(false);
        }
        if (x.equals("56")) {
            CT_seat_56.setVisible(false);
        }
        if (x.equals("57")) {
            CT_seat_57.setVisible(false);
        }
        if (x.equals("58")) {
            CT_seat_58.setVisible(false);
        }
    }
        
        
    }
     
    public void getButtonFunctions()
    {
        CTSeats_exit.setOnMouseClicked(event->{
            functions.setExit();
        });
        
        CTSeats_button_backtolist.setOnMouseClicked(event->{
            functions.setShowMovielist(event);
        });
        
        CTSeats_button_payment.setOnMouseClicked(event->{
            getSeatsReserved();
            functions.setShowPayment(event);
        });           
    }

}
