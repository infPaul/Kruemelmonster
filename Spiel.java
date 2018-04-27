import java.util.*;
import javafx.scene.input.MouseEvent;
/**
 * Beschreiben Sie hier die Klasse Spiel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Verbindung> verbindungen;
    private ArrayList<Keks> kekse;
    private Zeichenflaeche flaeche;
    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel()
    {
        // Instanzvariable initialisieren
        flaeche=new Zeichenflaeche();
        kekse = new ArrayList<Keks>();
        verbindungen=new ArrayList<Verbindung>();
        spielErstellen();
        Verbindungen();
    }

    public Zeichenflaeche getFlaeche()
    {
        return flaeche;
    }

    public void keksEinfuegen(int x,int y,int radius)
    {
        Keks keks=new Keks(x,y,radius);
        kekse.add(keks);
        flaeche.hinzufuegen(keks.getKreis());
    }

    public void verbindungEinfuegen(int ax,int ay,int ex,int ey)
    {
        Verbindung v=new Verbindung(ax,ay,ex,ey);
        verbindungen.add(v);
        flaeche.hinzufuegen(v.getLine());
    }

    public void spielErstellen()
    {
        keksEinfuegen(40,40,30);
        keksEinfuegen(80,150,30);
        keksEinfuegen(250,120,30);
        keksEinfuegen(170,300,30);
        keksEinfuegen(350,250,30);
        keksEinfuegen(300,380,30);
        keksEinfuegen(390,150,30);
        keksEinfuegen(470,300,30);
        keksEinfuegen(550,170,30);
        keksEinfuegen(600,450,30);
        
    }
    

    public void Verbindungen()
    {
        int ex;
        int ey;
        int ax;
        int ay;
        for(int i=0;i<kekse.size();i++)
        {
            Keks k = kekse.get(i);
            ax=k.getX();
            ay=k.getY();
            for(int j=0;j<kekse.size();j++)
            {
                if (i != j)
                {
                    ex=kekse.get(j).getX();
                    ey=kekse.get(j).getY();
                    if(k.siehtOrt(ex,ey))
                    {
                        verbindungEinfuegen(ax,ay,ex,ey);
                    }
                }
            }
        }
    }
}
