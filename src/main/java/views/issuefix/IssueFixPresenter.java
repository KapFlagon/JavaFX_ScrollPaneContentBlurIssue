package views.issuefix;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class IssueFixPresenter implements Initializable {

    // JavaFX injected node variables
    @FXML
    private Label label;

    @FXML
    private VBox vbox;

    @FXML
    private ScrollPane scrollPane;

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
        scrollPane.skinProperty().addListener(((observable, oldValue, newValue) -> {
            fixBlurryText(scrollPane);
        }));
    }

    // UI event methods
    @FXML
    void addLayer(ActionEvent event) {
        IssueFixView view = new IssueFixView();
        IssueFixPresenter presenter = (IssueFixPresenter) view.getPresenter();
        presenter.setLevel(level + 1);
        view.getViewAsync(vbox.getChildren()::add);
        event.consume();
    }

    // Other methods
    private void setLabelText() {
        label.setText("Level " + level);
    }

    public void fixBlurryText(ScrollPane scrollPane) {
        StackPane stackPane = (StackPane) scrollPane.lookup("ScrollPane .viewport");
        stackPane.setCache(false);
    }


}