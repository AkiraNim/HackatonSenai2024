package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ConnectionDAO {
    public Connection connectDB(){
        Connection conn = null;

        try {
                String url = "jdbc:mysql://10.102.50.38:3306/trotebuster?user=admins_projeto&password=GarotosdeP";

                conn = DriverManager.getConnection(url);
                showAlert(AlertType.INFORMATION, "Conexão estabelecida");
        } catch (SQLException e) {
                showAlert(AlertType.ERROR, e.getMessage());
        }
        return conn;	
    }
    
     private void showAlert(AlertType alertType, String message) {
        Alert alert = new Alert(alertType);
        alert.setContentText(message);
        alert.showAndWait();
    }
     
    public static void main(String[] args) {
        javafx.application.Application.launch(TestConnection.class);
    }
}
