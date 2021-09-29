package views.test04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Test04Presenter implements Initializable {

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
        Test04View view = new Test04View();
        Test04Presenter presenter = (Test04Presenter) view.getPresenter();
        presenter.setLevel(level + 1);
        view.getViewAsync(vbox.getChildren()::add);
        event.consume();
    }

    // Other methods
    private void setLabelText() {
        label.setText("Level " + level);
    }

}