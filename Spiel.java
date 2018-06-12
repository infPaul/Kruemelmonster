import java.util.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
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
    private Timer timer;
    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel()
    {
        // Instanzvariable initialisieren
        flaeche=new Zeichenflaeche();
        kekse = new ArrayList<Keks>();
        verbindungen=new ArrayList<Verbindung>();
       timer = new Timer(this);  

        //spielErstellen();
        //Verbindungen();
    }

    public Zeichenflaeche getFlaeche()
    {
        return flaeche;
    }

    public void keksEinfuegen(int x,int y,int radius,Color farbe)
    {
        Keks keks=new Keks(x,y,radius,farbe);
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
 
        keksEinfuegen(40,40,30,Color.RED);
        keksEinfuegen(80,150,30,Color.GREY);
        keksEinfuegen(250,120,30,Color.GREY);
        keksEinfuegen(170,300,30,Color.GREY);
        keksEinfuegen(350,250,30,Color.GREY);
        keksEinfuegen(300,380,30,Color.GREY);
        keksEinfuegen(390,150,30,Color.GREY);
        keksEinfuegen(470,300,30,Color.GREY);
        keksEinfuegen(550,170,30,Color.GREY);
        keksEinfuegen(600,450,30,Color.BLUE);
        
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
    
    public void start() {    
        timer.start();
    }

    public void stop()
    {
        timer.stop();
    }

    // Diese Methode wird vom Timer immer wieder aufgerufen
    public void update()
    {           
        
        
      
    }

}
