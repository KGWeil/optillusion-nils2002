
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    int s=40;//Seitenlänge eines Quadrates
    int[] abstaende = {10, 20, 30, 20, 10, 20, 30, 20, 10};//Reihung für den Anfangsabstand
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    public void parallelen()
    {
        stroke(130);//Randfarbe grau
        for (int a=0; a<10; a++)
        {
            line(0, 5+a*s, 640, 5+a*s);
        }
    }

    public void zeichneQuadrate()
    {
        fill(0);//Farbe innen schwarz
        for (int b=0; b<8; b++)
        {
            square(10+b*s*2, 5, s);
        }
    }

    public void zeichneAlleQuadrate()
    {
        fill(0);
        for (int c=0; c<9; c++)
        {
            for (int b=0; b<8; b++)
            {
                square(abstaende[c]+b*s*2, 5+c*s, s);
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
        background(255);//Hintergrund weiß
        zeichneAlleQuadrate();
        parallelen();//Aufruf der Methode 
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
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
