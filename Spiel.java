import ea.*;
import java.util.ArrayList;

public class Spiel extends Game implements Ticker
{
    private Bild Hintergrundbild1;
    private Bild Hintergrundbild2;
    private Bild Hintergrundbild3;
    private Figur figurlaufen;
    private float rechts;
    private Figur Boden;
    private Bild Kiste1;
    private Bild Kiste2;
    private Figur[] Bodenfeld;
    
   public Spiel(){
   super(1080, 720, "Fenstertitel");
   rechts = 0;
  
   Hintergrundbild1 = new Bild(0, 0, "BackgroundSpace1.png");
   Hintergrundbild2 = new Bild(1080, 0, "BackgroundSpace1.png");
   Hintergrundbild3 = new Bild(2160, 0, "BackgroundSpace1.png");
   
   figurlaufen = new Figur(250, 20, "laufen.eaf");
   figurlaufen.aktivMachen();
   figurlaufen.faktorSetzen(4);
   
   for(int i=0; i<10; i++){
       Boden = new Boden(i*90, 500, "Stone90x5.eaf");
    }
   
   
   Kiste1 = new Bild(500, 470, 200, "KisteStyle20x20.png");
   Kiste1.passivMachen();
   
   Kiste2 = new Bild(500, 440, 200, "KisteStyle20x20.png");
   Kiste2.passivMachen();
   
   wurzel.add(Hintergrundbild1, Hintergrundbild2, Hintergrundbild3, figurlaufen,
   Boden, Kiste1, Kiste2);
   manager.anmelden(this, 10);
   
}

public void tick(){
  rechts = rechts + 0.5f;
  Hintergrundbild1.verschieben(-0.5f, 0);
  Hintergrundbild2.verschieben(-0.5f, 0);
  Hintergrundbild3.verschieben(-0.5f, 0);
  Kiste1.verschieben(-0.5f, 0);
  Kiste2.verschieben(-0.5f, 0);
  if(figurlaufen.schneidet(Kiste1)){
      zuruecksetzen();
    }
  if(figurlaufen.schneidet(Kiste2)){
      zuruecksetzen();
    }
}

public void zuruecksetzen(){
  Hintergrundbild1.verschieben(rechts, 0);
  Hintergrundbild2.verschieben(rechts, 0);
  Hintergrundbild3.verschieben(rechts, 0);
  Kiste1.verschieben(rechts, 0);
  Kiste2.verschieben(rechts, 0);
  rechts = 0;
}



public void tasteReagieren(int tastencode){
    switch(tastencode){
        
        case Taste.OBEN: figurlaufen.sprung(8); break;
        case Taste.UNTEN: figurlaufen.verschieben(+0, +10); break;
        case Taste.RECHTS: figurlaufen.verschieben(+10, +0); break;
        case Taste.LINKS: figurlaufen.verschieben(-10, +0); break;
    }
}
}
