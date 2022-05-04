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
        Anwendung anwendung = new Anwendung(25, 50);
    }
    
    public Anwendung (int pRadius, int pFadenlaenge)
    {
        // Objekte und Zustandsvariable
        meinFenster = new Fenster(400, 400);
        meinFenster.setzeTitel("Schmuck");
        
        kugel1 = new Kugel(100, 200);
        kugel1.setzeRadius(pRadius);
        kugel1.setzeFadenlaenge(pFadenlaenge);
        kugel1.zeige();
        
        kugel2 = new Kugel(250, 200);
        kugel2.setzeRadius(pRadius);
        kugel2.setzeFadenlaenge(pFadenlaenge);
        kugel2.zeige();
    }
  }
