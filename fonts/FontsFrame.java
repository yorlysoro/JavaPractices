package fonts;

import java.awt.Color;

import javax.swing.JFrame;

public class FontsFrame extends JFrame {
	
	private static final long serialVersionUID = -6694250894010634447L;

	public FontsFrame() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setTitle("Drawing");
		FontsPanel draw_line = new FontsPanel();
		this.add(draw_line);
		this.setBackground(Color.PINK);
	}

}
