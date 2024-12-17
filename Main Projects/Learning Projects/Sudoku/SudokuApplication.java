package JAVA.Projects.Sudoku;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception {
        uiImpl = new UserInterfaceImple(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Sudoku");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
            
    }

}
