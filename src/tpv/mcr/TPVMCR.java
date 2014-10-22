/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpv.mcr;

import com.sun.javaws.Main;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class TPVMCR extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        try {
            AnchorPane page = (AnchorPane) FXMLLoader.load(TPVMCR.class.getResource("FXML.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(TPVMCR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void helloWorld(){
        System.out.println("hola mundo!");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(TPVMCR.class, (java.lang.String[]) null);
       
    }
    
}
