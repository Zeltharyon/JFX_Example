package controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class startController implements Initializable {

    public Label greetings;
    public Label explain;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String user = "Machin";
        greetings.setText("Bienvenue, " + user);
        explain.setText("""
                La structure de cette fenêtre se trouve dans views/windows/start.fxml,\s
                le controller se trouve dans controllers/startController,\s
                et sa feuille de style se trouve dans views/css/style.css.""");
    }
}
