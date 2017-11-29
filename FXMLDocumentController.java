package resultmanagement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class FXMLDocumentController implements Initializable {

    //Admin
    Admin admin = new Admin(111, "abdurrahman", "rahman09");
    //RegisterList
    public ObservableList<Register> registerlist = FXCollections.observableArrayList();

    @FXML
    private Pane admin_menu, register_menu, teacher_menu, student_menu, consultant_menu, advisor_menu;

    @FXML
    private AnchorPane admin_login_panel, register_login_panel;

    @FXML
    private AnchorPane admin_dashboard, register_dashboard;
    
    @FXML
    private ToggleGroup admin_rype_toggle, register_rype_toggle;

    //Login
    public boolean login(String username, String password) {
        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    //Main Menu Action
    @FXML
    void mainAct(MouseEvent event) {
        if (event.getSource() == admin_menu) {
            admin_login_panel.setVisible(true);
        } else if (event.getSource() == register_menu) {
            register_login_panel.setVisible(true);
        }
    }
    
    @FXML
    private JFXButton admin_login_btn, register_login_btn;
    
    @FXML
    private JFXTextField admin_username_field;

    @FXML
    private JFXPasswordField admin_password_field;
    
    //Login Button Action
    @FXML
    void loginAct(ActionEvent event) {
        if (event.getSource() == admin_login_btn) {
            if (login(admin_username_field.getText(),admin_password_field.getText())) {
                admin_login_panel.setVisible(false);
                admin_dashboard.setVisible(true);
            }
        } else if (event.getSource() == register_login_btn) {
            if (true) {
                register_login_panel.setVisible(false);
                register_dashboard.setVisible(true);
            }
        }
    }
    
    @FXML
    private JFXButton admin_login_cancel_btn, admin_login_close_btn, register_login_cancel_btn, register_login_close_btn;

    //Cancel Button Action
    @FXML
    void login_cancel_act(ActionEvent event) {
        if (event.getSource() == admin_login_cancel_btn || event.getSource() == admin_login_close_btn) {
            admin_login_panel.setVisible(false);
        } else if (event.getSource() == register_login_cancel_btn || event.getSource() == register_login_close_btn) {
            register_login_panel.setVisible(false);
        }

    }
    //Register Buttion Action
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
