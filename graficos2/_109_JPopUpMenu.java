package graficos2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class _109_JPopUpMenu {

	public static void main(String[] args) {

		Marco_Procesador_109 ventana = new Marco_Procesador_109();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco_Procesador_109 extends JFrame {
	
	public Marco_Procesador_109() {
		setSize(600, 300);
		setTitle(" Menú con Icono");
		setLocationRelativeTo(null);
		
		add(new Ventana_Procesador_109());
		
		setVisible(true);
	}
}

class Ventana_Procesador_109 extends JPanel {
	
	JPanel laminaSup;
	JMenuBar barraMenu;
	JMenu fuente, estilo, tamanio;
	JMenuItem arial, courier, verdana;
	JCheckBoxMenuItem negrita, cursiva;
	JRadioButtonMenuItem tam12, tam16, tam20, tam24;
	JTextPane textArea;
	JScrollPane vistaScroll;
	JPopupMenu menuPop;
	JToolBar toolBar;
	JButton btnNegrita, btnCursiva, btnSubrayar;
	String fuentex = "Arial";
	int estilox = 0;
	int tamaniox = 16;
	String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

	public Ventana_Procesador_109() {
		
		setLayout(new BorderLayout());
		
		add(laminaSup = new JPanel(), BorderLayout.NORTH);
		
		laminaSup.add(barraMenu = new JMenuBar());
		
		barraMenu.add(fuente = new JMenu("Fuente"));
		barraMenu.add(estilo = new JMenu("Estilo"));
		barraMenu.add(tamanio = new JMenu("Tamaño"));
		
		MenuItems menuItems = new MenuItems();
		
		fuente.add(menuItems.ArialItem());
		fuente.add(menuItems.CourierItem());
		fuente.add(menuItems.VerdanaItem());
		
		// --------------MENÚ ITEM CON CHECKBOX--------------------------------
		estilo.add(menuItems.NegritaItem());
		estilo.add(menuItems.CursivaItem());
		
		// --------------MENÚ ITEM CON RADIOBUTTON--------------------------------
		tamanio.add(menuItems.tam12_Item());
		tamanio.add(menuItems.tam16_Item());
		tamanio.add(menuItems.tam20_Item());
		tamanio.add(menuItems.tam24_Item());
		
		menuItems.RadioBoxGroup();
		
		// --------------TEXT AREA--------------------------------
		add(textArea = new JTextPane());
		textArea.setText(texto);
		textArea.setFont(new Font(fuentex, estilox, tamaniox));
		add(vistaScroll = new JScrollPane(textArea));
		
		ClaseOyente oyentes1 = new ClaseOyente();
		
		// --------------MENÚ POPUP--------------------------------
		menuPop = new JPopupMenu();
		menuPop.add(menuItems.ArialItem());
		menuPop.add(menuItems.CourierItem());
		menuPop.add(menuItems.VerdanaItem());
		menuPop.add(menuItems.NegritaItem());
		menuPop.add(menuItems.CursivaItem());
		menuPop.add(menuItems.tam12_Item());
		menuPop.add(menuItems.tam16_Item());
		menuPop.add(menuItems.tam20_Item());
		menuPop.add(menuItems.tam24_Item());
		textArea.setComponentPopupMenu(menuPop);
		
		ClaseOyente oyentes2 = new ClaseOyente(); // Se repite la clase oyente para q actúe en el menú emergente
		
		menuItems.RadioBoxGroup(); // Se repite el grupo de botones radiobox para q actúe en el menú emergente
		
		// ------------------------BARRA DE HERRAMIENTAS-----------------------------------------
		add(toolBar = new JToolBar(), BorderLayout.WEST);
		toolBar.setOrientation(1);   // OJO: con el método setOrientation(1) se stablece la barra en forma vertical
		
		toolBar.add(btnNegrita = new JButton(new ImageIcon("src/images/bold.png")));
		toolBar.add(btnCursiva = new JButton(new ImageIcon("src/images/italic.png")));
		toolBar.add(btnSubrayar = new JButton(new ImageIcon("src/images/underline.png")));
		
		btnNegrita.addActionListener(new StyledEditorKit.BoldAction());
		btnCursiva.addActionListener(new StyledEditorKit.ItalicAction());
		btnSubrayar.addActionListener(new StyledEditorKit.UnderlineAction());
	}
	
	
	
	private class ClaseOyente {
		public ClaseOyente() {
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
	
	
	
	private class MenuItems {
		//------------------------------FONTS ITEMS----------------------------------------------
		private JMenuItem ArialItem() {
			return arial = new JMenuItem("Arial", new ImageIcon("src/images/tipo.png"));		
		}
		private JMenuItem CourierItem() {
			return courier = new JMenuItem("Courier", new ImageIcon("src/images/tipo.png"));		
		}
		private JMenuItem VerdanaItem() {
			return verdana = new JMenuItem("Verdana", new ImageIcon("src/images/tipo.png"));		
		}
		
		//------------------------------STYLE ITEMS----------------------------------------------
		private JCheckBoxMenuItem NegritaItem() {
			negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/images/style.png"));
			negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
			return negrita;
		}
		private JCheckBoxMenuItem CursivaItem() {
			cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/images/style.png"));
			cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
			return cursiva;
		}
		
		//------------------------------SIZE ITEMS----------------------------------------------
		private JRadioButtonMenuItem tam12_Item() {
			tam12 = new JRadioButtonMenuItem("12", new ImageIcon("src/images/fontSize.png"));
			tam12.setSelected(false);
			return tam12;
		}
		private JRadioButtonMenuItem tam16_Item() {
			tam16 = new JRadioButtonMenuItem("16", new ImageIcon("src/images/fontSize.png"));
			tam16.setSelected(true);
			return tam16;
		}
		private JRadioButtonMenuItem tam20_Item() {
			tam20 = new JRadioButtonMenuItem("20", new ImageIcon("src/images/fontSize.png"));
			tam20.setSelected(false);
			return tam20;
		}
		private JRadioButtonMenuItem tam24_Item() {
			tam24 = new JRadioButtonMenuItem("24", new ImageIcon("src/images/fontSize.png"));
			tam24.setSelected(false);
			return tam24;
		}
		
		//------------------------------RADIOBOX GROUP----------------------------------------------
		private ButtonGroup RadioBoxGroup() {
			ButtonGroup grupoRadioBox = new ButtonGroup();
			grupoRadioBox.add(tam12);
			grupoRadioBox.add(tam16);
			grupoRadioBox.add(tam20);
			grupoRadioBox.add(tam24);
			return grupoRadioBox;
		}
	}
}



























