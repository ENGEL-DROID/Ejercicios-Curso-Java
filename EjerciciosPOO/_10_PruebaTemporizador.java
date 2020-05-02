package EjerciciosPOO;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class _10_PruebaTemporizador {

	public static void main(String[] args) {
		
		Accion accion = new Accion();
		
		Timer temporizador = new Timer(3000, accion);
		
		temporizador.start();
		
		JOptionPane.showMessageDialog(null, "Para desactivar el sonido oprima el botón OK");
		
		System.exit(0);
	}
}

class Accion implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date hora = new Date();
		
		System.out.println("Te muestro la hora cada cierto tiempo: " + hora);
		
		Toolkit.getDefaultToolkit().beep();			
	}
}
















