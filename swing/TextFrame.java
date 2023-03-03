package swing;

import javax.swing.JFrame;

public class TextFrame extends JFrame{
	
	private static final long serialVersionUID = 6379461426479146461L;

	public TextFrame() {
		this.setVisible(true);
		this.setSize(250, 300);
		this.setLocation(400, 200);
		this.setTitle("First Text");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel text_panel = new MyPanel();
		this.add(text_panel);
	}

}
