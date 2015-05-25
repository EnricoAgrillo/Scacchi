import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		
        EventQueue.invokeLater(new Runnable() {
        	
        	public void run() {
        
        		Grafica cb = new Grafica();
        		cb.creaGrafica();
        		JFrame f = new JFrame("Scacchi");
                f.add(cb.getGrafica());
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setLocationByPlatform(true);

                f.pack();
                f.setMinimumSize(f.getSize());
                f.setVisible(true);
        	}
        });
		
		/*
		if (scacchiera.ScaccoMatto(reN, PezziBianchi) == true)
			System.out.println("SCACCOMATTO");
		
		if (scacchiera.CheckPedina(pedoneN1, 7, 3, pedoneN1.getType()) == true) {
			if (scacchiera.ScaccoSubito(reN) == false) {
				scacchiera.setPosition(pedoneN1, 7, 3);
				scacchiera.setVoid(6, 3);
				pedoneN1.setCoordinate(7, 3);
				scacchiera.ScaccoFatto(pedoneN1, reB);
				scacchiera.Elimina(pedoneN1, 7, 3);
			}
		}
		
		
		scacchiera.setPosition(reginaN, 4, 3);
		scacchiera.setVoid(1, 3);
		scacchiera.setVoid(0, 3);
		reginaN.setCoordinate(4, 3);
		
		System.out.println("Pedina sarà : " + reginaN.getType());
		System.out.println("cosa c'è in 4, 3: " + scacchiera.getPosition(4, 3));
		System.out.println("cosa c'è in 1, 3: " + scacchiera.getPosition(1, 3));
		System.out.println("cosa c'è in 0, 3: " + scacchiera.getPosition(0, 3));
		
		System.out.println("coord: " + reginaN.getType() + " " + reginaN.getX() + ", " + reginaN.getY());
		
		if (scacchiera.ScaccoMatto(reN, PezziBianchi) == true)
			System.out.println("SCACCOMATTO");
		
		if (scacchiera.CheckPedina(reginaN, 0, 3, reginaN.getType()) == true) {
			if (scacchiera.ScaccoSubito(reN, PezziBianchi) == false) {
				scacchiera.setPosition(reginaN, 0, 3);
				scacchiera.setVoid(4, 3);
				reginaN.setCoordinate(0, 3);
				scacchiera.ScaccoFatto(reginaN, reB);
			}
		}
		
		System.out.println("Cosa c'è in 4, 3: " + scacchiera.getPosition(4, 3));
		System.out.println("Coord: " + reginaN.getX() + ", " + reginaN.getY());
		System.out.println("Cosa c'è in 0, 3: " + scacchiera.getPosition(0, 3));
		
		System.out.println("");
		*/
	}
}