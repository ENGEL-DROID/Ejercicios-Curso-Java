package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _09_VariosOyentes {

	public static void main(String[] args) {
		Ventana9 ventana = new Ventana9();
	}
}

class Ventana9 extends JFrame {
	public Ventana9() {
		setSize(400, 300);
		setTitle(" Varios Oyentes");
		setBounds(1200, 200, 400, 300);
		add(new Lamina9());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Lamina9 extends JPanel {
	JButton btn1, btn2;
	public Lamina9() {
		setBackground(new Color(255, 255, 153));
		setLayout(new GridBagLayout());
		add(btn1 = new JButton("Nueva Ventana"));
		add(btn2 = new JButton("Cerrar Ventanas"));
		btn1.addActionListener(new OyenteListener());
	}
	
	public class OyenteListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			VentanaEmergente marco = new VentanaEmergente(btn2);
		}
	}
	
	int numero = 1;
	
	class VentanaEmergente extends JFrame {
		
		public VentanaEmergente(JButton btnCerrar) {
			setTitle("Ventana " + numero);
			setBounds(40*numero, 40*numero, 250, 200);
			
			add(new NombreAleatorio());
			
			setVisible(true);	
			numero++;
			btnCerrar.addActionListener(new OyenteCerrar());
		}
		
		class OyenteCerrar implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				numero = 1;
			}
		}
	}
}

class NombreAleatorio extends JPanel {
	
	JLabel nombre;
	
	Random random = new Random();
	int aleatorio1 = random.nextInt(100)+155;
	int aleatorio2 = random.nextInt(100)+155;
	int aleatorio3 = random.nextInt(100)+155;
	
	int vocalNro1 = random.nextInt(9);
	int vocalNro2 = random.nextInt(9);
	int vocalNro3 = random.nextInt(9);
	int vocalNro4 = random.nextInt(9);
	int vocalNro5 = random.nextInt(9);
	int vocalNro6 = random.nextInt(9);
	int consonanteNro1 = random.nextInt(27);
	int consonanteNro2 = random.nextInt(27);
	int consonanteNro3 = random.nextInt(27);
	int consonanteNro4 = random.nextInt(27);
	int consonanteNro5 = random.nextInt(27);
	int consonanteNro6 = random.nextInt(27);
	
//	String vocales[] = {"A","E","I","O","U",    "AA","EE","II","OO","UU"};
	String vocales[] = {"A","E","I","O","U","AA","EE","II","OO","UU"};
	String consonantes[] = {"B","C","D","F","G","H","J","K","L","M","N","Ñ","P","Q","R","S","T","V","W","X","Y","Z","LL","BB","RR","MM","PP","SS",};
	
	String vocalRandom1;
	String vocalRandom2;
	String vocalRandom3;
	String vocalRandom4;
	String vocalRandom5;
	String vocalRandom6;
	String consonanteRandom1;
	String consonanteRandom2;
	String consonanteRandom3;
	String consonanteRandom4;
	String consonanteRandom5;
	String consonanteRandom6;
	
	public NombreAleatorio() {
		
		// -----------VOCALES-----------------------
		for(int i=0; i<vocales.length; i++) {
			if(i == vocalNro1) {
				vocalRandom1 = vocales[i];
			}
		}
		for(int i=0; i<vocales.length; i++) {
			if(i == vocalNro2) {
				vocalRandom2 = vocales[i];
			}
		}
		for(int i=0; i<vocales.length; i++) {
			if(i == vocalNro3) {
				vocalRandom3 = vocales[i];
			}
		}
		for(int i=0; i<vocales.length; i++) {
			if(i == vocalNro4) {
				vocalRandom4 = vocales[i];
			}
		}
		for(int i=0; i<vocales.length; i++) {
			if(i == vocalNro5) {
				vocalRandom5 = vocales[i];
			}
		}
		for(int i=0; i<vocales.length; i++) {
			if(i == vocalNro6) {
				vocalRandom6 = vocales[i];
			}
		}
		// -----------CONSONANTES-----------------------
		for(int i=0; i<consonantes.length; i++) {
			if(i == consonanteNro1) {
				consonanteRandom1 = consonantes[i];
			}
		}
		for(int i=0; i<consonantes.length; i++) {
			if(i == consonanteNro2) {
				consonanteRandom2 = consonantes[i];
			}
		}
		for(int i=0; i<consonantes.length; i++) {
			if(i == consonanteNro3) {
				consonanteRandom3 = consonantes[i];
			}
		}
		for(int i=0; i<consonantes.length; i++) {
			if(i == consonanteNro4) {
				consonanteRandom4 = consonantes[i];
			}
		}
		for(int i=0; i<consonantes.length; i++) {
			if(i == consonanteNro5) {
				consonanteRandom5 = consonantes[i];
			}
		}
		for(int i=0; i<consonantes.length; i++) {
			if(i == consonanteNro6) {
				consonanteRandom6 = consonantes[i];
			}
		}
		
		setBackground(new Color(aleatorio1, aleatorio2, aleatorio3));
		System.out.println("El color RGB de la ventana nueva es: " + aleatorio1 + " " + aleatorio2 + " " + aleatorio3);
		System.out.println("Letras aleatorias: " + vocalRandom1 + consonanteRandom1 + vocalRandom2 + consonanteRandom2 + vocalRandom3);
		
		setLayout(new GridBagLayout());
		
		add(nombre = new JLabel(vocalRandom1 + consonanteRandom1 + vocalRandom2 + consonanteRandom2 + vocalRandom3));
		nombre.setFont(new Font("Roboto", Font.PLAIN, 24));
	}
}





























