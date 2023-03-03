package swing;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	private static final long serialVersionUID = -183268897919188537L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hello World", 50, 100);
	}

}
