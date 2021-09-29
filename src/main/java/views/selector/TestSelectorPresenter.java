package views.selector;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import utils.SelectedTestType;

import java.net.URL;
import java.util.ResourceBundle;

public class TestSelectorPresenter implements Initializable {

    // JavaFX injected node variables

    // Other variables
    private SimpleBooleanProperty testSelected;
    private SelectedTestType selectedTest;

    // Constructors
    public TestSelectorPresenter() {
        testSelected = new SimpleBooleanProperty(false);
    }

    // Getters & Setters
    public SimpleBooleanProperty testSelectedProperty() {
        return testSelected;
    }

    public SelectedTestType getSelectedTest() {
        return selectedTest;
    }

    // Initialization methods
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        testSelected = new SimpleBooleanProperty(false);
    }

    // UI event methods
    @FXML
    void runTest01(ActionEvent event) {
        selectedTest = SelectedTestType.ONE;
        testSelected.set(true);
        event.consume();
    }

    @FXML
    void runTest02(ActionEvent event) {
        selectedTest = SelectedTestType.TWO;
        testSelected.set(true);
        event.consume();
    }

    @FXML
    void runTest03(ActionEvent event) {
        selectedTest = SelectedTestType.THREE;
        testSelected.set(true);
        event.consume();
    }

    @FXML
    void runTest04(ActionEvent event) {
        selectedTest = SelectedTestType.FOUR;
        testSelected.set(true);
        event.consume();
    }

    @FXML
    void runTest05(ActionEvent event) {
        selectedTest = SelectedTestType.FIVE;
        testSelected.set(true);
        event.consume();
    }

    @FXML
    void runTest06(ActionEvent event) {
        selectedTest = SelectedTestType.SIX;
        testSelected.set(true);
        event.consume();
    }

    @FXML
    void runIssueFix(ActionEvent event) {
        selectedTest = SelectedTestType.FIX;
        testSelected.set(true);
        event.consume();
    }

    // Other methods


}