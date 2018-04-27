import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
/**
 * Beschreiben Sie hier die Klasse App.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class App extends Application
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Spiel spiel;

    /**
     * Konstruktor für Objekte der Klasse App
     */
    public App()
    {
        // Instanzvariable initialisieren

    }

    private void init(Stage primaryStage) {
        Pane root = new Pane();
        primaryStage.setResizable(true);
        primaryStage.setScene(new Scene(root));
        // Simple red filled circle
       spiel = new Spiel();


        // Create a group to show all the circles);
        root.getChildren().add(spiel.getFlaeche());
    }



    @Override public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}
