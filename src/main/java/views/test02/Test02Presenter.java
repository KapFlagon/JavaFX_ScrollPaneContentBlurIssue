package views.test02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Test02Presenter implements Initializable {

    // JavaFX injected node variables
    @FXML
    private Label label;

    @FXML
    private VBox vbox;

    // Other variables
    private int level;

    // Constructors

    // Getters & Setters
    public void setLevel(int level) {
        this.level = level;
        setLabelText();
    }

    // Initialization methods
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setLabelText();
    }

    // UI event methods
    @FXML
    void addLayer(ActionEvent event) {
        Test02View view = new Test02View();
        Test02Presenter presenter = (Test02Presenter) view.getPresenter();
        presenter.setLevel(level + 1);
        view.getViewAsync(vbox.getChildren()::add);
        event.consume();
    }

    // Other methods
    private void setLabelText() {
        label.setText("Level " + level);
    }

}