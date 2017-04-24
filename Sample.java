import ea.*;

public class Sample extends Game {
	public static void main(String[] args) {
		new Sample();
	}
	
	private Rechteck box;
	
	public Sample() {
		super(400, 400);
		
		box = new Rechteck(175, 175, 50, 50);
		box.farbeSetzen("rot");
		
		wurzel.add(box);
	}
	
	@Override
	public void tasteReagieren(int code) {
		switch(code) {
			case 26: box.verschieben(+0, -10); break;
			case 27: box.verschieben(+10, +0); break;
			case 28: box.verschieben(+0, +10); break;
			case 29: box.verschieben(-10, +0); break;
		}
	}
}