package graficos2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _121_Tipos_Cuadros_Dialogos {

	public static void main(String[] args) {

		Cuadros_Dialogos mimarco=new Cuadros_Dialogos();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}

class Cuadros_Dialogos extends JFrame{
	
	public Cuadros_Dialogos(){
		
		setTitle(" Cuadro Diálogos");
		setSize(600, 500);
		setLocationRelativeTo(null);
		
		add(new Lamina_Cuadros_Dialogos());
	}
}

class Lamina_Cuadros_Dialogos extends JPanel{
	
	private JButton boton1, boton2, boton3, boton4;
	
	public Lamina_Cuadros_Dialogos(){
		
		 boton1=new JButton("Advertencia");
		 boton2=new JButton("Datos");
		 boton3=new JButton("Confirmar");
		 boton4=new JButton("Selección");
		
		boton1.addActionListener(new Accion_botones());
		boton2.addActionListener(new Accion_botones());
		boton3.addActionListener(new Accion_botones());
		boton4.addActionListener(new Accion_botones());
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
	}
	
	private class Accion_botones implements ActionListener{
		
		ImageIcon icono = new ImageIcon("src/images/font.png");
		String tallas[] = {"s", "m", "l", "xl"};

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource()==boton1){
				
				JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Dato incorrecto (Prueba)", "Advertencia", 0);
				
			} else if(e.getSource()==boton2){
				
				JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this, "Cuál es su nombre? (Prueba)", "Datos usuario", 3);
				
			} else if (e.getSource()==boton3){
				
				JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Desea cerrar sesión?", "Cerrar sesión", 2, 2);
				
			} else {
				
				JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this, "Elije talla", "Tallas", 1, 1, icono, tallas, 0);
			}
		}		
	}
}














