package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Popup {
	Popup() {
		JFrame fr = new JFrame("Error");
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setSize(600, 600);
		JLabel l = new JLabel("Data Not Found");
		l.setBounds(100, 100, 120, 20);
		fr.add(l);
	}
}
