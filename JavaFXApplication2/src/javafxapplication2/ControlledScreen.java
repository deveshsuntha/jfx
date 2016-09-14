/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.util.HashMap;
import javafx.stage.Screen;

/**
 *
 * @author LENOVO
 */
public interface ControlledScreen {
    
    HashMap<String, Screen> screens = new HashMap<String, Screen>();
    
    public void setScreenParent(ScreensController screenPage);
    
}
