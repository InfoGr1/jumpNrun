import ea.*;

public class Spiel extends Game implements Ticker
{
    private Bild Hintergrundbild1;
    private Bild Hintergrundbild2;
    private Bild Hintergrundbild3;
    private Figur figur;
    private Figur Boden1;
    private Figur Boden2;
    private Figur Boden3;
    private Figur Boden4;
    private Figur Boden5;
    private Figur Boden6;
    
   public Spiel(){
   super(1080, 720, "Fenstertitel");
  
   Hintergrundbild1 = new Bild(0, 0, "BackgroundSpace1.png");
   Hintergrundbild2 = new Bild(800, 0, "BackgroundSpace1.png");
   Hintergrundbild3 = new Bild(1600, 0, "BackgroundSpace1.png");
   
   figur = new Figur(20, 20, "Figur1.eaf");
   figur.aktivMachen();
   figur.faktorSetzen(4);
   
   Boden1 = new Figur(0, 500, "Stone90x5.eaf");
   Boden1.passivMachen();
   Boden1.faktorSetzen(3);
   
   Boden2 = new Figur(90, 500, "Stone90x5.eaf");
   Boden2.passivMachen();
   Boden2.faktorSetzen(3);
   
   Boden3 = new Figur(180, 500, "Stone90x5.eaf");
   Boden3.passivMachen();
   Boden3.faktorSetzen(3);
   
   Boden4 = new Figur(270, 500, "Stone90x5.eaf");
   Boden4.passivMachen();
   Boden4.faktorSetzen(3);
   
   Boden5 = new Figur(0, 500, "Stone90x5.eaf");
   Boden5.passivMachen();
   Boden5.faktorSetzen(3);
   
   Boden6 = new Figur(0, 500, "Stone90x5.eaf");
   Boden6.passivMachen();
   Boden6.faktorSetzen(3);
   
   wurzel.add(Hintergrundbild1, Hintergrundbild2, Hintergrundbild3, figur,
   Boden1, Boden2, Boden3, Boden4, Boden5, Boden6);
   manager.anmelden(this, 50);
   
}

public void tick(){
  Hintergrundbild1.verschieben(-0.5f, 0);
  Hintergrundbild2.verschieben(-0.5f, 0);
  Hintergrundbild3.verschieben(-0.5f, 0);
}

public void tasteReagieren(int tastencode) {
   
    switch(tastencode){
        
        case Taste.OBEN: figur.sprung(4); break;
        case Taste.UNTEN: figur.verschieben(+0, +10); break;
        case Taste.RECHTS: figur.verschieben(+10, +0); break;
        case Taste.LINKS: figur.verschieben(-10, +0); break;
    }
}
}
