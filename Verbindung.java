import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
/**
 * Beschreiben Sie hier die Klasse Verbindung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Verbindung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int anfangX;
    private int anfangY;
    private int endeX;
    private int endeY;
    private Line line;
    /**
     * Konstruktor für Objekte der Klasse Verbindung
     */
    public Verbindung(int ax,int ay,int ex,int ey)
    {
        // Instanzvariable initialisieren
        anfangX=ax;
        anfangY=ay;
        endeX=ex;
        endeY=ey;
        line=new Line(ax,ay,ex,ey);
        line.setFill(Color.BLACK);  
    }
    public Line getLine()
    {
        return line;
    }
    
}