package resultmanagement;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Pane admin_menu,register_menu,teacher_menu,student_menu,consultant_menu,advisor_menu;

    @FXML
    private AnchorPane admin_login_panel,register_login_panel;

    @FXML
    private JFXButton admin_login_cancel_btn,register_login_cancel_btn;

    @FXML
    private ToggleGroup admin_rype_toggle,register_rype_toggle;
    
    //Login
    public boolean login(){
        return true;
    }
    //Main Menu Action
    @FXML
    void mainAct(MouseEvent event) {
        if(event.getSource() == admin_menu){
            admin_login_panel.setVisible(true);
        }
        else if(event.getSource() == register_menu){
            register_login_panel.setVisible(true);
        }
    }
    //Cancel Button Action
    @FXML
    void admin_login_cancel_act(ActionEvent event) {
        if(event.getSource() == admin_login_cancel_btn){
            admin_login_panel.setVisible(false);
        }
        else if(event.getSource() == register_login_cancel_btn){
            register_login_panel.setVisible(false);
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
