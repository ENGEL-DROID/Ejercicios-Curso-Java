package graficos2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class _111_BarraHerramientas {

	public static void main(String[] args) {

		Marco_111 marco = new Marco_111();
	}
}

class Marco_111 extends JFrame {
	
	public Marco_111() {
		setSize(500, 400);
		setLocationRelativeTo(null);
		setTitle(" Barra Herramientas");
		
		Lamina_111 lamina = new Lamina_111();
		add(lamina);
		
		setJMenuBar(lamina.barra);   // OJO: el método setMenuBar() se utiliza únicamente en un JFrame
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Lamina_111 extends JPanel {
	
	JMenuBar barra;
	JMenu menu;
	JToolBar toolBar;
	
	public Lamina_111() {
		
		setLayout(new BorderLayout());   // OJO: cuando se instancia en un JPanel es importante establecer el Layout
		
		Action accionAmarillo = new AccionMenuItems("Amarillo", new ImageIcon("src/images/amarillo.png"), Color.YELLOW);   // Se deben instanciar objetos del tipo Action
		Action accionAzul = new AccionMenuItems("Azul", new ImageIcon("src/images/azul.png"), Color.BLUE);
		Action accionRojo = new AccionMenuItems("Rojo", new ImageIcon("src/images/rojo.png"), Color.RED);
		
		Action btnSalir = new AbstractAction("Salir", new ImageIcon("src/images/exit.png")) {  // Se crea una clase Anónima que instancia a AbstractAction
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		
		barra = new JMenuBar();
		barra.add(menu = new JMenu("Color"));
		
		menu.add(accionAmarillo);   // OJO: aquí se debe agregar add(Action) para agregar la Acción creada arriba en lugar de un Menú Item
		menu.add(accionAzul);
		menu.add(accionRojo);
		
		add(toolBar = new JToolBar(), BorderLayout.NORTH);   // OJO: es importante agregarle la ubicación BorderLayout.X para que la barra de herramientas se pueda desplazar por la ventana
		toolBar.add(accionAmarillo);
		toolBar.add(accionAzul);
		toolBar.add(accionRojo);
		toolBar.addSeparator();
		toolBar.add(btnSalir);
		
	}
	
	private class AccionMenuItems extends AbstractAction {
		
		public AccionMenuItems(String nombre, Icon icono, Color color) {
			putValue(NAME, nombre);
			putValue(SMALL_ICON, icono);
			putValue("Color", color);
			putValue(SHORT_DESCRIPTION, "Cambia el fondo a color " + nombre);
		}
		
		public void actionPerformed(ActionEvent e) {
			Color color = (Color) getValue("Color");
			setBackground(color);
		}
	}
}