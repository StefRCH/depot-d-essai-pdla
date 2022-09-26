package packagerelou;


public class Mattewlechef {
	public boolean meilleur;
	public boolean chef;
	private int nbcopines;
	
	public Mattewlechef(boolean M, boolean C) {
		this.meilleur=M;
		this.chef=C;
		if(M&C){
			this.nbcopines=99999999;
		}
		
	}
	
	private void PrivateJoke() {
		if(this.nbcopines>10) {
			System.out.println("Belle ....");
		}
	}
}
