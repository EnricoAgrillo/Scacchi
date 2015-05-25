import java.util.*;

public class Scacchiera {

	public Pedina[][] scacchiera;
	public ArrayList<Pedina> PezziNeri;
	public ArrayList<Pedina> PezziBianchi;
	
	public Scacchiera() {
		
		PezziNeri = new ArrayList<>();
		PezziBianchi = new ArrayList<>();
		
		PezziNeri.add(new Pedone (1, 0, Colore.Nero, Pezzo.Pedone));
		PezziNeri.add(new Pedone (1, 1, Colore.Nero, Pezzo.Pedone));
		PezziNeri.add(new Pedone (1, 2, Colore.Nero, Pezzo.Pedone));
		PezziNeri.add(new Pedone (1, 3, Colore.Nero, Pezzo.Pedone));
		PezziNeri.add(new Pedone (1, 4, Colore.Nero, Pezzo.Pedone));
		PezziNeri.add(new Pedone (1, 5, Colore.Nero, Pezzo.Pedone));
		PezziNeri.add(new Pedone (1, 6, Colore.Nero, Pezzo.Pedone));
		PezziNeri.add(new Pedone (1, 7, Colore.Nero, Pezzo.Pedone));
		PezziNeri.add(new Torre (0, 0, Colore.Nero, Pezzo.Torre));
		PezziNeri.add(new Torre (0, 7, Colore.Nero, Pezzo.Torre));
		PezziNeri.add(new Cavallo (0, 1, Colore.Nero, Pezzo.Cavallo));
		PezziNeri.add(new Cavallo (0, 6, Colore.Nero, Pezzo.Cavallo));
		PezziNeri.add(new Alfiere (0, 2, Colore.Nero, Pezzo.Alfiere));
		PezziNeri.add(new Alfiere (0, 5, Colore.Nero, Pezzo.Alfiere));
		PezziNeri.add(new Regina (0, 3, Colore.Nero, Pezzo.Regina));
		PezziNeri.add(new Re (0, 4, Colore.Nero, Pezzo.Re));
		
		PezziBianchi.add(new Pedone (6, 0, Colore.Bianco, Pezzo.Pedone));
		PezziBianchi.add(new Pedone (6, 1, Colore.Bianco, Pezzo.Pedone));
		PezziBianchi.add(new Pedone (6, 2, Colore.Bianco, Pezzo.Pedone));
		PezziBianchi.add(new Pedone (6, 3, Colore.Bianco, Pezzo.Pedone));
		PezziBianchi.add(new Pedone (6, 4, Colore.Bianco, Pezzo.Pedone));
		PezziBianchi.add(new Pedone (6, 5, Colore.Bianco, Pezzo.Pedone));
		PezziBianchi.add(new Pedone (6, 6, Colore.Bianco, Pezzo.Pedone));
		PezziBianchi.add(new Pedone (6, 7, Colore.Bianco, Pezzo.Pedone));
		PezziBianchi.add(new Torre (7, 0, Colore.Bianco, Pezzo.Torre));
		PezziBianchi.add(new Torre (7, 1, Colore.Bianco, Pezzo.Torre));
		PezziBianchi.add(new Cavallo (7, 2, Colore.Bianco, Pezzo.Cavallo));
		PezziBianchi.add(new Cavallo (7, 3, Colore.Bianco, Pezzo.Cavallo));
		PezziBianchi.add(new Alfiere (7, 4, Colore.Bianco, Pezzo.Alfiere));
		PezziBianchi.add(new Alfiere (7, 5, Colore.Bianco, Pezzo.Alfiere));
		PezziBianchi.add(new Regina (7, 6, Colore.Bianco, Pezzo.Regina));
		PezziBianchi.add(new Re (7, 7, Colore.Bianco, Pezzo.Re));
		
		scacchiera = new Pedina[][] {{new Torre(0, 0, Colore.Nero, Pezzo.Torre), new Cavallo(0, 1, Colore.Nero, Pezzo.Cavallo), new Alfiere(0, 2, Colore.Nero, Pezzo.Alfiere), new Regina(0, 3, Colore.Nero, Pezzo.Regina), new Re(0, 4, Colore.Nero, Pezzo.Re), new Alfiere(0, 5, Colore.Nero, Pezzo.Alfiere), new Cavallo(0, 6, Colore.Nero, Pezzo.Cavallo), new Torre(0, 7, Colore.Nero, Pezzo.Torre)},
									{new Pedone(1, 0, Colore.Nero, Pezzo.Pedone), new Pedone(0, 1, Colore.Nero, Pezzo.Pedone), new Pedone(0, 2, Colore.Nero, Pezzo.Pedone), new Pedone(0, 3, Colore.Nero, Pezzo.Pedone), new Pedone(0, 4, Colore.Nero, Pezzo.Pedone), new Pedone(0, 5, Colore.Nero, Pezzo.Pedone), new Pedone(0, 6, Colore.Nero, Pezzo.Pedone), new Pedone(0, 7, Colore.Nero, Pezzo.Pedone)},
									{new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto()},
									{new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto()},
									{new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto()},
									{new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto(), new Vuoto()},
									{new Pedone(6, 0, Colore.Bianco, Pezzo.Pedone), new Pedone(6, 1, Colore.Bianco, Pezzo.Pedone), new Pedone(6, 2, Colore.Bianco, Pezzo.Pedone), new Pedone(6, 3, Colore.Bianco, Pezzo.Pedone), new Pedone(6, 4, Colore.Bianco, Pezzo.Pedone), new Pedone(6, 5, Colore.Bianco, Pezzo.Pedone), new Pedone(6, 6, Colore.Bianco, Pezzo.Pedone), new Pedone(6, 7, Colore.Bianco, Pezzo.Pedone)},
									{new Torre(7, 0, Colore.Bianco, Pezzo.Torre), new Cavallo(7, 1, Colore.Bianco, Pezzo.Cavallo), new Alfiere(7, 2, Colore.Bianco, Pezzo.Alfiere), new Regina(7, 3, Colore.Bianco, Pezzo.Regina), new Re(7, 4, Colore.Bianco, Pezzo.Re), new Alfiere(7, 5, Colore.Bianco, Pezzo.Alfiere), new Cavallo(7, 6, Colore.Bianco, Pezzo.Cavallo), new Torre(7, 7, Colore.Bianco, Pezzo.Torre)}};
	}
	
