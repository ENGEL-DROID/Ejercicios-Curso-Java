package graficos2;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _119_PlantillasPersonalizadas {

	public static void main(String[] args) {

		MarcoDisposicion_119 marco = new MarcoDisposicion_119();
	}
}

class MarcoDisposicion_119 extends JFrame {
	
	public MarcoDisposicion_119() {

		setSize(400, 300);
		setTitle("  Plantillas personalizadas");
		setLocationRelativeTo(null);
		
		add(new VentanDisposicion_119());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanDisposicion_119 extends JPanel {
	
	private JLabel txtNombre, txtApellido;
	private JTextField fieldNombre, fieldApellido;
	private JButton btnEnviar;
	
	public VentanDisposicion_119() {

		setLayout(new EnColumnas());  // OJO: se utiliza la clase creada más abajo del tipo LayoutManager para establecer el orden de disposición de los elementos en la lámina
		
		add(txtNombre = new JLabel("Nombre"));
		add(fieldNombre = new JTextField());
		add(txtApellido = new JLabel("Apellido"));
		add(fieldApellido = new JTextField());
		add(btnEnviar = new JButton("Enviar"));
	}
}

class EnColumnas implements LayoutManager {  // La Interface LayoutManager es la que permite crear Layouts Personalizados
	
	private int x;  // se crean las variables de las posiciones iniciales
	private int y;

	@Override
	public void layoutContainer(Container parent) {   // en la videoclase del curso Juan a cambiado "parent" por "micontenedor"
		
		x = parent.getWidth() / 2;   // con el método getWidth() de Container se obtiene el Ancho de la lámina. Se divide en 2 para obtener el centro del eje de la misma
		y = 40;
		int contador = 0;  // variable para saber cuántos componentes se van a ir agregando
		
		int componentes = parent.getComponentCount();  // variable para determinar cuántos componentes hay agregados en la lámina. En la videoclase del curso Juan a utilizado "n" como nombre de la variable yo uso "componentes"
		
		for(int i=0; i<componentes; i++) {  // se recorren todos los componentes creados
			contador++;  // se incrementa el contador
			Component c = parent.getComponent(i);  // se obtiene cada componente agregado, uno por uno
			c.setBounds(x - 100, y, 100, 20);  // se ubica cada componente obtenido en la posición establecida. A x se le resta 100 que corresponde al ancho del componente
			x += 100;  // se incrementa el valor de x para las próximas posiciones de componenetes
			if(contador % 2 == 0) {  // se ubica el siguiente contenedor si es par. Si el residuo de la divición de contador entre 2 es cero se aumenta el valor de y para la posición del próximo componente
				x = parent.getWidth() / 2;
				y += 60;
			}
		}
	}
	
	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}
}






























