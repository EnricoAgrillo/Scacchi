
public class Pedone extends Pedina {
	
	private Pezzo pedone;

	public Pedone(int x, int y, Colore colore, Pezzo pedone) {
		super(x, y, colore, pedone);
	}
	
	public void setType(Pezzo pezzo) {
		this.pedone = pezzo;
	}
	
}