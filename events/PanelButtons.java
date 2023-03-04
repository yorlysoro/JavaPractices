package events;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButtons extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = -5099936646933200369L;
	JButton buttonBlue = new JButton("blue");
	JButton buttonYellow = new JButton("yellow");
	JButton buttonRed = new JButton("red");
	
	public PanelButtons() {
		this.add(buttonBlue);
		this.add(buttonYellow);
		this.add(buttonRed);
		buttonBlue.addActionListener(this);
		buttonYellow.addActionListener(this);
		buttonRed.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object buttonPressed = e.getSource();
		
		if(buttonPressed==buttonBlue) {
			this.setBackground(Color.BLUE);
		}else if(buttonPressed==buttonYellow) {
			this.setBackground(Color.YELLOW);
		}else {
			this.setBackground(Color.RED);
		}
		
	}

}
