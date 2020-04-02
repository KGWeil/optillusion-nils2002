import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{       
    int s=80;
    int b=50;
    int a=5;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(900,420);
    }        

    /**
     * Zeichnet ein Quadrat der optischen Illusion
     * @param    x    x-Koordinate
     * @param    y    y-Koordinate
     * @param    farbe    Füllfarbe des Quadrats
     * @param    links     Falls links true ist: Kreise links; falls links false ist: Kreise rechts
     */
    public void zeichneQuadrat( int x, int y, int farbe, boolean links )
    {
        fill(farbe); // Füllfarbe
        noStroke(); // Rand entfernt
        square(x, y, s); // Quadrat
        int d=s/4;
        ellipseMode(CORNER); 

        // Farbauswahl Kreise
        if (farbe==255) { // Quadrat ist weiß
            fill(0); // Füllfarbe schwarz wird gewählt
        }
        else { // Quadrat ist nicht weiß (schwarz)
            fill(255); // Füllfarbe weiß wird gewählt
        }

        // Zeichnen der beiden kleinen Kreise
        if (links==true) {
            for (int n=0; n<2; n++)
            {
                ellipse(x+a+b, y+a+n*b, d, d);  // links oben und unten
            }
        }
        else {
            for (int n=0; n<2; n++)
            {
                ellipse(x+a, y+a+n*b, d, d); // rechts oben unten
            }
        }
    }

    public void alleQuadrate()
    {
        int aktuellefarbe=255;
        boolean aktuelllinks=false;
        for (int i=0; i<4; i++)
        {  
            for (int k=0; k<8; k++)
            {
                zeichneQuadrat(b+k*s, b+i*s, aktuellefarbe, aktuelllinks );
                if (aktuellefarbe==255) 
                {
                    aktuellefarbe=0;
                }
                else 
                {
                    aktuellefarbe=255;
                }
            }
            if (aktuellefarbe==255) 
            {
                aktuellefarbe=0;
            }
            else 
            {
                aktuellefarbe=255;
            }
            if (aktuelllinks==true)
            {
                aktuelllinks=false;
            }
            else 
            {
                aktuelllinks=true;
            }
        }
    }   

    public void Linien()
    {
        stroke(0,255,0);
        strokeWeight(4);
        for (int j=1; j<4; j++)
        {
            line(((b/5)*4),b+j*s,2*b+8*s-((b/5)*4),b+j*s);
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
        background(255, 165, 0);
        alleQuadrate();
        Linien();
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
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
