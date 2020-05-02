package Graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _04_PruebaImagenes {

	public static void main(String[] args) {
		
		Marco4 ventana = new Marco4();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco4 extends JFrame {
	
	public Marco4() {
		setSize(600, 500);
		setTitle(" Prueba Imágenes");
		setLocationRelativeTo(null);
		
		ImageIcon icono = new ImageIcon("src/Graficos/images/musicIco.png");
		setIconImage(icono.getImage());
		
		add(new Ventana4());
		
		setVisible(true);
	}
}

class Ventana4 extends JPanel {
	
	private Image radioImg;
	private Image musicImg;
	private int anchoImg;
	private int altoImg;
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		// --------------------MUSIC IMG-------------------------
		
		File musicPath = new File("src/Graficos/images/music.png");
		
		try {
			musicImg = ImageIO.read(musicPath);
		} catch (Exception e) {
			System.out.println("No File!");
		}
		
		g.drawImage(musicImg, 0, 0, 100, 100, null);
		
		for (int i=0; i<600; i++) {
			for(int j=0; j<500; j++) {
				g.copyArea(0, 0, 100, 100, i*100, j*100);
			}
		}
		
		// --------------------RADIO IMG-------------------------
		
		File radioPath = new File("src/Graficos/images/radio.png");
		
		try {
			radioImg = ImageIO.read(radioPath);
		} catch (Exception e) {
			System.out.println("No File!");
		}
		
		anchoImg = radioImg.getWidth(null);
		altoImg = radioImg.getHeight(null);
		
	    int x = (this.getWidth() - anchoImg/2) / 2;
	    int y = (this.getHeight() - altoImg/2) / 2;
	    
	    g.drawImage(radioImg, x, y, anchoImg/2, altoImg/2, null);
	}
}




























