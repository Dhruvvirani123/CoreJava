package coreJava;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_Demo {
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	public Swing_Demo() {
		
		JFrame dhruv = new JFrame("Demo");
		dhruv.setVisible(true);
		dhruv.setLayout(null);
		dhruv.setSize(500, 500);
//		dhruv.getContentPane().setBackground(Color.white);
		@SuppressWarnings("unused")
		Image img = Toolkit.getDefaultToolkit().getImage("");
		
		l1 = new JLabel("UserName : ");
		l1.setBounds(120, 100, 120, 20);
		dhruv.add(l1);
		l2 = new JLabel("Password : ");
		l2.setBounds(120, 130, 120, 20);
		dhruv.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(200,100,120,20);
		dhruv.add(t1);
		t2 = new JTextField();
		t2.setBounds(200,130,120,20);   
		dhruv.add(t2);

		b1 = new JButton("Login");
		b1.setBounds(173,170,100,20);
		dhruv.add(b1);
	}
	public static void main(String[] args) {
		new Swing_Demo();
	}
}
