package fonts;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class Fonts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fontname = JOptionPane.showInputDialog("Write the font:");
		boolean is_install_font = false;
		String[] fontsNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String font: fontsNames) {
			if(font.equals(fontname)) {
				is_install_font = true;
			}
		}

		if(is_install_font) {
			System.out.println("The font is installed!");
		}else {
			System.out.println("The font is not installed!");
		}
	}

}
