
package pos.ui;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class FXMLDocumentController implements Initializable {
    
     @FXML
    private HBox roots;

    @FXML
    private Pane inner_pane;

    @FXML
    private Pane Top_Pane;

    @FXML
    private AnchorPane anchor_1;

    @FXML
    private Button j_buttoms;

    @FXML
    private Button j_buttoms1;

    @FXML
    private Button j_buttoms11;

    @FXML
    private Button j_buttoms111;

    @FXML
    private Button j_buttoms1111;

    @FXML
    private Button j1_buttoms;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }   
    
    private void handleClicks(ActionEvent event){
        
        if(event.getSource() ==j_buttoms )
        {
            
        }
        else if(event.getSource() ==j_buttoms1)
        {
            
        }
        else if(event.getSource() ==j_buttoms1111)
        {
            
        }
        else if(event.getSource() ==j_buttoms111)
        {
            
        }
         else
            if(event.getSource() ==j1_buttoms)
        {
            
        }
        
    }
    
}
