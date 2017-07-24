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
    private Bild Kiste10;
    private Bild Kiste11;
    private Bild Kiste12;
    private Bild Kiste13;
    private Bild Kiste14;
    private Bild Kiste15;
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
    private Bild Kiste16;
    private Bild Kiste17;
    private Bild Kiste18;
    private Bild Kiste19;
    private Bild Kiste20;
    private Bild Kiste21;
    private Bild Kiste22;
    private Bild Kiste23;
    private Bild Kiste24;
    private Bild Kiste25;
    private Bild Kiste26;
    private Bild Kiste27;
    private Bild Kiste28;
    private Bild Kiste29;
    private Bild Kiste30;
    private Bild Kiste31;
    private Bild Kiste32;
    private Bild Kiste33;
    private Bild Kiste34;
    private Bild Kiste35;
    private Bild Kiste36;
    private Bild Kiste37;
    private Bild Kiste38;
    private Bild Kiste39;
    private Bild Kiste40;
    private Bild Rakete;

    public Figur flamme1;
    public Figur flamme2;
    public Figur Endboss;
    public Figur figur2;
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
        wurzel.entfernen(Bodenfeld[9]);
        Bodenfeld[9].neutralMachen();
        wurzel.entfernen(Bodenfeld[10]);
        Bodenfeld[10].neutralMachen();
        wurzel.entfernen(Bodenfeld[11]);
        Bodenfeld[11].neutralMachen();
        wurzel.entfernen(Bodenfeld[12]);
        Bodenfeld[12].neutralMachen();

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
        Kiste10 = new Hindernisse(2680, 640, "KisteStyle60x60.png");
        Kiste11 = new Hindernisse(2810, 640, "KisteStyle60x60.png");
        Kiste12 = new Hindernisse(2920, 700, "KisteStyle60x60.png");
        Kiste13 = new Hindernisse(3040, 620, "KisteStyle60x60.png");
        Kiste14 = new Hindernisse(3160, 820, "KisteStyle60x60.png");
        Kiste15 = new Hindernisse(3340, 720, "KisteStyle60x60.png");
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
        Kiste16 = new Hindernisse(260, 660, "transparent1.png");
        Kiste17 = new Hindernisse(260, 600, "transparent1.png");
        Kiste18 = new Hindernisse(260, 540, "transparent1.png");
        Kiste19 = new Hindernisse(260, 480, "transparent1.png");
        Kiste20 = new Hindernisse(260, 420, "transparent1.png");
        Kiste21 = new Hindernisse(260, 360, "transparent1.png");
        Kiste22 = new Hindernisse(260, 300, "transparent1.png");
        Kiste23 = new Hindernisse(260, 240, "transparent1.png");
        Kiste24 = new Hindernisse(260, 180, "transparent1.png");
        Kiste25 = new Hindernisse(320, 180, "transparent1.png");
        Kiste26 = new Hindernisse(380, 180, "transparent1.png");
        Kiste27 = new Hindernisse(440, 180, "transparent1.png");
        Kiste28 = new Hindernisse(500, 180, "transparent1.png");
        Kiste29 = new Hindernisse(560, 180, "transparent1.png");
        Kiste30 = new Hindernisse(620, 180, "transparent1.png");
        Kiste31 = new Hindernisse(680, 180, "transparent1.png");
        Kiste32 = new Hindernisse(740, 180, "transparent1.png");
        Kiste33 = new Hindernisse(800, 180, "transparent1.png");
        Kiste34 = new Hindernisse(880, 180, "transparent1.png");
        Kiste35 = new Hindernisse(940, 180, "transparent1.png");
        Kiste36 = new Hindernisse(1000, 180, "transparent1.png");
        Kiste37 = new Hindernisse(1060, 180, "transparent1.png");
        Kiste38 = new Hindernisse(1120, 180, "transparent1.png");
        Kiste39 = new Hindernisse(1180, 180, "transparent1.png");
        Kiste40 = new Hindernisse(1240, 180, "transparent1.png");


        Boden1 = new Figur(1940, 645, "Stone270x5.eaf");
        Boden1.faktorSetzen(3);
        Boden1.passivMachen();
        Boden2 = new Figur(2120, 720, "Stone30x5.eaf");
        Boden2.faktorSetzen(3);
        Boden2.passivMachen();

        Rakete = new Bild(700, 250, "RaketeSkal.png");
        Rakete.passivMachen();

        figurlaufen = new Figur(4200, 500, "laufen.eaf");
        figurlaufen.aktivMachen();
        figurlaufen.faktorSetzen(4);
        cam.fokusSetzen(figurlaufen);

        //540, 500

        figur2 = new Figur(4700, 500, "geistr.eaf");
        figur2.aktivMachen();
        figur2.faktorSetzen(3);

        Endboss = new Figur(4300, 500, "EndBosz.eaf");
        Endboss.aktivMachen();
        Endboss.faktorSetzen(5);

        
        flamme1 = new Figur(4300, 620,"Flamme10x10.eaf");
            flamme1.passivMachen();
            flamme1.faktorSetzen(2);
            
           flamme2= new Figur(4300, 700,"Flamme10x10.eaf");
           flamme2.passivMachen();
            flamme2.faktorSetzen(2);
            
            
           
        

           
        

        wurzel.add(figurlaufen, Kiste1, Kiste2, 
            Kiste3, Kiste4, Kiste5, Kiste6, Kiste7, Kiste8, Kiste9, Kiste10, Kiste11, Kiste12,
            Kiste13, Kiste14, Kiste15,
            Treppe1, Treppe2, Treppe3, Treppe4, Treppe5, Treppe6, Treppe7, 
            Treppe8, Treppe9, Treppe10, Treppe11, Treppe12, Treppe13, Treppe14, 
            Treppe15, Treppe16, Treppe17, Treppe18, Treppe19, Treppe20, Treppe21, 
            Boden1, Boden2, Rakete, Endboss, figur2, flamme1, flamme2, 
            Kiste16, Kiste17, Kiste18, Kiste19, Kiste20, Kiste21, Kiste22, Kiste23, Kiste24, Kiste25,Kiste26, Kiste27, Kiste28, Kiste29, Kiste30, Kiste31, Kiste32, Kiste33, Kiste34, Kiste35, Kiste36, Kiste37, Kiste38, Kiste39, Kiste40);
        manager.anmelden(this, 10);
    }

    public void zuruecksetzen(){
        figurlaufen.positionSetzen(540, 500);
        figur2.positionSetzen(4700, 500);
    }

    public void tick(){
        figur2.verschieben(-0.5f, 0);
         
                flamme1.verschieben(-0.5f, 0);
            
                flamme2.verschieben(-0.5f, 0);
            

        if(figurlaufen.schneidet(figur2)){
            zuruecksetzen();
        }
        
        if(figurlaufen.schneidet(flamme1) || figurlaufen.schneidet(flamme2)){
            zuruecksetzen();
        }
        
        

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

