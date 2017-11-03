package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML private Text actiontarget;
    @FXML private TextField userNameField;
    @FXML private PasswordField passwordField;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("- " + userNameField.getText() + " / " + passwordField.getText() + " -");
    }
}
