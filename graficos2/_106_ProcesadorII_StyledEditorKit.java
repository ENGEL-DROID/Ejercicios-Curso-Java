package graficos2;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class _106_ProcesadorII_StyledEditorKit {

	public static void main(String[] args) {

		Marco_ProcesadorII_Styled ventana = new Marco_ProcesadorII_Styled();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco_ProcesadorII_Styled extends JFrame {
	
	public Marco_ProcesadorII_Styled() {
		setSize(600, 300);
		setTitle(" Procesador de Texto");
		setLocationRelativeTo(null);
		
		add(new Ventana_ProcesadorII_Styled());
		
		setVisible(true);
	}
}

class Ventana_ProcesadorII_Styled extends JPanel {
	
	JPanel laminaSup;
	JMenuBar barraMenu;
	JMenu fuente, estilo, tamanio;
	JMenuItem arial, courier, verdana, negrita, cursiva, tam12, tam16, tam20, tam24;
	JTextPane textArea;
	JScrollPane vistaScroll;
	String fuentex = "Arial";
	int estilox = 0;
	int tamaniox = 16;
	String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

	public Ventana_ProcesadorII_Styled() {
		
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
		
		tamanio.add(tam12 = new JMenuItem("12"));
		tamanio.add(tam16 = new JMenuItem("16"));
		tamanio.add(tam20 = new JMenuItem("20"));
		tamanio.add(tam24 = new JMenuItem("24"));
		
		// --------------TEXT AREA--------------------------------
		
		add(textArea = new JTextPane(), BorderLayout.CENTER);
		textArea.setText(texto);
		textArea.setFont(new Font(fuentex, estilox, tamaniox));
		add(vistaScroll = new JScrollPane(textArea));
		
		// --------------LISTENERS--------------------------------
		
		arial.addActionListener(new StyledEditorKit.FontFamilyAction(null, "Arial"));
		courier.addActionListener(new StyledEditorKit.FontFamilyAction(null, "Courier"));
		verdana.addActionListener(new StyledEditorKit.FontFamilyAction(null, "Verdana"));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		
		tam12.addActionListener(new StyledEditorKit.FontSizeAction(null, 12));
		tam16.addActionListener(new StyledEditorKit.FontSizeAction(null, 16));
		tam20.addActionListener(new StyledEditorKit.FontSizeAction(null, 20));
		tam24.addActionListener(new StyledEditorKit.FontSizeAction(null, 24));
	}
}




























