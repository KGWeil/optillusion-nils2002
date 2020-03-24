
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: Die FigurC aus der vorherigen Aufgabe soll mit einer Zählschleife implementiert werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class FigurC_mitSchleife extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,350); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
        // ***** hier kommen deine Anweisungen hin ************
        rect(10, 10, 100, 100);
        for (int i=0; i<3;i++)
        {
            ellipse(60, 60, 80-i*20, 80-i*20);  
        }
        //oben
        ellipse(60, 170, 100, 100);
        for (int n=0; n<3;n++)
        {
            rect(30+n*10, 140+n*10, 60-n*20, 60-n*20);
        }
        //unten
        // ***** Ende der eigenen Anweisungen **********
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {FigurC_mitSchleife.class.getName() });
    }

}
