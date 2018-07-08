package jp.gr.java_conf.ny2.jfxutil.control.dialog;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.stage.Stage;

public class SingleDialogController {
    
    // //////////////////////////////////////
    // Field
    // //////////////////////////////////////

    // Logger
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    @FXML
    TreeTableView<ErrorInfo> messageTable;

    @FXML
    TreeTableColumn<ErrorInfo, LocalDateTime> timeColumn;

    @FXML
    TreeTableColumn<ErrorInfo, String> sourceColumn;

    @FXML
    TreeTableColumn<ErrorInfo, String> messageColumn;
    
    Stage stage;
    
    // //////////////////////////////////////
    // Constructor
    // //////////////////////////////////////
    
    @FXML
    protected void initialize() {
        logger.info("Initializd.");
        
        // Create a TreeTableView with model
        messageTable.setShowRoot(false);
        
        // Create three columns
        timeColumn.setCellValueFactory(c -> c.getValue().getValue().dateTimeProperty());
        sourceColumn.setCellValueFactory(c -> c.getValue().getValue().sourceScreenProperty());
        messageColumn.setCellValueFactory(c -> c.getValue().getValue().messageHeaderProperty());
        
        // Root
        TreeItem<ErrorInfo> root = new TreeItem<>();
        messageTable.setRoot(root);

        
    }

    // //////////////////////////////////////
    // Method - Action
    // //////////////////////////////////////

    @FXML
    void closeAction(ActionEvent event) {
        stage.hide();
    }

    
    // //////////////////////////////////////
    // Method
    // //////////////////////////////////////
 
    Stage getStage() {
        return stage;
    }
    
    void setStage(Stage stage) {
        this.stage = stage;
    }
 
    void addError(ErrorInfo error) {
        TreeItem<ErrorInfo> item = new TreeItem<>(error);
        messageTable.getRoot().getChildren().add(item);
    }
    
}
