package ControlPackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class MainWindowController implements Initializable {
    
    
    // Declaration goes here
    
    @FXML
    private Button SolverBtn;

    @FXML
    private Button AboutBtn;


    Stage SolverWindow = new Stage();
    
    
    // Opens Solver window on click
    @FXML
    void SolverBtn_Action(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ViewPackage/SolverWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            SolverWindow.setScene(new Scene(root1)); 
            SolverWindow.show();
        }
        catch(Exception e){
            System.out.println("Can not load the Solver Window");
        }

    }

    @FXML
    void AboutBtn_Action(ActionEvent event) {
        
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ViewPackage/AboutWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            SolverWindow.setScene(new Scene(root1)); 
            SolverWindow.show();
        }
        catch(Exception e){
            System.out.println("Can not load the Solver Window");
        }

    }
    
    
    // Executes on start
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        SolverWindow.setTitle("Decipher the Cube- Solver Window");
        
    }    
    
}
