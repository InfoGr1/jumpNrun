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
    private Bild Kiste9;
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
    private Bild Treppe11;
    private Bild Treppe12;
    private Bild Treppe13;
    private Bild Treppe14;
    private Bild Treppe15;
    private Bild Treppe16;
    private Bild Treppe17;
    private Bild Treppe18;
    private Bild Treppe19;
    private Bild Treppe20;
    private Bild Treppe21;
    private Figur Boden1;
    private Figur Boden2;

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

        wurzel.entfernen(Bodenfeld[6]);
        Bodenfeld[6].neutralMachen();
        wurzel.entfernen(Bodenfeld[8]);
        Bodenfeld[8].neutralMachen();

        Kiste1 = new Hindernisse(660, 660, "KisteStyle60x60.png");
        Kiste1.neutralMachen();
        Kiste2 = new Hindernisse(720, 600, "KisteStyle60x60.png");
        Kiste2.neutralMachen();
        Kiste3 = new Hindernisse(780, 660, "KisteStyle60x60.png");
        Kiste3.neutralMachen();
        Kiste4 = new Hindernisse(720, 660, "KisteStyle60x60.png");
        Kiste4.neutralMachen();
        Kiste5 = new Hindernisse(1620, 660, "KisteStyle60x60.png");
        Kiste5.neutralMachen();
        Kiste6 = new Hindernisse(1725, 600, "KisteStyle60x60.png");
        Kiste6.neutralMachen();
        Kiste7 = new Hindernisse(1725, 660, "KisteStyle60x60.png");
        Kiste7.neutralMachen();
        Kiste8 = new Hindernisse(1830, 660, "KisteStyle60x60.png");
        Kiste8.neutralMachen();
        Kiste9 = new Hindernisse(2150, 660, "KisteStyle60x60.png");
        Kiste9.neutralMachen();
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
        Treppe11 = new Hindernisse(2310, 680, "Treppenstufe50x40.png");
        Treppe12 = new Hindernisse(2400, 680, "Treppenstufe50x40.png");
        Treppe13 = new Hindernisse(2440, 680, "Treppenstufe50x40.png");
        Treppe14 = new Hindernisse(2440, 640, "Treppenstufe50x40.png");
        Treppe15 = new Hindernisse(2480, 680, "Treppenstufe50x40.png");
        Treppe16 = new Hindernisse(2480, 640, "Treppenstufe50x40.png");
        Treppe17 = new Hindernisse(2480, 600, "Treppenstufe50x40.png");
        Treppe18 = new Hindernisse(2520, 680, "Treppenstufe50x40.png");
        Treppe19 = new Hindernisse(2520, 640, "Treppenstufe50x40.png");
        Treppe20 = new Hindernisse(2520, 600, "Treppenstufe50x40.png");
        Treppe21 = new Hindernisse(2520, 560, "Treppenstufe50x40.png");

        Boden1 = new Figur(1940, 645, "Stone270x5.eaf");
        Boden1.faktorSetzen(3);
        Boden1.passivMachen();
        Boden2 = new Figur(2120, 720, "Stone30x5.eaf");
        Boden2.faktorSetzen(3);
        Boden2.passivMachen();

        figurlaufen = new Figur(540, 500, "laufen.eaf");
        figurlaufen.aktivMachen();
        figurlaufen.faktorSetzen(4);
        cam.fokusSetzen(figurlaufen);

        wurzel.add(figurlaufen, Kiste1, Kiste2, 
            Kiste3, Kiste4, Kiste5, Kiste6, Kiste7, Kiste8, Kiste9, 
            Treppe1, Treppe2, Treppe3, Treppe4, Treppe5, Treppe6, Treppe7, 
            Treppe8, Treppe9, Treppe10, Treppe11, Treppe12, Treppe13, Treppe14, 
            Treppe15, Treppe16, Treppe17, Treppe18, Treppe19, Treppe20, Treppe21, 
            Boden1, Boden2);
        manager.anmelden(this, 10);
    }

    public void zuruecksetzen(){
        figurlaufen.positionSetzen(540, 500);
    }

    public void tick(){
        if(figurlaufen.schneidet(Kiste1)||figurlaufen.schneidet(Kiste2)||figurlaufen.schneidet(Kiste3)
        ||figurlaufen.schneidet(Kiste5)||figurlaufen.schneidet(Kiste6)||figurlaufen.schneidet(Kiste7)||
        figurlaufen.schneidet(Kiste8)||figurlaufen.schneidet(Kiste9)){
            halt = true;

        }else{
            halt = false;

        }
        if(tasteGedrueckt(3)&&halt==false){
            figurlaufen.verschieben(2, 0);
        }
        if(tasteGedrueckt(22)){
           
                Kiste1.passivMachen();
                Kiste2.passivMachen();
                Kiste3.passivMachen();
                Kiste5.passivMachen();
                Kiste6.passivMachen();
                Kiste7.passivMachen();
                Kiste8.passivMachen();
                Kiste9.passivMachen();
                figurlaufen.sprung(8);
           
            }

        
        if(tasteGedrueckt(0)&&halt==false){
            figurlaufen.verschieben(-2, 0);
        }
        if(figurlaufen.getY()>2000){
            zuruecksetzen();
        }
        
        boolean flag= false;
        for(int p=0; p<20; p++){
            if(figurlaufen.stehtAuf(Bodenfeld[p])){
                flag = true;
            }
        }
        
        if(flag==true){
            Kiste1.neutralMachen();
            Kiste2.neutralMachen();
            Kiste3.neutralMachen();
            Kiste5.neutralMachen();
            Kiste6.neutralMachen();
            Kiste7.neutralMachen();
            Kiste8.neutralMachen();
            Kiste9.neutralMachen();
            
        }

    }

    public void tasteReagieren(int tastencode){
    }

}
