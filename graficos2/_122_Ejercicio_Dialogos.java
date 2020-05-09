package graficos2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class _122_Ejercicio_Dialogos {

	public static void main(String[] args) {

		MarcoDialogos marco = new MarcoDialogos();
	}
}

class MarcoDialogos extends JFrame {
	
	public MarcoDialogos() {

		setSize(700, 500);
		setTitle("  Ejercicio Diálogos");
		setLocationRelativeTo(null);
		
		add(new LaminaDialogos());
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class LaminaDialogos extends JPanel {
	
	private JRadioButton 	radioTipo1, radioTipo2, radioTipo3, radioTipo4,
							radioTipoMnsj1, radioTipoMnsj2, radioTipoMnsj3, radioTipoMnsj4, radioTipoMnsj5,
							radioMnsj1, radioMnsj2, radioMnsj3, radioMnsj4, radioMnsj5,
							radioConfirm1, radioConfirm2, radioConfirm3, radioConfirm4,
							radioOpcion1, radioOpcion2, radioOpcion3,
							radioEntrada1, radioEntrada2;
	private ButtonGroup 	group1, group2, group3, group4, group5, group6;
	private Box				box1, box2, box3, box4, box5, box6,
							boxHorizontal1, boxHorizontal2, boxVertical;
	private JPanel			laminaBtn;
	private JButton			btn;
	
	public LaminaDialogos() {
		
		setLayout(new BorderLayout());
		
		// ------------------------BOX 1-----------------------------------
		box1 = Box.createVerticalBox();
		box1.setBorder(BorderFactory.createTitledBorder("Tipo"));
		box1.setPreferredSize(new Dimension(200,200));
		box1.setMinimumSize(new Dimension(200,200));
		box1.setMaximumSize(new Dimension(200,200));
		box1.add(radioTipo1 = new JRadioButton("Mensaje", true));
		box1.add(radioTipo2 = new JRadioButton("Confirmar", false));
		box1.add(radioTipo3 = new JRadioButton("Opción", false));
		box1.add(radioTipo4 = new JRadioButton("Entrada", false));
		group1 = new ButtonGroup();
		group1.add(radioTipo1);
		group1.add(radioTipo2);
		group1.add(radioTipo3);
		group1.add(radioTipo4);
		
		// ------------------------BOX 2-----------------------------------
		box2 = Box.createVerticalBox();
		box2.setBorder(BorderFactory.createTitledBorder("Tipo Mensaje"));
		box2.setPreferredSize(new Dimension(200,200));
		box2.setMinimumSize(new Dimension(200,200));
		box2.setMaximumSize(new Dimension(200,200));
		box2.add(radioTipoMnsj1 = new JRadioButton("ERROR_MESSAGE", true));
		box2.add(radioTipoMnsj2 = new JRadioButton("INFORMATION_MESSAGE", false));
		box2.add(radioTipoMnsj3 = new JRadioButton("WARNING_MESSAGE", false));
		box2.add(radioTipoMnsj4 = new JRadioButton("QUESTION_MESSAGE", false));
		box2.add(radioTipoMnsj5 = new JRadioButton("PLAIN_MESSAGE", false));
		group2 = new ButtonGroup();
		group2.add(radioTipoMnsj1);
		group2.add(radioTipoMnsj2);
		group2.add(radioTipoMnsj3);
		group2.add(radioTipoMnsj4);
		group2.add(radioTipoMnsj5);
		
		// ------------------------BOX 3-----------------------------------
		box3 = Box.createVerticalBox();
		box3.setBorder(BorderFactory.createTitledBorder("Mensaje"));
		box3.setPreferredSize(new Dimension(200,200));
		box3.setMinimumSize(new Dimension(200,200));
		box3.setMaximumSize(new Dimension(200,200));
		box3.add(radioMnsj1 = new JRadioButton("Cadena", true));
		box3.add(radioMnsj2 = new JRadioButton("Icono", false));
		box3.add(radioMnsj3 = new JRadioButton("Componente", false));
		box3.add(radioMnsj4 = new JRadioButton("Otros", false));
		box3.add(radioMnsj5 = new JRadioButton("Objetc[]", false));
		group3 = new ButtonGroup();
		group3.add(radioMnsj1);
		group3.add(radioMnsj2);
		group3.add(radioMnsj3);
		group3.add(radioMnsj4);
		group3.add(radioMnsj5);
		
		// ------------------------BOX 4-----------------------------------
		box4 = Box.createVerticalBox();
		box4.setBorder(BorderFactory.createTitledBorder("Confirmar"));
		box4.setPreferredSize(new Dimension(200,200));
		box4.setMinimumSize(new Dimension(200,200));
		box4.setMaximumSize(new Dimension(200,200));
		box4.add(radioConfirm1 = new JRadioButton("DEFAULT_OPTION", true));
		box4.add(radioConfirm2 = new JRadioButton("YES_NO_OPTION", false));
		box4.add(radioConfirm3 = new JRadioButton("YES_NO_CANCEL_OPTION", false));
		box4.add(radioConfirm4 = new JRadioButton("OK_CANCEL_OPTION", false));
		group4 = new ButtonGroup();
		group4.add(radioConfirm1);
		group4.add(radioConfirm2);
		group4.add(radioConfirm3);
		group4.add(radioConfirm4);
		
		// ------------------------BOX 5-----------------------------------
		box5 = Box.createVerticalBox();
		box5.setBorder(BorderFactory.createTitledBorder("Opción"));
		box5.setPreferredSize(new Dimension(200,200));
		box5.setMinimumSize(new Dimension(200,200));
		box5.setMaximumSize(new Dimension(200,200));
		box5.add(radioOpcion1 = new JRadioButton("String[]", true));
		box5.add(radioOpcion2 = new JRadioButton("Icon[]", false));
		box5.add(radioOpcion3 = new JRadioButton("Object[]", false));
		group5 = new ButtonGroup();
		group5.add(radioOpcion1);
		group5.add(radioOpcion2);
		group5.add(radioOpcion3);
		
		// ------------------------BOX 6-----------------------------------
		box6 = Box.createVerticalBox();
		box6.setBorder(BorderFactory.createTitledBorder("Entrada"));
		box6.setPreferredSize(new Dimension(200,200));
		box6.setMinimumSize(new Dimension(200,200));
		box6.setMaximumSize(new Dimension(200,200));
		box6.add(radioEntrada1 = new JRadioButton("Campo de texto", true));
		box6.add(radioEntrada2 = new JRadioButton("Combo", false));
		group6 = new ButtonGroup();
		group6.add(radioEntrada1);
		group6.add(radioEntrada2);
		
		// -----------------HORIZONTAL BOXES--------------------------------
		boxHorizontal1 = Box.createHorizontalBox();
		boxHorizontal1.add(box1);
		boxHorizontal1.add(box2);
		boxHorizontal1.add(box3);
		
		boxHorizontal2 = Box.createHorizontalBox();
		boxHorizontal2.add(box4);
		boxHorizontal2.add(box5);
		boxHorizontal2.add(box6);
		
		// ------------------VERTICAL BOX-----------------------------------
		boxVertical = Box.createVerticalBox();
		boxVertical.add(boxHorizontal1);
		boxVertical.add(boxHorizontal2);
		add(boxVertical, BorderLayout.CENTER);
		
		// -----------------BOTÓN MOSTRAR-----------------------------------
		laminaBtn = new JPanel();
		laminaBtn.setLayout(new FlowLayout());
		laminaBtn.add(btn = new JButton("Mostrar"));
		add(laminaBtn, BorderLayout.SOUTH);
		
		btn.addActionListener(new AccionOyentes());
	}
	
	private class AccionOyentes implements ActionListener {
		
		Component componente = LaminaDialogos.this;
		Date fecha = new Date();
		Object mensaje = "Mensaje de la Ventana";
		String titulo = "Título de la Ventana";
		int mnsjTipo = 0;
		int opcionTipo = 0;
		ImageIcon icono = new ImageIcon("src/images/icono.png");
		ImageIcon iconoObj1 = new ImageIcon("src/images/Obj (1).png");
		ImageIcon iconoObj2 = new ImageIcon("src/images/Obj (2).png");
		ImageIcon iconoObj3 = new ImageIcon("src/images/Obj (3).png");
		JButton btnObj1 = new JButton("Vídeo Cámara");
		JButton btnObj2 = new JButton("Foto Cámara");
		JButton btnObj3 = new JButton("Smart Phone");
		Object opciones[];
		Object opciones1[] = {"Vídeo", "Foto", "Móvil"};
		Object opciones2[] = {new ImageIcon("src/images/Obj (1).png"), new ImageIcon("src/images/Obj (2).png"), new ImageIcon("src/images/Obj (3).png")};
		Object opciones3[] = {new ImageIcon("src/images/Obj (1).png"), "Vídeo", new ImageIcon("src/images/Obj (2).png"), "Foto", new ImageIcon("src/images/Obj (3).png"), "Móvil",};
		Object seleccion[] = {"Vídeo", "Foto", "Móvil"};
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JPanel lamina = new JPanel();
			lamina.setPreferredSize(new Dimension(100,50));
			lamina.setBackground(Color.CYAN);
			lamina.add(new JLabel("Componente"), JLabel.CENTER);
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			Object objetos[] = {iconoObj1, btnObj1, iconoObj2, btnObj2, iconoObj3, btnObj3};
			
			if (radioTipoMnsj1.isSelected()) mnsjTipo = 0;
			else if (radioTipoMnsj2.isSelected()) mnsjTipo = 1;
			else if (radioTipoMnsj3.isSelected()) mnsjTipo = 2;
			else if (radioTipoMnsj4.isSelected()) mnsjTipo = 3;
			else if (radioTipoMnsj5.isSelected()) mnsjTipo = JOptionPane.PLAIN_MESSAGE;
			
			if (radioMnsj1.isSelected()) mensaje = mensaje;
			else if (radioMnsj2.isSelected()) mensaje = (Object) icono;
			else if (radioMnsj3.isSelected()) mensaje = lamina;
			else if (radioMnsj4.isSelected()) mensaje = (Object) "Fecha: "+dateFormat.format(fecha);
			else if (radioMnsj5.isSelected()) mensaje = objetos;
			
			if (radioConfirm1.isSelected()) opcionTipo = JOptionPane.DEFAULT_OPTION;
			else if (radioConfirm2.isSelected()) opcionTipo = JOptionPane.YES_NO_OPTION;
			else if (radioConfirm3.isSelected()) opcionTipo = JOptionPane.YES_NO_CANCEL_OPTION;
			else if (radioConfirm4.isSelected()) opcionTipo = JOptionPane.OK_CANCEL_OPTION;
			
			if (radioOpcion1.isSelected()) opciones = opciones1;
			else if (radioOpcion2.isSelected()) opciones = opciones2;
			else if (radioOpcion3.isSelected()) opciones = opciones3;

			if (radioTipo1.isSelected()) JOptionPane.showMessageDialog(componente, mensaje, titulo, mnsjTipo, null);
			if (radioTipo2.isSelected()) JOptionPane.showConfirmDialog(componente, mensaje, titulo, opcionTipo, mnsjTipo, null);
			if (radioTipo3.isSelected()) JOptionPane.showOptionDialog(componente, mensaje, titulo, opcionTipo, mnsjTipo, null, opciones, 0);
			if (radioTipo4.isSelected()) {
				if (radioEntrada1.isSelected()) JOptionPane.showInputDialog(componente, mensaje, titulo, mnsjTipo);
				else if (radioEntrada2.isSelected()) JOptionPane.showInputDialog(componente, mensaje, titulo, mnsjTipo, null, seleccion, 0);
			}
		}
	}
}





























