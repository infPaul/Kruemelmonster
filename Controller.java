
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller{
    

     private Spiel spiel; 
     
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button start;

    @FXML
    private Pane Bildschirm;

    @FXML
    private TextField score;

    @FXML
    private TextField krümel;

    @FXML
    private Button statistik;

    @FXML
    private TextField erobert;

    
    public Controller()
    {
      
    }
    
    @FXML
    void initialize() {
          spiel = new Spiel();
    Bildschirm.getChildren().add(spiel.getFlaeche());
    spiel.spielErstellen();
    spiel.Verbindungen();
    }
}