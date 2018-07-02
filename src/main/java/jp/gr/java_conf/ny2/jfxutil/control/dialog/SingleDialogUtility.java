package jp.gr.java_conf.ny2.jfxutil.control.dialog;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SingleDialogUtility {

    private static SingleDialogController controller;
    
    static {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(SingleDialogController.class.getResource("SingleDialog.fxml"));
            root = loader.load();
            controller = loader.getController();
            //root = FXMLLoader.load(SingleDialogController.class.getResource("SingleDialog.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root); // expanded default size
        // scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        controller.setStage(stage);
    }

    public static void showErrorMessage(String sourceScreen, String message) {
        ErrorInfo error = new ErrorInfo();
        error.setSourceScreen(sourceScreen);
        error.setMessageHeader(message);
        controller.addError(error);
        controller.getStage().show();
    }
    
}
