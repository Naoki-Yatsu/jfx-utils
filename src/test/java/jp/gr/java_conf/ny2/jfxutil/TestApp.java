package jp.gr.java_conf.ny2.jfxutil;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jp.gr.java_conf.ny2.jfxutil.control.dialog.SingleDialogUtility;

public class TestApp extends Application {

    private static final Logger logger = LoggerFactory.getLogger(TestApp.class);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        logger.info("Start Application.");

        Parent root = FXMLLoader.load(TestAppController.class.getResource("TestApp.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Root");
        primaryStage.setResizable(false);
        primaryStage.show();
        
        SingleDialogUtility.showErrorMessage("MAIN", "TEST");
    }

}
