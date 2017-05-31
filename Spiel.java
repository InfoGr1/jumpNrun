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
    private Figur flamme;
    private Figur Endboss;
    

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
            Boden = new Figur(i*270, 720, "Stone90x5.eaf");
            Boden.faktorSetzen(3);
            Boden.passivMachen();
            Bodenfeld[i] = Boden;
            wurzel.add(Bodenfeld[i]);
        }

        figurlaufen = new Figur(540, 100, "laufen.eaf");
        figurlaufen.aktivMachen();
        figurlaufen.faktorSetzen(4);
        cam.fokusSetzen(figurlaufen);
        
        flamme = new Figur(700, 600, "flamme10x10.eaf");
        flamme.drehenAbsolut(270);
        
        Endboss = new Figur(900, 600, "Endbosz.eaf");
        Endboss.faktorSetzen(3);
        Endboss.animationsGeschwindigkeitSetzen(1000);

        wurzel.add(figurlaufen, flamme, Endboss);
        manager.anmelden(this, 20);
    }

    public void tick(){
        if(tasteGedrueckt(3)){
            figurlaufen.verschieben(2, 0);
        }
        if(tasteGedrueckt(22)){
            figurlaufen.sprung(8);
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
