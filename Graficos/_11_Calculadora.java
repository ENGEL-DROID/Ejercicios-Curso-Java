package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class _11_Calculadora {

	public static void main(String[] args) {

		Ventana11 ventana = new Ventana11();
	}
}

class Ventana11 extends JFrame {
	
	public Ventana11() {
		setTitle(" Calculadora");
		setSize(300, 350);
		setLocationRelativeTo(null);
		
		add(new Lamina11());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Lamina11 extends JPanel {
	
	JPanel lamina1, lamina2;
	JButton display, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnSum, btnRes, btnMul, btnDiv, btnClr, btnEqu;
	
	public Lamina11() {
		setLayout(new BorderLayout());
		
		add(lamina1 = new JPanel(), BorderLayout.NORTH);
		lamina1.setLayout(new BorderLayout());
		lamina1.add(display = new JButton("0"));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Arial", Font.PLAIN, 24));
		display.setPreferredSize(new Dimension(300,80));
		display.setEnabled(false);
		
		add(lamina2 = new JPanel(), BorderLayout.CENTER);
		lamina2.setLayout(new GridLayout(4,4));
		lamina2.add(btn1 = new JButton("1"));
		lamina2.add(btn2 = new JButton("2"));
		lamina2.add(btn3 = new JButton("3"));
		lamina2.add(btnSum = new JButton("+"));
		lamina2.add(btn4 = new JButton("4"));
		lamina2.add(btn5 = new JButton("5"));
		lamina2.add(btn6 = new JButton("6"));
		lamina2.add(btnRes = new JButton("-"));
		lamina2.add(btn7 = new JButton("7"));
		lamina2.add(btn8 = new JButton("8"));
		lamina2.add(btn9 = new JButton("9"));
		lamina2.add(btnMul = new JButton("*"));
		lamina2.add(btnClr = new JButton("clr"));
		lamina2.add(btn0 = new JButton("0"));
		lamina2.add(btnEqu = new JButton("="));
		lamina2.add(btnDiv = new JButton("/"));
		
		OyenteNumeros oyenteNro = new OyenteNumeros();
		
		btn1.addActionListener(oyenteNro);
		btn2.addActionListener(oyenteNro);
		btn3.addActionListener(oyenteNro);
		btn4.addActionListener(oyenteNro);
		btn5.addActionListener(oyenteNro);
		btn6.addActionListener(oyenteNro);
		btn7.addActionListener(oyenteNro);
		btn8.addActionListener(oyenteNro);
		btn9.addActionListener(oyenteNro);
		btn0.addActionListener(oyenteNro);
		
		OyenteOperandos oyenteOperando = new OyenteOperandos();
		
		btnSum.addActionListener(oyenteOperando);
		btnRes.addActionListener(oyenteOperando);
		btnMul.addActionListener(oyenteOperando);
		btnDiv.addActionListener(oyenteOperando);
		btnClr.addActionListener(oyenteOperando);
		btnEqu.addActionListener(oyenteOperando);
		
		btn1.setBackground(new Color(230, 255, 204));
		btn2.setBackground(new Color(230, 255, 204));
		btn3.setBackground(new Color(230, 255, 204));
		btn4.setBackground(new Color(230, 255, 204));
		btn5.setBackground(new Color(230, 255, 204));
		btn6.setBackground(new Color(230, 255, 204));
		btn7.setBackground(new Color(230, 255, 204));
		btn8.setBackground(new Color(230, 255, 204));
		btn9.setBackground(new Color(230, 255, 204));
		btn0.setBackground(new Color(230, 255, 204));
		
		btnSum.setBackground(new Color(230, 204, 255));
		btnRes.setBackground(new Color(230, 204, 255));
		btnMul.setBackground(new Color(230, 204, 255));
		btnDiv.setBackground(new Color(230, 204, 255));
		btnClr.setBackground(new Color(230, 204, 255));
		btnEqu.setBackground(new Color(230, 204, 255));
	}
	
	class OyenteNumeros implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton btnNro = (JButton) e.getSource();
			double nro = Double.parseDouble(btnNro.getText());
			
			if(display.getText() == "0") {
				display.setText("");
				display.setText(btnNro.getText());
			} else {
				display.setText(display.getText() + btnNro.getText());
			}
		}
	}
	
	class OyenteOperandos implements ActionListener {
		
		double resultado = 0;
		String simbolo = "";

		@Override
		public void actionPerformed(ActionEvent e) {

			JButton operandoBtn = (JButton) e.getSource();
			String operando = operandoBtn.getText();
			
			if(operando.equals("+")) {
				resultado = resultado + Double.parseDouble(display.getText());
				display.setText("0");
				simbolo = "+";
			}
			if(operando.equals("-")) {
				if(resultado == 0) {
					resultado = Double.parseDouble(display.getText());
					display.setText("0");
					simbolo = "-";
				} else {
					resultado = resultado - Double.parseDouble(display.getText());
					display.setText("0");
					simbolo = "-";
				}
			}
			if(operando.equals("*")) {
				if(resultado == 0) {
					resultado = (resultado+1) * Double.parseDouble(display.getText());
					display.setText("0");
					simbolo = "*";
				} else {
					resultado = resultado * Double.parseDouble(display.getText());
					display.setText("0");
					simbolo = "*";
				}
			}
			if(operando.equals("/")) {
				if(resultado == 0) {
					resultado = Double.parseDouble(display.getText());
					display.setText("0");
					simbolo = "/";
				} else {
					resultado = resultado / Double.parseDouble(display.getText());
					display.setText("0");
					simbolo = "/";
				}
			}
			
			if(operando.equals("=")) {
				if(simbolo.equals("+")) {
					resultado = resultado + Double.parseDouble(display.getText());
					display.setText(String.valueOf(resultado));
					resultado = 0;
				}
				if(simbolo.equals("-")) {
					resultado = resultado - Double.parseDouble(display.getText());
					display.setText(String.valueOf(resultado));
					resultado = 0;
				}
				if(simbolo.equals("*")) {
					resultado = resultado * Double.parseDouble(display.getText());
					display.setText(String.valueOf(resultado));
					resultado = 0;
				}
				if(simbolo.equals("/")) {
					resultado = resultado / Double.parseDouble(display.getText());
					display.setText(String.valueOf(resultado));
					resultado = 0;
				}
			}
			
			if(operando.equals("clr")) {
				resultado = 0;
				display.setText("0");
				simbolo = " ";
			}
		}
	}
}

























