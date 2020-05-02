package Graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JFrame;

public class _07_EventosRaton extends JFrame {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame();
		
		ventana.setTitle(" Eventos del Ratón");
		ventana.setSize(500, 400);
		ventana.setLocationRelativeTo(null);
		
		ventana.addMouseListener(new AccionesRaton());
		ventana.addMouseMotionListener(new AccionesRaton());
		ventana.addMouseWheelListener(new AccionesRaton());
		
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class AccionesRaton extends MouseAdapter {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int boton = e.getButton();
		String click = "";
		if  (boton == 1) {
			click = "Click Izquierdo";
		} else if  (boton == 2) {
			click = "Rueda del Ratón";
		} else if  (boton == 3) {
			click = "Click Derecho";
		}
		int x = e.getX();
		int y = e.getY();
		System.out.println("Se ha hecho Click con: " + click + " en la coordenada: X=" + x + " Y=" + y);
		super.mouseClicked(e);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Se ha Arrastrado el ratón");
		super.mouseDragged(e);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("El ratón ha Entrado en la ventana");
		super.mouseEntered(e);
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("El ratón ha Salido de la ventana");
		super.mouseExited(e);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
//		System.out.println("Se ha Movido el ratón");
		super.mouseMoved(e);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Se ha Presionado el ratón");
		super.mousePressed(e);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Se ha Soltado la tecla del ratón");
		super.mouseReleased(e);
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("Se ha Movido la Rueda del ratón");
		super.mouseWheelMoved(e);
	}
	
}


