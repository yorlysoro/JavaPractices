package swing;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MyFrame() {
		//this.setSize(512, 512);
		//this.setLocation(480, 215);
		this.setBounds(480, 115, 512, 512);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

}
