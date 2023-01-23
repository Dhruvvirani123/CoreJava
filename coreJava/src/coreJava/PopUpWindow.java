package coreJava;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PopUpWindow {
	PopUpWindow(){
		JFrame fr=  new JFrame("Error");
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setSize(250, 200);
		JLabel l = new JLabel("data not found");
		l.setBounds(50,50,120,20);
		fr.add(l);
	}
	public static void main(String[] args) {
		new PopUpWindow();
	}
}
