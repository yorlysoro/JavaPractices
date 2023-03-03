package swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class TestDrawPanel extends JPanel {
	
	private static final long serialVersionUID = 3418844587164268284L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangle = new Rectangle2D.Double(100,100,200,150);
		g2.draw(rectangle);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangle);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(100,100, 300, 250));
		Double center_x = rectangle.getCenterX();
		Double center_y = rectangle.getCenterY();
		Double radio = 150.00;
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(center_x, center_y, center_x + radio, center_y + radio);
		g2.draw(circle);
	}

}
