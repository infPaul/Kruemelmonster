import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
//import java.awt.Color;
import javafx.scene.image.*;
import javafx.scene.paint.ImagePattern;
import javax.swing.BorderFactory;
import java.util.*;
import javafx.scene.input.MouseEvent;

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
    private int maxKruemel;
    private int gespawnteKruemel;
    private int besitzendeKruemel;
    private ArrayList<Kruemel> kruemels;
    private Kruemel temporaerKruemel;

    public Keks(int x,int y,int radius)
    {
        reichweite=200;
        this.x =x;
        this.y =y;
        this.radius=radius;
        maxKruemel=radius/2;
        kruemels = new ArrayList<Kruemel>();
        gespawnteKruemel = 0;
        besitzendeKruemel = 0;

        // Keks als Bild:
        Image keks = new Image("cookie.png");

        // Original Kekse hier:
        kreis=new Circle(x,y,radius);
        kreis.setFill(new ImagePattern(keks));
        kreis.setStroke(Color.RED);
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
    //public boolean 
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

    public void kruemelZerstoert()
    {
        gespawnteKruemel--;
    }

    public Kruemel spawnKruemel()
    {
        if (maxKruemel > gespawnteKruemel)
        {
            Kruemel kruemel=new Kruemel(x,y,this);
            kruemels.add(kruemel);
            gespawnteKruemel++;
            besitzendeKruemel++;
            return kruemel;
        }
        else
            return null;
    }

    public Kruemel sendeKruemel()
    {
        if (besitzendeKruemel>0)
        {
            besitzendeKruemel--;
            temporaerKruemel = kruemels.get(0);
            kruemels.remove(0);
            
            return temporaerKruemel;
        }
        else
        {
            return null;
        }
    }
    
    public void empfangeKruemel(Kruemel k)
    {
        kruemels.add(k);
        besitzendeKruemel++;
    }
}
