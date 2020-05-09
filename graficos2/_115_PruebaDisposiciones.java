package graficos2;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _115_PruebaDisposiciones {

	public static void main(String[] args) {

		MarcoCaja marco = new MarcoCaja();
	}
}

class MarcoCaja extends JFrame {
	
	 public MarcoCaja() {
		 
		 setSize(300, 350);
		 setTitle("  Disposiciones Box");
		 setLocationRelativeTo(null);
		 
		 add(new LaminaCaja());
		 
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}

class LaminaCaja extends JPanel {
	
	JLabel txt1, txt2;
	JTextField field1, field2;
	JButton btn1, btn2;
	
	public LaminaCaja() {
		
		// ---------------------------1 PRIMERA CAJA HORIZONTAL-----------------------------------------
		
		Box cajaH1 = Box.createHorizontalBox();  // OJO: se crea una caja horizontal del tipo Box
		cajaH1.add(txt1 = new JLabel("Nombre"));  // OJO: se agrega el primer objeto
		txt1.setMaximumSize(txt1.getPreferredSize());  // OJO: se establece el tamaño máximo del objeto
		cajaH1.add(Box.createHorizontalStrut(10));  // OJO: se agrega un espacio vacío de 10px
		cajaH1.add(field1 = new JTextField(10));  // OJO: se agrega el segundo objeto a la caja Box
		
		
		// ---------------------------2 SEGUNDA CAJA HORIZONTAL-----------------------------------------
		
		Box cajaH2 = Box.createHorizontalBox();  // OJO: se crea una caja horizontal del tipo Box
		cajaH2.add(txt2 = new JLabel("Email"));  // OJO: se agrega el primer objeto
		txt2.setMaximumSize(txt2.getPreferredSize());  // OJO: se establece el tamaño máximo del objeto
		cajaH2.add(Box.createHorizontalStrut(10));  // OJO: se agrega un espacio vacío de 10px
		cajaH2.add(field2 = new JTextField(10));  // OJO: se agrega el segundo objeto a la caja Box
		
		
		// --------------------------3 TERCERA CAJA HORIZONTAL-----------------------------------------
		
		Box cajaH3 = Box.createHorizontalBox();  // OJO: se crea una caja horizontal del tipo Box
		cajaH3.add(btn1 = new JButton("Ok"));  // OJO: se agrega el primer objeto
		cajaH3.add(Box.createGlue());  // OJO: se agrega un espacio vacío de 10px
		cajaH3.add(btn2 = new JButton("Cancelar"));  // OJO: se agrega el segundo objeto a la caja Box
		
		
		// ---------------------------CAJA VERTICAL PRINCIPAL-----------------------------------------
		Box cajaV = Box.createVerticalBox();  // OJO: se crea la caja vertical que va a contener todas las cajas horizontales
		cajaV.add(Box.createVerticalStrut(50));  // Espacio vertical vacío
		cajaV.add(cajaH1);  // OJO: se agregan a la caja vertical cada caja horizontal
		cajaV.add(Box.createVerticalStrut(50));
		cajaV.add(cajaH2);
		cajaV.add(Box.createVerticalStrut(50));
		cajaV.add(cajaH3);
		cajaV.add(Box.createVerticalStrut(50));
		
		add(cajaV);  // OJO: finalmente se agrega la caja vertical a la lámina
	}
}
