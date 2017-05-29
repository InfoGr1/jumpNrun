import ea.*;
import java.util.ArrayList;

public class Spiel extends Game
{
    private Bild Hintergrundbild;
   
    private Figur figurlaufen;
    private float rechts;
    private Figur Boden;
    private Bild Kiste1;
    private Bild Kiste2;
    private Bild[] Hinterfeld;
    private Figur[] Bodenfeld;
    
   public Spiel(){
   super(1080, 720, "Fenstertitel");
   rechts = 0;
   Bodenfeld = new Figur[50];
   Hinterfeld = new Bild[50];
  
   
   
   figurlaufen = new Figur(540, 450, "laufen.eaf");
   figurlaufen.aktivMachen();
   figurlaufen.faktorSetzen(4);
   cam.fokusSetzen(figurlaufen);
   
   
   
   wurzel.add(figurlaufen);
   for(int u=0; u<1; u++){
       for(int z=0; z<6; z++){
       Hintergrundbild = new Bild(z*1080, u*720, "BackgroundSpace1");
       Hinterfeld[
       
    }
    }
   
   for(int i=0; i<5; i++){
       Boden = new Figur(i*270, 720, "Stone90x5.eaf");
       Boden.faktorSetzen(3);
       Boden.passivMachen();
       Bodenfeld[i] = Boden;
       wurzel.add(Bodenfeld[i]);
    }
    
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
