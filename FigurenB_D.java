
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse FigurenB_D.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FigurenB_D extends PApplet
{   
    int j=10;
    int m=20;
    
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    public void zeichneQuadrate()
    {
        for (int i=0; i<j; i++)
        {
            rect(10+i*25, 10, 25, 25);
        }
    }

    public void zeichneKreise()
    {
        for (int n=0; n<m; n++)
        {
            ellipse(100, 100, 200-10*n, 200-10*n);
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
        zeichneKreise(); //zeichneQuadrate()
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
        PApplet.main(new String[] {FigurenB_D.class.getName() });
    }

}
