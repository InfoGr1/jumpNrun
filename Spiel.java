import ea.*;
import java.util.ArrayList;

public class Spiel extends Game implements Ticker
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
        

        int z;
        for(z=0;z<6; z++){
            Hintergrundbild = new Bild(z*1080, 0, "BackgroundSpace1.png");
            Hinterfeld[z] = Hintergrundbild;
            wurzel.add(Hintergrundbild);
        }
        for(int u=0; u<6; u++){
            Hintergrundbild = new Bild(u*1080, 720, "BackgroundSpace1.png");
            Hinterfeld[z+u] = Hintergrundbild;
            wurzel.add(Hintergrundbild);
        }

        for(int i=0; i<20; i++){
            Boden = new Figur(i*270, 720, "Stone270x5.eaf");
            Boden.faktorSetzen(3);
            Boden.passivMachen();
            Bodenfeld[i] = Boden;
            wurzel.add(Bodenfeld[i]);
        }

        figurlaufen = new Figur(540, 500, "laufen.eaf");
        figurlaufen.aktivMachen();
        figurlaufen.faktorSetzen(4);
        cam.fokusSetzen(figurlaufen);
        
        Kiste1 = new Bild(660, 660, "KisteStyle60x60.png");
        Kiste1.passivMachen();

        wurzel.add(figurlaufen, Kiste1);
        manager.anmelden(this, 10);
    }
    
    public void zuruecksetzen(){
        figurlaufen.positionSetzen(540, 500);
    }

    public void tick(){
        if(tasteGedrueckt(3)){
            figurlaufen.verschieben(2, 0);
        }
        if(tasteGedrueckt(22)){
            figurlaufen.sprung(8);
        }
        if(tasteGedrueckt(0)){
            figurlaufen.verschieben(-2, 0);
        }
        if(figurlaufen.getY()>2000){
            zuruecksetzen();
        }
        if(figurlaufen.schneidet(Kiste1)){
            zuruecksetzen();
        }
    }

    public void tasteReagieren(int tastencode){
       
    }
    
    
}