	public boolean CheckPedina(Pedina pedina, int newX, int newY) {
		
		switch (pedina.getType()) {
		
			case Pedone:
				return CheckMovePedone((Pedone)pedina, newX, newY);
			case Re:
				return CheckMoveRe((Re)pedina, newX, newY);
			case Alfiere:
				return CheckMoveAlfiere((Alfiere)pedina, newX, newY);
			case Cavallo:
				return CheckMoveCavallo((Cavallo)pedina, newX, newY);
			case Torre:
				return CheckMoveTorre((Torre)pedina, newX, newY);
			case Regina:
				return CheckMoveRegina((Regina)pedina, newX, newY);

			default: 
				return false;
		
		}
	}
	
	public boolean CheckMovePedone(Pedone pedone, int newX, int newY) {
		
		if ((pedone.getColore() == Colore.Bianco && newX == pedone.getX() - 1) 
			|| (pedone.getColore() == Colore.Nero && newX == pedone.getX() + 1))
			return MovePedone(pedone, newX, newY);
		
		else
			return false;
	}
	
	public boolean MovePedone(Pedone pedone, int newX, int newY) {
		
		if ((pedone.getColore() == Colore.Bianco && (newY == pedone.getY() - 1 || newY == pedone.getY() + 1) && scacchiera[newX][newY].getColore() == Colore.Nero)
			|| (pedone.getColore() == Colore.Nero && (newY == pedone.getY() - 1 || newY == pedone.getY() + 1) && scacchiera[newX][newY].getColore() == Colore.Bianco)) //{
			//setPosition(pedone, newX, newY);
			//setVoid(pedone.getX(), pedone.getY());
			//pedone.setCoordinate(newX, newY);
			return true;
		//}
		
		else if ((pedone.getColore() == Colore.Bianco && newY == pedone.getY() && scacchiera[newX][newY].getType() == null)
				|| (pedone.getColore() == Colore.Nero && newY == pedone.getY() && scacchiera[newX][newY].getType() == null)) {
			//setPosition(pedone, newX, newY);
			//setVoid(newX, newY);
			if(newX == 0 || newX == 7)
				pedone.setType(ScegliNuovaPedina());
			return true;
		}
		else
			return false;
	}	
	
