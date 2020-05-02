package Graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class _06_EventosFocoVentanaTeclado {

	public static void main(String[] args) {

		Marco6 ventana1 = new Marco6();
		Marco6New ventana2 = new Marco6New();
	}
}

class Marco6 extends JFrame {
	
	private String nombreVentana;
	
	public Marco6() {
		
		setBounds(200, 200, 500, 300);
		setTitle(" Ventana 1º");
		
		nombreVentana = this.getTitle();
		
		addWindowFocusListener(new EventosVentana(nombreVentana));
		addWindowListener(new EventosVentana(nombreVentana));
		addWindowStateListener(new EventosVentana(nombreVentana));
		
		addKeyListener(new EventosTeclado());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco6New extends JFrame  {
	
	private String nombreVentana;
	
	public Marco6New() {
		
		setBounds(900, 200, 500, 300);
		setTitle(" Ventana 2º");
		
		nombreVentana = this.getTitle();
		
		addWindowFocusListener(new EventosVentana(nombreVentana));
		addWindowListener(new EventosVentana(nombreVentana));
		addWindowStateListener(new EventosVentana(nombreVentana));
		
		addKeyListener(new EventosTeclado());
		
		setVisible(true);
	}
}

class EventosVentana extends WindowAdapter {
	
	String nombre;
	
	public EventosVentana(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("La Ventana se ha Activado " + nombre);
		super.windowActivated(e);
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("La Ventana se ha Desactivado" + nombre);
		super.windowDeactivated(e);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("La Ventana se ha Abierto" + nombre);
		super.windowOpened(e);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("La Ventana se está Cerrando" + nombre);
		super.windowClosing(e);
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("La Ventana se ha Cerrado" + nombre);
		super.windowClosed(e);
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("La Ventana se ha Minimizado" + nombre);
		super.windowIconified(e);
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("La Ventana se ha Maximizado" + nombre);
		super.windowDeiconified(e);
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
		System.out.println("La Ventana ha Ganado el Foco" + nombre);
		super.windowGainedFocus(e);
	}
	
	@Override
	public void windowLostFocus(WindowEvent e) {
		System.out.println("La Ventana ha Perdido el Foco" + nombre);
		super.windowLostFocus(e);
	}
	
	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("La Ventana ha Cambiado de Estado" + nombre);
		super.windowStateChanged(e);
	}
}


class EventosTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Se ha Tecleado la tecla: " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Se ha Presionado la tecla: " + e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Se ha Levantado la tecla: " + e.getKeyChar());
	}
}














