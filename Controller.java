

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.event.ActionEvent;
public class Controller
{

    private Spiel spiel; 
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button lauft;

    @FXML
    private Pane Bildschirm;

    @FXML
    private TextField score;

    @FXML
    private TextField kruemel;

    @FXML
    private Button statistik;

    @FXML
    private TextField erobert;
    private String zustand;

    public Controller()
    {

    }

    @FXML
    void initialize() 
    {
        spiel = new Spiel();
        Bildschirm.getChildren().add(spiel.getFlaeche());

        spiel.spielErstellen();
        spiel.Verbindungen();
        spiel.kekseZeichnen();
        zustand = "Pause";

    }

    public void start() {

        spiel.start();
    }
    
    public void stop()
    {
        spiel.stop();
    }

    public void update()
    {
        spiel.update();
    }

    @FXML
    void lauft(ActionEvent event)
    {

        if (zustand == "Laufend")
        {
            zustand = "Pause";
            stop();
            System.out.println("Zustand : PAUSE");
        }
        else {
            zustand = "Laufend";
            start();
            System.out.println("Zustand : LAEUFT");
        }

       
    }

    @FXML
    void statistik(ActionEvent event)
    {
        System.out.println("!STATISTIK!");
    }

     
}