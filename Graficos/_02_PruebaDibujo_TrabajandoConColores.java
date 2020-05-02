package Graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _02_PruebaDibujo_TrabajandoConColores {

	public static void main(String[] args) {
		Marco2 ventana = new Marco2();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco2 extends JFrame {
	public Marco2 () {
		setSize(840, 840);
		setTitle("  Dibujos y Colores");
		setLocationRelativeTo(null);
		add(new Lamina2());
		setVisible(true);
	}
}

class Lamina2 extends JPanel {
	public Lamina2() {
		setBackground(new Color(179, 255, 255));
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(100, 200, 150, 100);
		g.drawString("1 - Rectángulo Vacío Graphics", 100, 180);
		g.fillRect(100, 400, 150, 100);
		g.drawString("2 - Rectángulo Relleno Graphics", 100, 380);
		Graphics2D g2D = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(500, 200, 150, 100);
		g2D.draw(rectangulo);
		g2D.drawString("3 - Rectángulo Graphics2D", 500, 120);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2D.draw(elipse);
		g2D.drawString("4 - Elipse Graphics2D", 500, 140);
		g2D.drawLine(500, 200, 650, 300);
		g2D.drawString("5 - Línea Oblícua Graphics2D", 500, 370);
		double centroX = rectangulo.getCenterX();
		double centroY = rectangulo.getCenterY();
		double radio = 90;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		g2D.draw(circulo);
		g2D.drawString("6 - Círculo Graphics2D", 500, 390);
		g.drawString("7 - Rectángulo Relleno Graphics", 500, 430);
		g.setColor(new Color(255, 153, 255));
		g.fillRect(500, 480, 200, 200);
		g.setColor(new Color(0, 0, 0));
		g.drawString("8 - Círculo Relleno Graphics", 500, 460);
		g.setColor(new Color(179, 255, 179));
		g.fillOval(500, 480, 200, 200);
	}
}



















