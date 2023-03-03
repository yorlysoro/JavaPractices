package swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CenterFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public CenterFrame() {
		Toolkit my_screen = Toolkit.getDefaultToolkit();
		Dimension size_screen = my_screen.getScreenSize();
		Double height = size_screen.getHeight();
		Double width = size_screen.getWidth();
		this.setSize(height.intValue()/4, width.intValue()/4);
		this.setLocation(height.intValue()/6, width.intValue()/6);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("My Frame Centered");
		
		Image my_icon = my_screen.getImage("src/swing/myicon.gif");
		this.setIconImage(my_icon);
	}

}
