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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author LENOVO
 */
public class MainViewController implements Initializable {
    
    @FXML
    private Button sendRequestButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        for(int i=0;i<100;i++)
        {
            sb.append("Printing some random text " + i);
        }
    }
    
    
    @FXML
    private void onMouseClicked(ActionEvent event) {
        
    }
    
    @FXML
    private TextArea logField;
    
    private StringBuffer sb = new StringBuffer();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
//        logField.setText(sb.toString());
    }    
    
}
