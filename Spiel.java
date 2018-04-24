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
        //spielErstellen();
        //Verbindungen();
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
        Random rand=new Random();
        int maxX=650;
        int minX=50;
        int maxY=450;
        int minY=50;
        for(int i=0;i<10;i++)
        {
            int x=rand.nextInt((maxX-minX)+1)+minX;
            int y=rand.nextInt((maxY-minY)+1)+minY;
            keksEinfuegen(x,y,30);
            /*for(int m=0;m<kekse.size();m++)
            {
                Keks k = kekse.get(m);
                int x1=k.getX();
                int y1=k.getY();

                if (30*30<=((x1-x)*(x1-x)+(y1-y)*(y-y1)))
                {

                    keksEinfuegen(x,y,30);

                    
                }
                else
                {
                    //i--;
                }*/
            }

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
