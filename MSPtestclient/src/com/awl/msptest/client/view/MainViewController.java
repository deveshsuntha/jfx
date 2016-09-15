/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awl.msptest.client.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author LENOVO
 */
public class MainViewController implements Initializable {
    
    @FXML private Button sendRequest;
    @FXML private TextArea logField;
    @FXML private ChoiceBox environment;
    @FXML private ChoiceBox typeOfRequest;
    @FXML private Button exitButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    
    @FXML
    private void onMouseClicked(ActionEvent event) {
        
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
