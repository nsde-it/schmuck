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
        this.setzePosition(Hilfe.zufall(50, 350), Hilfe.zufall(50, 350));
    }

    public void zeige() {
        stift.normal();
        stift.bewegeBis(this.x, this.y);
        stift.dreheBis(90);
        stift.runter();
        stift.bewegeUm(this.fadenlaenge);
        stift.hoch();
        stift.setzeFuellMuster(Muster.GEFUELLT);
        stift.kreis(this.x, this.y, this.radius);
    }

    public void loesche() {
       stift.setzeFuellMuster(Muster.GEFUELLT);
       stift.radiere();
       stift.kreis(this.x, this.y, this.radius);
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
        return this.y;
    }
    
    public int gibFadenlaenge() {
        return this.fadenlaenge;
    }
}
