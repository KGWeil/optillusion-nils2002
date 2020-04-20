
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2 extends PApplet
{   
    int s=50;//Seitenlänge Rahmen
    int a=25;//Seitenabstand

    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    public void zeichneQuadrate(int x, int y, boolean gruen)
    {
        noStroke();
        if(gruen==true){fill(40,180,40);} 
        else{fill(255);}
        square(x,y,s);
        if(gruen==true){fill(255);} 
        else{fill(40,180,40);}
        square(x+5,y+5,s-10);
    }

    public void zeichneAlleQuadrate(boolean farbe)
    {
        for (int j=0; j<9; j++)
        {
            for (int i=0; i<9; i++)
            {
                zeichneQuadrate(a+i*s,a+j*s,farbe);
                if(farbe==true) {farbe=!farbe;}
                else{farbe=true;}
            }
        }
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        zeichneAlleQuadrate(true);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen2.class.getName() });
    }

}
