package driver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import views.issuefix.IssueFixPresenter;
import views.issuefix.IssueFixView;
import views.selector.TestSelectorPresenter;
import views.selector.TestSelectorView;
import views.test01.Test01Presenter;
import views.test01.Test01View;
import views.test02.Test02Presenter;
import views.test02.Test02View;
import views.test03.Test03Presenter;
import views.test03.Test03View;
import views.test04.Test04Presenter;
import views.test04.Test04View;
import views.test05.Test05Presenter;
import views.test05.Test05View;
import views.test06.Test06Presenter;
import views.test06.Test06View;

public class IssueTestApp extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        TestSelectorView selectorView = new TestSelectorView();
        TestSelectorPresenter selectorPresenter = (TestSelectorPresenter) selectorView.getPresenter();
        selectorPresenter.testSelectedProperty().addListener(((observable, oldValue, newValue) -> {
            if(newValue) {
                Scene newScene;
                String titleText;
                switch (selectorPresenter.getSelectedTest()){
                    case ONE:
                        Test01View view01 = new Test01View();
                        Test01Presenter presenter01 = (Test01Presenter) view01.getPresenter();
                        presenter01.setLevel(1);
                        newScene = new Scene(view01.getView());
                        titleText = "Test 01";
                        break;
                    case TWO:
                        Test02View view02 = new Test02View();
                        Test02Presenter presenter02 = (Test02Presenter) view02.getPresenter();
                        presenter02.setLevel(1);
                        newScene = new Scene(view02.getView());
                        titleText = "Test 02";
                        break;
                    case THREE:
                        Test03View view03 = new Test03View();
                        Test03Presenter presenter03 = (Test03Presenter) view03.getPresenter();
                        presenter03.setLevel(1);
                        newScene = new Scene(view03.getView());
                        titleText = "Test 03";
                        break;
                    case FOUR:
                        Test04View view04 = new Test04View();
                        Test04Presenter presenter04 = (Test04Presenter) view04.getPresenter();
                        presenter04.setLevel(1);
                        newScene = new Scene(view04.getView());
                        titleText = "Test 04";
                        break;
                    case FIVE:
                        Test05View view05 = new Test05View();
                        Test05Presenter presenter05 = (Test05Presenter) view05.getPresenter();
                        presenter05.setLevel(1);
                        newScene = new Scene(view05.getView());
                        titleText = "Test 05";
                        break;
                    case SIX:
                        Test06View view06 = new Test06View();
                        Test06Presenter presenter06 = (Test06Presenter) view06.getPresenter();
                        presenter06.setLevel(1);
                        newScene = new Scene(view06.getView());
                        titleText = "Test 06";
                        break;
                    case FIX:
                        IssueFixView issueFixView = new IssueFixView();
                        IssueFixPresenter issueFixPresenter = (IssueFixPresenter) issueFixView.getPresenter();
                        issueFixPresenter.setLevel(1);
                        newScene = new Scene(issueFixView.getView());
                        titleText = "Issue Fixed";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + selectorPresenter.getSelectedTest());
                }
                primaryStage.setTitle(titleText);
                primaryStage.setScene(newScene);
            }
        }));

        Scene scene = new Scene(selectorView.getView());
        primaryStage.setMinWidth(500);
        primaryStage.setMinHeight(450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}