	public boolean CheckMoveRe(Re re, int newX, int newY) {
		
		//se il movimento seleziona il posto di partenza viene preso come valido
		if ((newX == re.getX() || newX == re.getX() + 1 || newX == re.getX() - 1) 
				&& (newY == re.getY() || newY == re.getY() + 1 || newY == re.getY() - 1))
			return MoveRe(re, newX, newY);
		else
			return false;
	}
	
	public boolean MoveRe(Re re, int newX, int newY) {
		
		if ((re.getColore() == Colore.Bianco && scacchiera[newX][newY].getColore() != Colore.Bianco)
			|| (re.getColore() == Colore.Nero && scacchiera[newX][newY].getColore() != Colore.Nero)) //{
			//setPosition(re, newX, newY);
			//setVoid(newX, newY);
			return true;
		//}
		return false;
	}
	
	public boolean CheckMoveAlfiere(Alfiere alfiere, int newX, int newY) {
		
		int x = alfiere.getX();
		int y = alfiere.getY();
		
		for (int n = 1; n <= 7; n++)
			if ((newX == x + n && newY == y + n) 
					|| (newX == x - n && newY == y - n) 
					|| (newX == x + n && newY == y - n) 
					|| (newX == x - n && newY == y + n))
				return MoveAlfiere(alfiere, newX, newY);
		return false;
	}
	
