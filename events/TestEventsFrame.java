package events;

import java.awt.Color;

import javax.swing.JFrame;

public class TestEventsFrame extends JFrame {
	
	private static final long serialVersionUID = -6694250894010634447L;

	public TestEventsFrame() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		this.setTitle("Events");
		this.setBackground(Color.PINK);
		PanelButtons paneButtons = new PanelButtons();
		this.add(paneButtons);
	}

}
