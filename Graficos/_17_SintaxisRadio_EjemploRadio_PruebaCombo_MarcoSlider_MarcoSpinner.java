package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class _17_SintaxisRadio_EjemploRadio_PruebaCombo_MarcoSlider_MarcoSpinner {

	public static void main(String[] args) {

		Marco17 ventana = new Marco17();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco17 extends JFrame {
	
	Color fondo1 = new Color(179, 255, 224);
	
	public Marco17() {
		
		setSize(1000, 900);
		setTitle(" Ejercicio 3.17");
		setLocationRelativeTo(null);
		getContentPane().setBackground(fondo1);
		
		setLayout(new BorderLayout());
		
		// -----------Espacios en los Bordes-----------------
		add(new JLabel("         "), BorderLayout.NORTH);
		add(new JLabel("         "), BorderLayout.SOUTH);
		add(new JLabel("         "), BorderLayout.EAST);
		add(new JLabel("         "), BorderLayout.WEST);
		// -----------Espacios en los Bordes-----------------

		add(new Ventana17(fondo1), BorderLayout.CENTER);
		
		setVisible(true);
	}
}

class Ventana17 extends JPanel {
	
	JPanel lamina1, lamina2, laminaGrid, laminaGroup1, laminaGroup2, laminaSeparator, laminaSpinners;
	JLabel texto1, texto2;
	JRadioButton radioPequeño, radioMediano, radioGrande, radioMuyGrande, radioNegrita, radioCursiva, radioNormal;
	JComboBox comboFuentes;
	JSlider slider;
	JSpinner spinnerFuente, spinnerTamanio;
	String fuentes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	String fuenteTipo = "Arial";
	int fuenteFormat = 0;
	int fuenteSize = 30;

	public Ventana17(Color fondo1) {
		
		setBackground(fondo1);
		add(laminaGrid = new JPanel());
		laminaGrid.setLayout(new GridLayout(2,1));
		
		// -------------LÁMINA 1-------------------------------------------
		laminaGrid.add(lamina1 = new JPanel());
		lamina1.setPreferredSize(new Dimension(800,200));
		lamina1.setLayout(new GridLayout(2,1));
		lamina1.setBackground(fondo1);
		
		// -------------TEXTO PRINCIPAL-------------------------------------------
		lamina1.add(texto1 = new JLabel("\"Todo es un pensamiento.\""));
		texto1.setFont(new Font(fuenteTipo, fuenteFormat, fuenteSize));
		texto1.setHorizontalAlignment(JLabel.CENTER);
		lamina1.add(texto2 = new JLabel("Buda               "));
		texto2.setFont(new Font("Arial", Font.PLAIN, 22));
		texto2.setHorizontalAlignment(JLabel.RIGHT);
		
		// -------------LÁMINA 2-------------------------------------------
		laminaGrid.add(lamina2 = new JPanel());
		lamina2.setLayout(new GridLayout(9,1));
		
		// -------------GRUPO 1 RADIOS-------------------------------------------
		lamina2.add(laminaGroup1 = new JPanel());
		laminaGroup1.add(radioPequeño = new JRadioButton("Pequeña", false));
		laminaGroup1.add(radioMediano = new JRadioButton("Mediana", true));
		laminaGroup1.add(radioGrande = new JRadioButton("Grande", false));
		laminaGroup1.add(radioMuyGrande = new JRadioButton("Muy Grande", false));

		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(radioPequeño);
		grupo1.add(radioMediano);
		grupo1.add(radioGrande);
		grupo1.add(radioMuyGrande);
		
		lamina2.add(laminaSeparator = new JPanel());
		laminaSeparator.add(new JLabel("                 "));
		laminaSeparator.add(new JLabel("                 "));
		
		// -------------GRUPO 2 RADIOS-------------------------------------------
		lamina2.add(laminaGroup2 = new JPanel());
		laminaGroup2.add(radioNegrita = new JRadioButton("Negrita", false));
		laminaGroup2.add(radioCursiva = new JRadioButton("Cursiva", false));
		laminaGroup2.add(radioNormal = new JRadioButton("Normal", true));
		
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(radioNegrita);
		grupo2.add(radioCursiva);
		grupo2.add(radioNormal);
		
		lamina2.add(laminaSeparator = new JPanel());
		laminaSeparator.add(new JLabel("                 "));
		
		// -------------SPINNERS-------------------------------------------
		lamina2.add(laminaSpinners = new JPanel());
		laminaSpinners.add(spinnerFuente = new JSpinner(new SpinnerListModel(fuentes)));
		spinnerFuente.setPreferredSize(new Dimension(150,30));
		
		laminaSpinners.add(spinnerTamanio = new JSpinner(new SpinnerNumberModel(30, 10, 60, 2)));
		spinnerTamanio.setPreferredSize(new Dimension(50,30));
		
		lamina2.add(laminaSeparator = new JPanel());
		laminaSeparator.add(new JLabel("                 "));
		
		// -------------SLIDER-------------------------------------------
		lamina2.add(slider = new JSlider(10, 60, 30));
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		lamina2.add(laminaSeparator = new JPanel());
		laminaSeparator.add(new JLabel("                 "));
		
		// -------------COMBOBOX-------------------------------------------
		lamina2.add(comboFuentes = new JComboBox());
		for (int i = 0; i < fuentes.length; i++) {
			comboFuentes.addItem(fuentes[i]);
		}
		
		// -------------OYENTES-------------------------------------------
		ActionOyente oyenteAction = new ActionOyente();
		
		radioPequeño.addActionListener(oyenteAction);
		radioMediano.addActionListener(oyenteAction);
		radioGrande.addActionListener(oyenteAction);
		radioMuyGrande.addActionListener(oyenteAction);
		radioNegrita.addActionListener(oyenteAction);
		radioCursiva.addActionListener(oyenteAction);
		radioNormal.addActionListener(oyenteAction);
		comboFuentes.addActionListener(oyenteAction);
		
		ChangeOyente oyenteChange = new ChangeOyente();
		
		slider.addChangeListener(oyenteChange);
		spinnerFuente.addChangeListener(oyenteChange);
		spinnerTamanio.addChangeListener(oyenteChange);
	}
	
	// -------------OYENTES ACTION-----------------------------------------
	class ActionOyente implements ActionListener {
		
		public ActionOyente() {
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == comboFuentes) fuenteTipo = (String)comboFuentes.getSelectedItem();
			
			if (radioNegrita.isSelected()) fuenteFormat = 1;
			if (radioCursiva.isSelected()) fuenteFormat = 2;
			if (radioNormal.isSelected()) fuenteFormat = 0;
			
			if (radioPequeño.isSelected()) fuenteSize = 20;
			if (radioMediano.isSelected()) fuenteSize = 30;
			if (radioGrande.isSelected()) fuenteSize = 40;
			if (radioMuyGrande.isSelected()) fuenteSize = 50;
			
			texto1.setFont(new Font(fuenteTipo, fuenteFormat, fuenteSize));
		}
	}
	
	// -------------OYENTES CHANGE-------------------------------------------
	class ChangeOyente implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {

			if (e.getSource() == slider) fuenteSize = (int) slider.getValue();
			if (e.getSource() == spinnerTamanio) fuenteSize = (int) spinnerTamanio.getValue();
			if (e.getSource() == spinnerFuente) fuenteTipo = (String) spinnerFuente.getValue();
			
			texto1.setFont(new Font(fuenteTipo, fuenteFormat, fuenteSize));
		}
	}
}

































