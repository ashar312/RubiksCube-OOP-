/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalrubikgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ahsun Iqbal
 */
public class FinalRubikGUI extends Application {
    
    @Override
    public void start(Stage MainWindow) throws Exception {
        
        MainWindow.setTitle("Decipher the Cube");
        Parent root = FXMLLoader.load(getClass().getResource("/ViewPackage/MainWindow.fxml"));
        Scene scene = new Scene(root);
        MainWindow.setScene(scene);
        MainWindow.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
