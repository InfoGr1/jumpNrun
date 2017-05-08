import ea.*;

public class Spiel extends Game
{
    private Rechteck r1;
    private Rechteck r2;
   public Spiel(){
   super(600, 600, "Fenstertitel");
   r1 = new Rechteck(20, 20, 20, 20);
   r1.farbeSetzen("rot");
   r1.aktivMachen();
   r2 = new Rechteck(0, 500, 1000, 20);
   r2.farbeSetzen("lila");
   r2.passivMachen();
   r1.schwerkraftSetzen(7);
   wurzel.add(r1, r2);
   
   
}




public void tasteReagieren(int tastencode) {
   
    switch(tastencode){
        
        case Taste.OBEN: r1.sprung(4); break;
        
        case Taste.UNTEN: r1.verschieben(+0, +10); break;
        case Taste.RECHTS: r1.verschieben(+10, +0); break;
        case Taste.LINKS: r1.verschieben(-10, +0); break;
    }
}


    
}
