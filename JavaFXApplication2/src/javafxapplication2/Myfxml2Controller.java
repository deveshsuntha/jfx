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
public class Myfxml2Controller implements Initializable,ControlledScreen {
    
    ScreensController mycontroller;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    public void gotoMain(ActionEvent e) {
        System.out.println("You clicked me again");
        mycontroller.setScreen(JavaFXApplication2.screen1ID);
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        mycontroller = screenPage;
                
    }
    
    @FXML
    public WebView wv;
    
    public void loadBrowser(String url) {
        wv.getEngine().load(url);
    }
    
    
    
    
    
    
}
