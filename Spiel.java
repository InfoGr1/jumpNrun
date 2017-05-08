import ea.*;

public class Spiel extends Game implements Ticker
{
    private Rechteck r1;
    private Rechteck r2;
    private Bild b1;
    private Figur f1;
   public Spiel(){
   super(600, 600, "Fenstertitel");
   r1 = new Rechteck(20, 20, 20, 20);
   r1.farbeSetzen("rot");
   r1.aktivMachen();
   r2 = new Rechteck(0, 500, 1000, 20);
   r2.farbeSetzen("lila");
   r2.passivMachen();
   r1.schwerkraftSetzen(7);
   b1 = new Bild(0, 0, "BackgroundSpace1.png");
   f1 = new Figur(20, 20, "Figur1.eaf");
   f1.aktivMachen();
   f1.faktorSetzen(4);
   
   
   wurzel.add(r2, b1, f1);
   manager.anmelden(this, 50);
   
}

public void tick(){
  b1.verschieben(-0.5f, 0);
    
}

public void tasteReagieren(int tastencode) {
   
    switch(tastencode){
        
        case Taste.OBEN: f1.sprung(4); break;
        case Taste.UNTEN: f1.verschieben(+0, +10); break;
        case Taste.RECHTS: f1.verschieben(+10, +0); break;
        case Taste.LINKS: f1.verschieben(-10, +0); break;
    }
}
}
