import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
//import java.awt.Color;
import javafx.scene.image.*;
import javafx.scene.paint.ImagePattern;
import javax.swing.BorderFactory;

/**
 * Beschreiben Sie hier die Klasse Keks.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Keks 
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private int y;
    private int radius;
    private int durchmesser;
    private String farbe;
    private int reichweite;
    private Circle kreis;
    private Verbindung verb;
    /**
     * Konstruktor für Objekte der Klasse Keks
     */
    public Keks(int x,int y,int radius,Color farbe)
    {
        reichweite=200;
        this.x =x;
        this.y =y;
        this.radius=radius;
        durchmesser=radius*2;
        
        // Keks als Bild:
        Image keks = new Image("cookie.png");

        // Original Kekse hier:
        kreis=new Circle(x,y,radius);
        kreis.setFill(new ImagePattern(keks));
        kreis.setStroke(farbe); 
        kreis.setStrokeWidth(11);
        kreis.setOnMouseClicked(e -> 
            {
                kreis.setStroke(Color.BLUE);
                kreis.setCenterX(200);
            }
        );
    }

    
    public Circle getKreis()
    {
        return kreis;
    }
     public boolean siehtOrt(int x,int y)
    {
        if(reichweite*reichweite<=((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y)))
        {
            return false;
        }
        else
            return true;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    
    
}
