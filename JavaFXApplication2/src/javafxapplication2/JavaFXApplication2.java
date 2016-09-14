/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author LENOVO
 */
public class JavaFXApplication2 extends Application {
    
    public static String screen1ID = "main";
    public static String screen1File = "myfxml1.fxml";
    public static String screen2ID = "otherscreen";
    public static String screen2File = "myfxml2.fxml";
    
    @Override
    public void start(Stage stage) throws Exception {
        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(JavaFXApplication2.screen1ID, JavaFXApplication2.screen1File);
        mainContainer.loadScreen(JavaFXApplication2.screen2ID, JavaFXApplication2.screen2File);
        
        
        mainContainer.setScreen(JavaFXApplication2.screen1ID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
