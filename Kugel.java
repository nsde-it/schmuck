import basis.*;
public class Kugel {
    // Zustandvariable
    private int x,y;
    private int fadenlaenge;
    private int radius;
    
    //Bezugsobjekt
    private Stift stift;
    
    /** Konstruktor */
    public Kugel() {
        stift = new Stift();
        stift.bewegeBis(Hilfe.zufall(50, 500), Hilfe.zufall());
    }

    public void zeige() {
        stift.normal();
        stift.setzeFuellMuster(Muster.GEFUELLT);
        stift.kreis(x,y,radius);
        stift.bewegeUm(50);
    }

    public void loesche() {
       stift.setzeFuellMuster(Muster.GEFUELLT);
       stift.radiere();
       stift.kreis(x,y,radius);          
    }

    public void setzePosition(int pX, int pY) {
        this.loesche(); 
        this.x = pX; this.y = pY;
        this.zeige();
    }

    public void setzeFadenlaenge(int pFl) {
        this.loesche();
        this.fadenlaenge = pFl;
        this.zeige();
    }

    public void setzeRadius(int pRadius) {
        this.loesche();
        this.radius = pRadius;
        this.zeige();
    }
    
    public int gibX() {
        return this.x;
    }
    
    public int gibY() {
        return this.Y;
    }
    
    public int gibFadenlaenge() {
        return this.fadenlaenge;
    }
}
