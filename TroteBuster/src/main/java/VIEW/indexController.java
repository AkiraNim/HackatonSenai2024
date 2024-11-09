package VIEW;
  
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class indexController {
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="hello"
    private Label hello; // Value injected by FXMLLoader

    @FXML // fx:id="home"
    private Button home; // Value injected by FXMLLoader

    @FXML // fx:id="logoff"
    private Button logoff; // Value injected by FXMLLoader

    @FXML // fx:id="occurence"
    private Button occurence; // Value injected by FXMLLoader

    @FXML // fx:id="query"
    private Button query; // Value injected by FXMLLoader

    @FXML // fx:id="register"
    private Button register; // Value injected by FXMLLoader

    @FXML // fx:id="report"
    private Button report; // Value injected by FXMLLoader

    @FXML // fx:id="tblRecents"
    private TableView<?> tblRecents; // Value injected by FXMLLoader

    @FXML
    void goToHome(ActionEvent event) {

    }

    @FXML
    void goToOccurence(ActionEvent event) {

    }

    @FXML
    void goToQuery(ActionEvent event) {

    }

    @FXML
    void goToRegister(ActionEvent event) {

    }

    @FXML
    void goToReport(ActionEvent event) {

    }

    @FXML
    void quit(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert hello != null : "fx:id=\"hello\" was not injected: check your FXML file 'Untitled'.";
        assert home != null : "fx:id=\"home\" was not injected: check your FXML file 'Untitled'.";
        assert logoff != null : "fx:id=\"logoff\" was not injected: check your FXML file 'Untitled'.";
        assert occurence != null : "fx:id=\"occurence\" was not injected: check your FXML file 'Untitled'.";
        assert query != null : "fx:id=\"query\" was not injected: check your FXML file 'Untitled'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'Untitled'.";
        assert report != null : "fx:id=\"report\" was not injected: check your FXML file 'Untitled'.";
        assert tblRecents != null : "fx:id=\"tblRecents\" was not injected: check your FXML file 'Untitled'.";

    }

}

