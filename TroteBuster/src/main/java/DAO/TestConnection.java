package DAO;

import javafx.application.Application;
import javafx.stage.Stage;

public class TestConnection extends Application {
    @Override
    public void start(Stage primaryStage) {
        ConnectionDAO conn = new ConnectionDAO();
        conn.connectDB();
    }
}