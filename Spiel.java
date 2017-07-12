import ea.*;
import java.util.ArrayList;

public class Spiel extends Game implements Ticker
{
    private Bild Hintergrundbild;
    public Figur figurlaufen;
    private Figur Boden;
    private boolean halt;
    private Bild[] Hinterfeld;
    private Figur[] Bodenfeld;

    private Bild Kiste1;
    private Bild Kiste2;
    private Bild Kiste3;
    private Bild Kiste4;
    private Bild Kiste5;
    private Bild Kiste6;
    private Bild Kiste7;
    private Bild Kiste8;
    private Bild Treppe1;
    private Bild Treppe2;
    private Bild Treppe3;
    private Bild Treppe4;
    private Bild Treppe5;
    private Bild Treppe6;
    private Bild Treppe7;
    private Bild Treppe8;
    private Bild Treppe9;
    private Bild Treppe10;

    public Spiel(){
        super(1080, 720, "Fenstertitel");
        halt = false;
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

        Kiste1 = new Hindernisse(660, 660, "KisteStyle60x60.png");
        Kiste2 = new Hindernisse(720, 600, "KisteStyle60x60.png");
        Kiste3 = new Hindernisse(780, 660, "KisteStyle60x60.png");
        Kiste4 = new Hindernisse(720, 660, "KisteStyle60x60.png");
        Treppe1 = new Hindernisse(1180, 680, "Treppenstufe50x40.png");
        Treppe2 = new Hindernisse(1230, 680, "Treppenstufe50x40.png");
        Treppe3 = new Hindernisse(1230, 640, "Treppenstufe50x40.png");
        Treppe4 = new Hindernisse(1280, 680, "Treppenstufe50x40.png");
        Treppe5 = new Hindernisse(1280, 640, "Treppenstufe50x40.png");
        Treppe6 = new Hindernisse(1280, 600, "Treppenstufe50x40.png");
        Treppe7 = new Hindernisse(1330, 680, "Treppenstufe50x40.png");
        Treppe8 = new Hindernisse(1330, 640, "Treppenstufe50x40.png");
        Treppe9 = new Hindernisse(1330, 600, "Treppenstufe50x40.png");
        Treppe10 = new Hindernisse(1380, 680, "Treppenstufe50x40.png");

        figurlaufen = new Figur(540, 500, "laufen.eaf");
        figurlaufen.aktivMachen();
        figurlaufen.faktorSetzen(4);
        cam.fokusSetzen(figurlaufen);

        wurzel.add(figurlaufen, Kiste1, Kiste2, 
        Kiste3, Kiste4, Treppe1, Treppe2, Treppe3, Treppe4, 
        Treppe5, Treppe6, Treppe7, Treppe8, Treppe9, Treppe10);
        manager.anmelden(this, 10);
    }

    public void zuruecksetzen(){
        figurlaufen.positionSetzen(540, 500);
    }

    public void tick(){
        if(figurlaufen.schneidet(Kiste1)||figurlaufen.schneidet(Kiste2)||figurlaufen.schneidet(Kiste3)
        ||figurlaufen.schneidet(Treppe1)||figurlaufen.schneidet(Treppe3)||figurlaufen.schneidet(Treppe6)
        ||figurlaufen.schneidet(Treppe8)||figurlaufen.schneidet(Treppe9)||figurlaufen.schneidet(Treppe10)){
            halt = true;
            
        }else{
            halt = false;
            
        }
        if(tasteGedrueckt(3)&&halt==false){
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
        
    }

    public void tasteReagieren(int tastencode){
    }

}
