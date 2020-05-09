package graficos2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _118_LibreDisposicion {

	public static void main(String[] args) {

		MarcoDisposicion marco = new MarcoDisposicion();
	}
}

class MarcoDisposicion extends JFrame {
	
	public MarcoDisposicion() {

		setSize(600, 500);
		setTitle("  Disposición Libre");
		setLocationRelativeTo(null);
		
		add(new VentanDisposicion());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanDisposicion extends JPanel {
	
	JLabel txtNombre, txtApellido;
	JTextField fieldNombre, fieldApellido;
	JButton btnEnviar;
	
	public VentanDisposicion() {

		setLayout(null);  // OJO: para trabajar con layouts libres es Indispensable poner null el layout de la lámina por defecto
		
		add(txtNombre = new JLabel("Nombre"));
		add(txtApellido = new JLabel("Apellido"));
		add(fieldNombre = new JTextField());
		add(fieldApellido = new JTextField());
		add(btnEnviar = new JButton("Enviar"));
		
		txtNombre.setBounds(150, 100, 100, 30);
		txtApellido.setBounds(150, 200, 100, 30);
		fieldNombre.setBounds(250, 100, 200, 30);
		fieldApellido.setBounds(250, 200, 200, 30);
		btnEnviar.setBounds(250, 300, 200, 30);
	}
}
































