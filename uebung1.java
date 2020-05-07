
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse uebung1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class uebung1 extends PApplet
{   
    int a=0;
    int b=15;
    int c=0;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    public void viereck()
    {
        //quad(0,0,5*s,3*s,5*s,9*s,0,6*s);
        for (int i=0; i<20;i++)
        {
            for (int j=0; j<8;j++)
            {
                quad(i*25,c*a+j*25,25+i*25,c*b+j*25,25+i*25,c*b+30+j*25,i*25,c*a+30+j*25);
                if(a==0){a=15;b=0;}  else{a=0;b=15;}
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
        viereck(); 
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
        PApplet.main(new String[] {uebung1.class.getName() });
    }

}
