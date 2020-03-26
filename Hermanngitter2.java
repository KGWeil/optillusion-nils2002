
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermanngitter2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter2 extends PApplet
{       
    int s=50;
    int a=14;
    int k=17;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    public void Quadrate()
    {
        fill(0);
        for (int i=0; i<7; i++)
        {
            for (int n=0; n<7; n++)
            {
                square(30+n*(a+s), 30+i*(a+s), s);
            }
        }
    }

    public void Kreise()
    {
        fill(255);
        noStroke();//keine Umrandung
        for (int e=0; e<6; e++)
        {
            for (int f=0; f<6; f++)
            {
                circle(87+f*(a+s), 87+e*(a+s), k);
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
        background(65,170,255);
        Quadrate();
        Kreise();
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
        PApplet.main(new String[] {Hermanngitter2.class.getName() });
    }

}
