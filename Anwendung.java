import basis.*; 
public class Anwendung 
{
    // Deklaration 
   private Fenster meinFenster;
   private Kugel kugel1,kugel2;    

    /**
     * Konstruktor für Objekte der Klasse DemoAnwendung
     */
    public Anwendung ()
    {
        Anwendung anwendung = new Anwendung(75);
    }
    
    public Anwendung (int pRadius)
    {
        // Objekte und Zustandsvariable
        meinFenster = new Fenster(400, 400);
        meinFenster.setzeTitel("Schmuck");
        
        kugel1 = new Kugel();
        kugel1.radius = pRadius;
        kugel1.zeige();
    }

  }
