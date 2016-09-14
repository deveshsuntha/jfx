/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.fxml.FXML;

/**
 *
 * @author LENOVO
 */
public class MainController {
    
    @FXML private Myfxml1Controller myfxml1Controller;
    @FXML private Myfxml2Controller myfxml2Controller;
    
    @FXML public void initialize() {
        System.out.println("Main controller initialized");
    }
    
}
