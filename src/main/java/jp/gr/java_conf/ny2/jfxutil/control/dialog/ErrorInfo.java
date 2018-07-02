package jp.gr.java_conf.ny2.jfxutil.control.dialog;

import java.time.LocalDateTime;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

class ErrorInfo {

    private ObjectProperty<LocalDateTime> dateTime = new SimpleObjectProperty<>(LocalDateTime.now());
    private StringProperty sourceScreen = new SimpleStringProperty();
    private StringProperty messageHeader = new SimpleStringProperty();
    private StringProperty messageContent = new SimpleStringProperty();

    public final ObjectProperty<LocalDateTime> dateTimeProperty() {
        return this.dateTime;
    }

    public final LocalDateTime getDateTime() {
        return this.dateTimeProperty().get();
    }

    public final void setDateTime(final LocalDateTime dateTime) {
        this.dateTimeProperty().set(dateTime);
    }

    public final StringProperty sourceScreenProperty() {
        return this.sourceScreen;
    }

    public final String getSourceScreen() {
        return this.sourceScreenProperty().get();
    }

    public final void setSourceScreen(final String sourceScreen) {
        this.sourceScreenProperty().set(sourceScreen);
    }

    public final StringProperty messageHeaderProperty() {
        return this.messageHeader;
    }

    public final String getMessageHeader() {
        return this.messageHeaderProperty().get();
    }

    public final void setMessageHeader(final String messageHeader) {
        this.messageHeaderProperty().set(messageHeader);
    }

    public final StringProperty messageContentProperty() {
        return this.messageContent;
    }

    public final String getMessageContent() {
        return this.messageContentProperty().get();
    }

    public final void setMessageContent(final String messageContent) {
        this.messageContentProperty().set(messageContent);
    }

}
