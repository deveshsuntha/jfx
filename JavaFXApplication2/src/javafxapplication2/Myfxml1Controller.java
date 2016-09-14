/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class Myfxml1Controller implements Initializable,ControlledScreen {
    
    ScreensController mycontroller;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    

   
    @FXML
    public void loadPage(ActionEvent e) {
        System.out.println("You clicked");
        String url = "http://www.google.co.in";
        
        mycontroller.setScreen(JavaFXApplication2.screen2ID);
        Myfxml2Controller controller2 = (Myfxml2Controller)mycontroller.getController(JavaFXApplication2.screen2ID);
        controller2.loadBrowser(url);
    }
    
    @FXML
    public void loadGmail(ActionEvent e) {
        System.out.println("You clicked");
        String url = "http://www.gmail.com";
        
        mycontroller.setScreen(JavaFXApplication2.screen2ID);
        Myfxml2Controller controller2 = (Myfxml2Controller)mycontroller.getController(JavaFXApplication2.screen2ID);
                controller2.loadBrowser(url);
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        mycontroller = screenPage;
    }
    
  
}
