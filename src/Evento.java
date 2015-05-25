import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Evento implements ActionListener {
	
	private Bottone bottone;
	private Grafica grafica;
	private Scacchiera scacchiera;
	private Pedina pedina;
	private Re reBianco;
	private Re reNero; //MANCA IL RE
	private boolean b = false;
	private ArrayList<Pedina> PezziNeri;
	private ArrayList<Pedina> PezziBianchi;
	private boolean turno = true;
	
	int coordinataX;
	int coordinataY;
	int newX;
	int newY;
	
	public Evento(Scacchiera scacchiera, ArrayList<Pedina> PezziNeri, ArrayList<Pedina> PezziBianchi, Pedina pedina, Re reBianco, Re reNero) {
		
		this.scacchiera = scacchiera;
//		this.bottone = bottone;
		this.PezziNeri = PezziNeri;
		this.PezziBianchi = PezziBianchi;
		this.pedina = pedina;
		this.reBianco = reBianco;
		this.reNero = reNero;
		
	}
	
//	public void setBottone(Bottone bottone) {
//		
//		this.bottone = bottone;
//		
//	}
	
	public void actionPerformed(ActionEvent evento) {
		
		if(!b){
			
			coordinataX = ((Bottone)evento.getSource()).getbX();
			coordinataY = ((Bottone)evento.getSource()).getbY();	
			
			System.out.println("Ho preso il pezzo in " + coordinataX + " " + coordinataY + "\n");
			
				for(Pedina pedinaBianca : PezziBianchi) {
					if(pedinaBianca.getX() == coordinataX && pedinaBianca.getY() == coordinataY) {
						pedina = pedinaBianca;
						break;
					}
				}
				
				for(Pedina pedinaNera : PezziNeri) {
					if(pedinaNera.getX() == coordinataX && pedinaNera.getY() == coordinataY) {
						pedina = pedinaNera;
						System.out.println("la pedina " + pedina.getX() + " " + pedina.getY() + " è in lista");
						break;
					}
				}
				b = !b;
		}
		else {
			
			newX = ((Bottone)evento.getSource()).getbX();
			newY = ((Bottone)evento.getSource()).getbY();
			
			if (turno) { //true = bianco
				System.out.println("Secondo click " + newX + " " + newY);
				if(scacchiera.CheckPedina(pedina, newX, newY)) {
					if (scacchiera.ScaccoSubito(reBianco) == false) {
						scacchiera.setPosition(pedina, newX, newY);
						scacchiera.setVoid(pedina.getX(), pedina.getY());
//						grafica.posizionaPedina(pedina, newX, newY);
						pedina.setCoordinate(newX, newY);
						scacchiera.ScaccoFatto(pedina, reNero);
						scacchiera.Elimina(pedina, newX, newY);
						b = !b;
						System.out.println("Nuova posizione della pedina selezionata: " + pedina.getX() + " " + pedina.getY());
					}
				}
			}
			else {
				if(scacchiera.CheckPedina(pedina, newX, newY)) {
					if (scacchiera.ScaccoSubito(reBianco) == false) {
						scacchiera.setPosition(pedina, newX, newY);
						scacchiera.setVoid(pedina.getX(), pedina.getY());
						grafica.posizionaPedina(pedina, newX, newY);
						pedina.setCoordinate(newX, newY);
						scacchiera.ScaccoFatto(pedina, reNero);
						scacchiera.Elimina(pedina, newX, newY);
						b = !b;
					}
				}
			}
		}
	}
	
	
}