
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: Hier sollen mehrere vorgegebene Figuren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500, 350); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
        // Zeichne dir zunächst eine Skizze auf ein Blatt Papier und überlege dir, welche
        // Werte du den Methoden rect(x,y,b,h) und ellipse(x,y,b,h) übergeben musst, 
        // dass Bild C gezeichnet wird
        rect(10, 10, 100, 100);
        ellipse(60, 60, 80, 80);
        ellipse(60, 60, 60, 60);
        ellipse(60, 60, 40, 40); //Oben

        ellipse(60, 170, 100, 100);
        rect(30, 140, 60, 60);
        rect(40, 150, 40, 40);
        rect(50, 160, 20, 20); //Unten
        // ***** hier kommen deine Anweisungen hin ************

        // ***** Ende der eigenen Anweisungen **********
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    public void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************
        ellipse(60, 60, 100, 100);
        rect(10, 110, 100, 100);
        triangle(60, 210, 10, 310, 110, 310);
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
        zeichneBildA(); // Aufruf deiner Methode
        // zeichneBildC();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
