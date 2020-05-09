package graficos2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class _116_DisposicionMuelle {

	public static void main(String[] args) {

		MarcoMuelle marco = new MarcoMuelle();
	}
}

class MarcoMuelle extends JFrame {
	
	public MarcoMuelle() {

		setVisible(true);
		setSize(800, 300);
		setTitle("  Disposición Muelle");
		setLocationRelativeTo(null);
		
		add(new LaminaMuelle());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class LaminaMuelle extends JPanel {
	
	JButton btn1, btn2, btn3;
	SpringLayout miLayout;
	
	public LaminaMuelle() {
		
		setLayout(miLayout = new SpringLayout());  // OJO: se establece la disposición a tipo SpringLayout ó a tipo Muellle

		add(btn1 = new JButton("Botón 1"));
		add(btn2 = new JButton("Botón 2"));
		add(btn3 = new JButton("Botón 3"));
		
		Spring miMuelle = Spring.constant(0, 0, 10);  // OJO: se crea el Muelle por defecto con las medidas constantes, el cual se va a usar como parámetro en los constraints
		Spring muelleRigido = Spring.constant(30);  // OJO: un muelle rígido establece una distancia fija entre los objetos
		
		miLayout.putConstraint(SpringLayout.WEST, btn1, miMuelle, SpringLayout.WEST, this);  // OJO: se agregan los constraints al Layout de cada objeto (botón en este caso)
		miLayout.putConstraint(SpringLayout.WEST, btn2, muelleRigido, SpringLayout.EAST, btn1);  // OJO: se agregan los constraints al Layout de cada objeto (botón en este caso)
		miLayout.putConstraint(SpringLayout.WEST, btn3, muelleRigido, SpringLayout.EAST, btn2);  // OJO: se agregan los constraints al Layout de cada objeto (botón en este caso)
		miLayout.putConstraint(SpringLayout.EAST, this, miMuelle, SpringLayout.EAST, btn3);  // OJO: se agregan los constraints al Layout de cada objeto (botón en este caso)
		// NOTA: las medidas van siempre de la izquierda de cada elemento hacia la derecha del elemento anterior, se tienen en cuenta las medidas cardinales,
		// hay que tener mucho cuidado con las medidas del marco o lámina ya que pueden confundir
	}
}





























