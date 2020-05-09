package graficos2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class _101_ProcesadorII {

	public static void main(String[] args) {

		Marco_ProcesadorII ventana = new Marco_ProcesadorII();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco_ProcesadorII extends JFrame {
	
	public Marco_ProcesadorII() {
		setSize(600, 300);
		setTitle(" Procesador de Texto");
		setLocationRelativeTo(null);
		
		add(new Ventana_ProcesadorII());
		
		setVisible(true);
	}
}

class Ventana_ProcesadorII extends JPanel {
	
	JPanel laminaSup;
	JMenuBar barraMenu;
	JMenu fuente, estilo, tamanio;
	JMenuItem arial, courier, verdana, negrita, cursiva, normal, tam12, tam16, tam20, tam24;
	JTextPane textArea;
	JScrollPane vistaScroll;
	String fuentex = "Arial";
	int estilox = 0;
	int tamaniox = 16;
	String texto = "Pensamientos de Buda: \n- Cuida el exterior tanto como el interior, porque todo es uno. \n- La reflexión es el camino hacia la inmortalidad, la falta de reflexión, el camino hacia la muerte. \n- No lastimes a los demás con lo que te causa dolor a ti mismo. \n- Alégrate porque todo lugar es aquí y todo momento es ahora. \n- El odio no disminuye con el odio. El odio disminuye con el amor. \n- El dolor es inevitable, pero el sufrimiento es opcional.";

	public Ventana_ProcesadorII() {
		
		setLayout(new BorderLayout());
		
		add(laminaSup = new JPanel(), BorderLayout.NORTH);
		
		laminaSup.add(barraMenu = new JMenuBar());
		
		barraMenu.add(fuente = new JMenu("Fuente"));
		barraMenu.add(estilo = new JMenu("Estilo"));
		barraMenu.add(tamanio = new JMenu("Tamaño"));
		
		fuente.add(arial = new JMenuItem("Arial"));
		fuente.add(courier = new JMenuItem("Courier"));
		fuente.add(verdana = new JMenuItem("Verdana"));
		
		estilo.add(negrita = new JMenuItem("Negrita"));
		estilo.add(cursiva = new JMenuItem("Cursiva"));
		estilo.add(normal = new JMenuItem("Normal"));
		
		tamanio.add(tam12 = new JMenuItem("12"));
		tamanio.add(tam16 = new JMenuItem("16"));
		tamanio.add(tam20 = new JMenuItem("20"));
		tamanio.add(tam24 = new JMenuItem("24"));
		
		// --------------TEXT AREA--------------------------------
		
		add(textArea = new JTextPane(), BorderLayout.CENTER);
		textArea.setText(texto);
		add(vistaScroll = new JScrollPane(textArea));
		textArea.setFont(new Font(fuentex, estilox, tamaniox));
		
		// --------------LISTENERS--------------------------------
		
		AccionOyente oyente = new AccionOyente();
		
		arial.addActionListener(oyente);
		courier.addActionListener(oyente);
		verdana.addActionListener(oyente);
		
		negrita.addActionListener(oyente);
		cursiva.addActionListener(oyente);
		normal.addActionListener(oyente);
		
		tam12.addActionListener(oyente);
		tam16.addActionListener(oyente);
		tam20.addActionListener(oyente);
		tam24.addActionListener(oyente);
	}
	
	class AccionOyente implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
//
			if(e.getSource() == arial) fuentex = arial.getText();
			if(e.getSource() == courier) fuentex = courier.getText();
			if(e.getSource() == verdana) fuentex = verdana.getText();
			
			if(e.getSource() == negrita) estilox += 1;
			else if(e.getSource() == cursiva) estilox += 2;
			else if(e.getSource() == normal) estilox = 0;
			
			if(e.getSource() == tam12) tamaniox = Integer.parseInt(tam12.getText());
			if(e.getSource() == tam16) tamaniox = Integer.parseInt(tam16.getText());
			if(e.getSource() == tam20) tamaniox = Integer.parseInt(tam20.getText());
			if(e.getSource() == tam24) tamaniox = Integer.parseInt(tam24.getText());
			
			textArea.setFont(new Font(fuentex, estilox, tamaniox));
		}
	}
}




