	public boolean MoveAlfiere(Alfiere alfiere, int newX, int newY) {
		
		int x = alfiere.getX();
		int y = alfiere.getY();
		
		int stradaLibera = 0;
		int limite = newX - x;
		ValoreAssoluto(limite);
		
		if ((alfiere.getColore() == Colore.Bianco && scacchiera[newX][newY].getColore() != Colore.Bianco)
				|| (alfiere.getColore() == Colore.Nero && scacchiera[newX][newY].getColore() != Colore.Nero)) {
			if (newX > x && newY > y) {
				for (int n = 1; n < limite; n++)
					if (scacchiera[x + n][y + n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limite - 1){
					//setPosition(alfiere, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX < x && newY < y) {
				for (int n = 1; n < limite; n++)
					if (scacchiera[x - n][y - n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limite - 1){
					//setPosition(alfiere, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX > x && newY < y) {
				for (int n = 1; n < limite; n++)
					if (scacchiera[x + n][y - n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limite - 1){
					//setPosition(alfiere, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX < x && newY > y) {
				for (int n = 1; n < limite; n++)
					if (scacchiera[x - n][y + n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limite - 1){
					//setPosition(alfiere, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else
				return false;
		}
		return false;
	}
	
	public boolean CheckMoveCavallo(Cavallo cavallo, int newX, int newY) {
		if (((newX == cavallo.getX() + 1 || newX == cavallo.getX() - 1) 
				&& (newY == cavallo.getY() + 2 || newY == cavallo.getY() - 2)
				|| (newX == cavallo.getX() + 2 || newX == cavallo.getX() - 2) 
				&& (newY == cavallo.getY() + 1 || newY == cavallo.getY() - 1)))
			return MoveCavallo(cavallo, newX, newY);
		else
			return false;
	}
	
	public boolean MoveCavallo(Cavallo cavallo, int newX, int newY) {
		
		if ((cavallo.getColore() == Colore.Bianco && scacchiera[newX][newY].getColore() != Colore.Bianco)
				|| (cavallo.getColore() == Colore.Nero && scacchiera[newX][newY].getColore() != Colore.Nero)) {
			//setPosition(cavallo, newX, newY);
			//setVoid(newX, newY);
			return true;
			}
		else
			return false;
	}
	
	public boolean CheckMoveTorre(Torre torre, int newX, int newY) {
		
		int x = torre.getX();
		int y = torre.getY();
		
		for (int n = 1; n <= 7; n++)
			if ((newX == x && newY == y + n) 
					|| (newX == x && newY == y - n) 
					|| (newX == x + n && newY == y) 
					|| (newX == x - n && newY == y))
				return MoveTorre(torre, newX, newY);
		return false;
	}
	
	public boolean MoveTorre(Torre torre, int newX, int newY) {
		
		int x = torre.getX();
		int y = torre.getY();
		
		int stradaLibera = 0;
		int limiteX = newX - x;
		int limiteY = newY - y;
		ValoreAssoluto(limiteX);
		ValoreAssoluto(limiteY);
		
		if ((torre.getColore() == Colore.Bianco && scacchiera[newX][newY].getColore() != Colore.Bianco)
				|| (torre.getColore() == Colore.Nero && scacchiera[newX][newY].getColore() != Colore.Nero)) {
			if (newX == x && newY > y) {
				for (int n = 1; n < limiteY; n++)
					if (scacchiera[x][y + n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteY - 1){
					//setPosition(torre, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX == x && newY < y) {
				for (int n = 1; n < limiteY; n++)
					if (scacchiera[x][y - n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteY - 1){
					//setPosition(torre, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX > x && newY == y) {
				for (int n = 1; n < limiteX; n++)
					if (scacchiera[x + n][y].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteX - 1){
					//setPosition(torre, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX < x && newY == y) {
				for (int n = 1; n < limiteX; n++)
					if (scacchiera[x - n][y].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteX - 1){
					//setPosition(torre, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else
				return false;
		}
		return false;
		
	}
	
	public boolean CheckMoveRegina(Regina regina, int newX, int newY) {
		
		int x = regina.getX();
		int y = regina.getY();
		
		for (int n = 1; n <= 7; n++)
			if (((newX == x && newY == y + n) 
					|| (newX == x && newY == y - n) 
					|| (newX == x + n && newY == y) 
					|| (newX == x - n && newY == y)) //controllo a 90°
						|| 
						((newX == x + n && newY == y + n) 
							|| (newX == x - n && newY == y - n) 
							|| (newX == x + n && newY == y - n) 
							|| (newX == x - n && newY == y + n))) //controllo a 45°
				return MoveRegina(regina, newX, newY);
		return false;
		
	}
	
	public boolean MoveRegina(Regina regina, int newX, int newY) {
		
		int x = regina.getX();
		int y = regina.getY();
		
		int stradaLibera = 0;
		int limiteX = newX - x;
		int limiteY = newY - y;
		ValoreAssoluto(limiteX);
		ValoreAssoluto(limiteY);
		
		if ((regina.getColore() == Colore.Bianco && scacchiera[newX][newY].getColore() != Colore.Bianco)
				|| (regina.getColore() == Colore.Nero && scacchiera[newX][newY].getColore() != Colore.Nero)) {
			if (newX == x && newY > y) {
				for (int n = 1; n < limiteY; n++)
					if (scacchiera[x][y + n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteY - 1){
					//setPosition(regina, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX == x && newY < y) {
				for (int n = 1; n < limiteY; n++)
					if (scacchiera[x][y - n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteY - 1){
					//setPosition(regina, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX > x && newY == y) {
				for (int n = 1; n < limiteX; n++)
					if (scacchiera[x + n][y].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteX - 1){
					//setPosition(regina, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX < x && newY == y) {
				for (int n = 1; n < limiteX; n++)
					if (scacchiera[x - n][y].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteX - 1){
					//setPosition(regina, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX > x && newY > y) {
				for (int n = 1; n < limiteX; n++)
					if (scacchiera[x + n][y + n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteX - 1){
					//setPosition(regina, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX < x && newY < y) {
				for (int n = 1; n < limiteX; n++)
					if (scacchiera[x - n][y - n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteX - 1){
					//setPosition(regina, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX > x && newY < y) {
				for (int n = 1; n < limiteX; n++)
					if (scacchiera[x + n][y - n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteX - 1){
					//setPosition(regina, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else if (newX < x && newY > y) {
				for (int n = 1; n < limiteX; n++)
					if (scacchiera[x - n][y + n].getType() == null)
						stradaLibera++;
				if (stradaLibera == limiteX - 1){
					//setPosition(regina, newX, newY);
					//setVoid(newX, newY);
					return true;
				}
			}
			else
				return false;
		}
		return false;
		
	}
	
	public int ValoreAssoluto(int valore) {
		
		if (valore >= 0)
			return valore;
		else
			return valore + (2 * valore);
	}
	
	public void setVoid(int x, int y) {
		scacchiera[x][y] = new Vuoto();
	}
	
	//si potrebbe unire con setvoid e setcoordinate
	public void setPosition(Pedina pezzo, int x, int y) {
		scacchiera[x][y] = pezzo;
	}
	
	public Pedina getPosition(int x, int y) {  //DA TOGLIERE
		return this.scacchiera[x][y];
	}
	
	public boolean ScaccoFatto(Pedina pedina, Re re) {
		
		if (re.getColore() == Colore.Bianco) {
			if (CheckPedina(pedina, re.getX(), re.getY()) == true)
				return true;
		}
		else if (re.getColore() == Colore.Nero) {
			if (CheckPedina(pedina, re.getX(), re.getY()) == true)
				return true;
		}
		return false;
	}
	
	public boolean ScaccoSubito(Re re) {
		
		if (re.getColore() == Colore.Bianco) {
			for (Pedina pedina : PezziNeri)
				if (ScaccoFatto(pedina, re) == true)
					return true;
		}
		else if (re.getColore() == Colore.Nero) {
			for (Pedina pedina : PezziBianchi)
				if (ScaccoFatto(pedina, re) == true)
					return true;
		}
		return false;
	}
	
	public boolean ScaccoMatto(Re re) {
		
		int scaccoCounter = 0;
		
		if (re.getColore() == Colore.Bianco) {
			for (int i = -1; i <= 1; i++)
				for (int k = -1; k <= 1; k++)
					if (re.getX() + i < 0 || re.getX() > 7 || re.getY() < 0 || re.getY() > 7)
						scaccoCounter++;
					else if (CheckMoveRe(re, re.getX() + i, re.getY() + k) == true)
						if (ScaccoSubito(re) == true)
							scaccoCounter++;
					else
						scaccoCounter++;
		}
		else if (re.getColore() == Colore.Nero) {
			for (int i = -1; i <= 1; i++)
				for (int k = -1; k <= 1; k++)
					if (re.getX() + i < 0 || re.getX() > 7 || re.getY() < 0 || re.getY() > 7)
						scaccoCounter++;
					else if (CheckMoveRe(re, re.getX() + i, re.getY() + k) == true)
						if (ScaccoSubito(re) == true)
							scaccoCounter++;
					else
						scaccoCounter++;
		}
		
		if (scaccoCounter == 8)
			return true;
		else
			return false;
	}
	
	public Pezzo ScegliNuovaPedina() {
		
		System.out.print("Inserisci il pezzo con cui sostituire il pedone (tutto in minuscolo): ");
		
		String pezzo = new Scanner(System.in).nextLine();
		
		switch(pezzo) {
			case "pedone":
				return Pezzo.Pedone;
			case "regina":
				return Pezzo.Regina;
			case "alfiere":
				return Pezzo.Alfiere;
			case "torre":
				return Pezzo.Torre;
			case "cavallo":
				return Pezzo.Cavallo;
			case "re":
				System.out.println("Non puoi avere più di un re");
				return ScegliNuovaPedina();
		}
		return null;
	}
	
	public void Elimina(Pedina pedina, int newX, int newY) {
		
		if (pedina.getColore() == Colore.Bianco) {
			for (Pedina eliminato : PezziNeri) {
				if (eliminato.getX() == newX && eliminato.getY() == newY)
					PezziNeri.remove(eliminato);
			}
		}
		else if (pedina.getColore() == Colore.Nero) {
			for (Pedina eliminato : PezziBianchi) {
				if (eliminato.getX() == newX && eliminato.getY() == newY)
					PezziNeri.remove(eliminato);
			}
		}
	
	}
	
}