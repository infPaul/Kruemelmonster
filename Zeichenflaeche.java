

import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.text.*;
/**
 * Die Klasse Zeichenflaeche
 */
public class Zeichenflaeche extends Pane
{
    // Attribute

    // Konstruktor
    public Zeichenflaeche()
    {
        setStyle("-fx-background-color: white;");
        setPrefSize(700,500);
    }

    // Methoden
    public void hinzufuegen(Node node)
    {
        getChildren().add(node);
    }

    public void loeschen(Node node)
    {
        getChildren().remove(node);
    }

    
}