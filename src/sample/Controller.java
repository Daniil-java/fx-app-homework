package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    Date date = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm");

    @FXML
    TextArea messageArea;

    @FXML
    TextArea message;

    @FXML
    TextField nickname;

    public void sendMessage(ActionEvent actionEvent) {
        nickname.setDisable(true);
        messageArea.appendText(formatForDateNow.format(date) + " " + nickname.getText() + ": " + message.getText() + "\n");
        message.setText("");
    }
}
