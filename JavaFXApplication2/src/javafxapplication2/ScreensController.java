/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.util.HashMap;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 *
 * @author LENOVO
 */
class ScreensController extends StackPane {
    
    private HashMap<String, Node> screens = new HashMap<>();
    private HashMap<String, Object> controllers = new HashMap<>();
    
    public ScreensController() {
        super();
    }
    
    //Add a screen
    public void addScreen(String name, Node screen) {
        screens.put(name, screen);
    }
    
     //Returns the Node with the appropriate name
    public Node getScreen(String name) {
        return screens.get(name);
    }
    
    public boolean loadScreen(String name, String resource) {
        
        try {
            FXMLLoader myloader = new FXMLLoader(getClass().getResource(resource));
            Parent loadScreen = (Parent) myloader.load();
            ControlledScreen myScreenController = myloader.getController();
            myScreenController.setScreenParent(this);
            addScreen(name, loadScreen);
            addController(name,myScreenController);
            return true;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
    public boolean setScreen(final String name) {
        
        if(screens.get(name) != null) {
            final DoubleProperty opacity = opacityProperty();
            
            if(!getChildren().isEmpty()) {
                Timeline fade = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(opacity, 1.0)),
                new KeyFrame(new Duration(600), new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent event) {
                        getChildren().remove(0);
                        getChildren().add(0, screens.get(name));
                        Timeline fadein = new Timeline(
                                new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                                new KeyFrame(new Duration(500), new KeyValue(opacity, 1.0)));
                        fadein.play();
                                
                        
                    }
                }, new KeyValue(opacity, 0.0)));
                
                fade.play();
                
            } else {
                setOpacity(0.0);
                getChildren().add(screens.get(name));
                
                Timeline fadein = new Timeline(
                                new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
                                new KeyFrame(new Duration(500), new KeyValue(opacity, 1.0)));
                fadein.play();
            }
            
            return true;
        } else {
            System.out.println("screen hasn't been loaded");
            return false;
        }
        
        
    }
    
    public boolean unloadScreen(String name) {
        if (screens.remove(name) == null) {
            System.out.println("Screen didn't exist");
            return false;
        } else {
            return true;
        }
    }
    
    public Object getController(String name) {
        return controllers.get(name);
    }

    private void addController(String name, ControlledScreen ScreenController) {
        controllers.put(name,ScreenController);
    }
    
}
