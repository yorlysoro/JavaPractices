package colors;

import java.awt.Color;

import javax.swing.JFrame;

public class TestFrameDraw extends JFrame {
	
	private static final long serialVersionUID = -6694250894010634447L;

	public TestFrameDraw() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setTitle("Drawing");
		TestDrawPanel draw_line = new TestDrawPanel();
		this.add(draw_line);
		this.setBackground(Color.PINK);
	}

}
