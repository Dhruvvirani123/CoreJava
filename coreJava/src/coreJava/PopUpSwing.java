package coreJava;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PopUpSwing {
	PopUpSwing(){
		JFrame fr = new JFrame("Error");
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setSize(700, 500);
		JLabel l = new JLabel("data not found");
		l.setBounds(300,200,150,20);
		fr.add(l);
	}
	public static void main(String[] args) {
		new PopUpSwing();
	}
}
