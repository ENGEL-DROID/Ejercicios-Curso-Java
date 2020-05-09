package graficos2;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class _107_MenuConImagen {

	public static void main(String[] args) {

		Marco_Procesador_107 ventana = new Marco_Procesador_107();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco_Procesador_107 extends JFrame {
	
	public Marco_Procesador_107() {
		setSize(600, 300);
		setTitle(" Menú con Icono");
		setLocationRelativeTo(null);
		
		add(new Ventana_Procesador_107());
		
		setVisible(true);
	}
}

class Ventana_Procesador_107 extends JPanel {
	
	JPanel laminaSup;
	JMenuBar barraMenu;
	JMenu fuente, estilo, tamanio;
	JMenuItem arial, courier, verdana;
	JCheckBoxMenuItem negrita, cursiva;
	JRadioButtonMenuItem tam12, tam16, tam20, tam24;
	JPopupMenu menuPop;
	ButtonGroup grupoRadioBox = new ButtonGroup();
	JTextPane textArea;
	JScrollPane vistaScroll;
	String fuentex = "Arial";
	int estilox = 0;
	int tamaniox = 16;
	String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

	public Ventana_Procesador_107() {
		
		setLayout(new BorderLayout());
		
		add(laminaSup = new JPanel(), BorderLayout.NORTH);
		
		laminaSup.add(barraMenu = new JMenuBar());
		
		barraMenu.add(fuente = new JMenu("Fuente"));
		barraMenu.add(estilo = new JMenu("Estilo"));
		barraMenu.add(tamanio = new JMenu("Tamaño"));
		
		fuente.add(arial = new JMenuItem("Arial", new ImageIcon("src/images/tipo.png")));
		fuente.add(courier = new JMenuItem("Courier", new ImageIcon("src/images/tipo.png")));
		fuente.add(verdana = new JMenuItem("Verdana", new ImageIcon("src/images/tipo.png")));
		
		// --------------MENÍ ITEM CON CHECKBOX--------------------------------
		
		estilo.add(negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/images/style.png")));
		estilo.add(cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/images/style.png")));
		
		// --------------MENÚ ITEM CON RADIOBUTTON--------------------------------
		
		tamanio.add(tam12 = new JRadioButtonMenuItem("12", new ImageIcon("src/images/fontSize.png")));
		tamanio.add(tam16 = new JRadioButtonMenuItem("16", new ImageIcon("src/images/fontSize.png")));
		tamanio.add(tam20 = new JRadioButtonMenuItem("20", new ImageIcon("src/images/fontSize.png")));
		tamanio.add(tam24 = new JRadioButtonMenuItem("24", new ImageIcon("src/images/fontSize.png")));
		
		grupoRadioBox.add(tam12);
		grupoRadioBox.add(tam16);
		grupoRadioBox.add(tam20);
		grupoRadioBox.add(tam24);
		
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




























