
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Grafica {

	private final JPanel grafica = new JPanel(new BorderLayout(3, 3));
	private JButton[][] quadratiScacchiera = new JButton[8][8];
    private JPanel scacchiera_grafica;
    private static final String lettere = " ABCDEFGH ";
    public Bottone bottone;
    private Scacchiera scacchiera;
    private Pedina pedina;
	private ArrayList<Pedina> PezziNeri;
	private ArrayList<Pedina> PezziBianchi;
    
    public Grafica() {
    	//creaGrafica();
    }
    
    public final void creaGrafica() {
    	
		Scacchiera scacchiera = new Scacchiera();
		
		Pedone pedoneB1 = new Pedone(6, 0, Colore.Bianco, Pezzo.Pedone);
		Pedone pedoneB2 = new Pedone(6, 1, Colore.Bianco, Pezzo.Pedone);
		Pedone pedoneB3 = new Pedone(6, 2, Colore.Bianco, Pezzo.Pedone);
		Pedone pedoneB4 = new Pedone(6, 3, Colore.Bianco, Pezzo.Pedone);
		Pedone pedoneB5 = new Pedone(6, 4, Colore.Bianco, Pezzo.Pedone);
		Pedone pedoneB6 = new Pedone(6, 5, Colore.Bianco, Pezzo.Pedone);
		Pedone pedoneB7 = new Pedone(6, 6, Colore.Bianco, Pezzo.Pedone);
		Pedone pedoneB8 = new Pedone(6, 7, Colore.Bianco, Pezzo.Pedone);
		Pedone pedoneN1 = new Pedone(1, 0, Colore.Nero, Pezzo.Pedone);
		Pedone pedoneN2 = new Pedone(1, 1, Colore.Nero, Pezzo.Pedone);
		Pedone pedoneN3 = new Pedone(1, 2, Colore.Nero, Pezzo.Pedone);
		Pedone pedoneN4 = new Pedone(1, 3, Colore.Nero, Pezzo.Pedone);
		Pedone pedoneN5 = new Pedone(1, 4, Colore.Nero, Pezzo.Pedone);
		Pedone pedoneN6 = new Pedone(1, 5, Colore.Nero, Pezzo.Pedone);
		Pedone pedoneN7 = new Pedone(1, 6, Colore.Nero, Pezzo.Pedone);
		Pedone pedoneN8 = new Pedone(1, 7, Colore.Nero, Pezzo.Pedone);
		Torre torreN1 = new Torre(0, 0, Colore.Nero, Pezzo.Torre);
		Torre torreN2 = new Torre(0, 7, Colore.Nero, Pezzo.Torre);
		Cavallo cavalloN1 = new Cavallo(0, 1, Colore.Nero, Pezzo.Cavallo);
		Cavallo cavalloN2 = new Cavallo(0, 6, Colore.Nero, Pezzo.Cavallo);
		Alfiere alfiereN1 = new Alfiere(0, 2, Colore.Nero, Pezzo.Alfiere);
		Alfiere alfiereN2 = new Alfiere(0, 5, Colore.Nero, Pezzo.Alfiere);
		Regina reginaN = new Regina(0, 3, Colore.Nero, Pezzo.Regina);
		Re reN = new Re(0, 4, Colore.Nero, Pezzo.Re);
		Torre torreB1 = new Torre(7, 0, Colore.Bianco, Pezzo.Torre);
		Torre torreB2 = new Torre(7, 7, Colore.Bianco, Pezzo.Torre);
		Cavallo cavalloB1 = new Cavallo(7, 1, Colore.Bianco, Pezzo.Cavallo);
		Cavallo cavalloB2 = new Cavallo(7, 6, Colore.Bianco, Pezzo.Cavallo);
		Alfiere alfiereB1 = new Alfiere(7, 2, Colore.Bianco, Pezzo.Alfiere);
		Alfiere alfiereB2 = new Alfiere(7, 5, Colore.Bianco, Pezzo.Alfiere);
		Regina reginaB = new Regina(7, 3, Colore.Bianco, Pezzo.Regina);
		Re reB = new Re(7, 4, Colore.Bianco, Pezzo.Re);
		
		ArrayList<Pedina> PezziNeri = new ArrayList<>();
		ArrayList<Pedina> PezziBianchi = new ArrayList<>();
		
		PezziNeri.add(reginaN);
		PezziNeri.add(cavalloN1);
		PezziNeri.add(cavalloN2);
		PezziNeri.add(torreN1);
		PezziNeri.add(torreN2);
		PezziNeri.add(alfiereN1);
		PezziNeri.add(alfiereN2);
		PezziNeri.add(reN);
		PezziNeri.add(pedoneN1);
		PezziNeri.add(pedoneN2);
		PezziNeri.add(pedoneN3);
		PezziNeri.add(pedoneN4);
		PezziNeri.add(pedoneN5);
		PezziNeri.add(pedoneN6);
		PezziNeri.add(pedoneN7);
		PezziNeri.add(pedoneN8);
		
		PezziBianchi.add(reginaB);
		PezziBianchi.add(cavalloB1);
		PezziBianchi.add(cavalloB2);
		PezziBianchi.add(torreB1);
		PezziBianchi.add(torreB2);
		PezziBianchi.add(alfiereB1);
		PezziBianchi.add(alfiereB2);
		PezziBianchi.add(reB);
		PezziBianchi.add(pedoneB1);
		PezziBianchi.add(pedoneB2);
		PezziBianchi.add(pedoneB3);
		PezziBianchi.add(pedoneB4);
		PezziBianchi.add(pedoneB5);
		PezziBianchi.add(pedoneB6);
		PezziBianchi.add(pedoneB7);
		PezziBianchi.add(pedoneB8);

		scacchiera.setPosition(pedoneN1, 1, 0);
		scacchiera.setPosition(pedoneN2, 1, 1);
		scacchiera.setPosition(pedoneN3, 1, 2);
		scacchiera.setPosition(pedoneN4, 1, 3);
		scacchiera.setPosition(pedoneN5, 1, 4);
		scacchiera.setPosition(pedoneN6, 1, 5);
		scacchiera.setPosition(pedoneN7, 1, 6);
		scacchiera.setPosition(pedoneN8, 1, 7);
		scacchiera.setPosition(pedoneB1, 6, 0);
		scacchiera.setPosition(pedoneB2, 6, 1);
		scacchiera.setPosition(pedoneB3, 6, 2);
		scacchiera.setPosition(pedoneB4, 6, 3);
		scacchiera.setPosition(pedoneB5, 6, 4);
		scacchiera.setPosition(pedoneB6, 6, 5);
		scacchiera.setPosition(pedoneB7, 6, 6);
		scacchiera.setPosition(pedoneB8, 6, 7);
		scacchiera.setPosition(reN, 0, 4);
		scacchiera.setPosition(reginaN, 0, 3);
		scacchiera.setPosition(alfiereN1, 0, 2);
		scacchiera.setPosition(alfiereN2, 0, 5);
		scacchiera.setPosition(torreN1, 0, 0);
		scacchiera.setPosition(torreN2, 0, 7);
		scacchiera.setPosition(cavalloN1, 0, 1);
		scacchiera.setPosition(cavalloN2, 0, 6);
		scacchiera.setPosition(reB, 7, 4);
		scacchiera.setPosition(reginaB, 7, 3);
		scacchiera.setPosition(alfiereB1, 7, 2);
		scacchiera.setPosition(alfiereB2, 7, 5);
		scacchiera.setPosition(torreB1, 7, 0);
		scacchiera.setPosition(torreB2, 7, 7);
		scacchiera.setPosition(cavalloB1, 7, 1);
		scacchiera.setPosition(cavalloB2, 7, 6);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	scacchiera_grafica = new JPanel(new GridLayout(0, 10));
        grafica.add(scacchiera_grafica);
        
        Evento muoviPedina;
        muoviPedina = new Evento(scacchiera, PezziNeri, PezziBianchi, pedina, reB, reN);
        
        Insets bordoNullo = new Insets(0,0,0,0);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                bottone = new Bottone(i, j);
                bottone.setMargin(bordoNullo);
                ImageIcon icona = new ImageIcon(new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
                bottone.setIcon(icona);
                if ((j + i) % 2 == 0) {
                    bottone.setBackground(Color.white);
                }
                else {
                    bottone.setBackground(Color.black);
                }
                bottone.addActionListener(muoviPedina);
                quadratiScacchiera[j][i] = bottone;
            }
        }
        
        for (int i = 0; i < 10; i++) {
        	scacchiera_grafica.add(new JLabel(lettere.substring(i, i + 1),SwingConstants.CENTER));
        }
        
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                switch (j) {
                    case 0:
                    	scacchiera_grafica.add(new JLabel("" + (i),
                                SwingConstants.CENTER));
                    	break;
                    case 9:
                        scacchiera_grafica.add(new JLabel("" + (i),
                                SwingConstants.CENTER));
                        break;
                    default:
                        scacchiera_grafica.add(quadratiScacchiera[j - 1][i - 1]);
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            scacchiera_grafica.add(
                    new JLabel(lettere.substring(i, i + 1),
                    SwingConstants.CENTER));
        }
        
        quadratiScacchiera[0][0].add(new JLabel(new ImageIcon("Resources/torreNera.png")));
        quadratiScacchiera[1][0].add(new JLabel(new ImageIcon("Resources/cavalloNero.png")));
        quadratiScacchiera[2][0].add(new JLabel(new ImageIcon("Resources/alfiereNero.png")));
        quadratiScacchiera[3][0].add(new JLabel(new ImageIcon("Resources/reginaNera.png")));
        quadratiScacchiera[4][0].add(new JLabel(new ImageIcon("Resources/reNero.png")));
        quadratiScacchiera[5][0].add(new JLabel(new ImageIcon("Resources/alfiereNero.png")));
        quadratiScacchiera[6][0].add(new JLabel(new ImageIcon("Resources/cavalloNero.png")));
        quadratiScacchiera[7][0].add(new JLabel(new ImageIcon("Resources/torreNera.png")));
        
        quadratiScacchiera[0][7].add(new JLabel(new ImageIcon("Resources/torreBianca.png")));
        quadratiScacchiera[1][7].add(new JLabel(new ImageIcon("Resources/cavalloBianco.png")));
        quadratiScacchiera[2][7].add(new JLabel(new ImageIcon("Resources/alfiereBianco.png")));
        quadratiScacchiera[3][7].add(new JLabel(new ImageIcon("Resources/reginaBianca.png")));
        quadratiScacchiera[4][7].add(new JLabel(new ImageIcon("Resources/reBianco.png")));
        quadratiScacchiera[5][7].add(new JLabel(new ImageIcon("Resources/alfiereBianco.png")));
        quadratiScacchiera[6][7].add(new JLabel(new ImageIcon("Resources/cavalloBianco.png")));
        quadratiScacchiera[7][7].add(new JLabel(new ImageIcon("Resources/torreBianca.png")));
        
        for (int i = 0; i < 8; i++) {
        	quadratiScacchiera[i][1].add(new JLabel(new ImageIcon("Resources/pedoneNero.png")));
        	quadratiScacchiera[i][6].add(new JLabel(new ImageIcon("Resources/pedoneBianco.png")));
        }
        
    }
    
    public void posizionaPedina(Pedina pedina, int newX, int newY) {
    	
    	System.out.println("sto posizionando la pedina in " + newX + "\n"); 
    	
    	switch (pedina.getType()) {
		
			case Pedone:
				if (pedina.getColore() == Colore.Nero) {
					
					quadratiScacchiera[newX][newY].add(new JLabel(new ImageIcon("Resources/pedoneNero.png")));
				}
				else {
					
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/pedoneBianco.png")));
				}
				break;
				
			case Re:
				if (pedina.getColore() == Colore.Nero) {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/reNero.png")));
				}
				else {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/reBianco.png")));
				}
				break;
				
			case Alfiere:
				if (pedina.getColore() == Colore.Nero) {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/alfiereNero.png")));
				}
				else {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/alfiereBianco.png")));
				}
				break;
				
			case Cavallo:
				if (pedina.getColore() == Colore.Nero) {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/cavalloNero.png")));
				}
				else {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/cavalloBianco.png")));
				}
				break;
				
			case Torre:
				if (pedina.getColore() == Colore.Nero) {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/torreNera.png")));
				}
				else {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/torreBianca.png")));
				}
				break;
				
			case Regina:
				if (pedina.getColore() == Colore.Nero) {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/reginaNera.png")));
				}
				else {
					quadratiScacchiera[pedina.getX()][pedina.getY()].add(new JLabel(new ImageIcon("Resources/reginaBianca.png")));
				}
				break;
			default:
				break;
    	}
	}
    
    public final JComponent getScacchiera() {
        return scacchiera_grafica;
    }

    public final JComponent getGrafica() {
        return grafica;
    }
}