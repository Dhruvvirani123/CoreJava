package Learn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import coreJava.swing;

public class Swing implements ActionListener {
	JButton b1, b2, b3;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;

	public Swing() {
		JFrame fr = new JFrame("My Application");
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setSize(600, 600);

		l1 = new JLabel("Id : ");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);
		l2 = new JLabel("Name : ");
		l2.setBounds(100, 130, 120, 20);
		fr.add(l2);
		l3 = new JLabel("Contact : ");
		l3.setBounds(100, 160, 120, 20);
		fr.add(l3);

		t1 = new JTextField();
		t1.setBounds(180, 100, 120, 20);
		fr.add(t1);
		t2 = new JTextField();
		t2.setBounds(180, 130, 120, 20);
		fr.add(t2);
		t3 = new JTextField();
		t3.setBounds(180, 160, 120, 20);
		fr.add(t3);
		t4 = new JTextField();
		t4.setBounds(180, 190, 120, 20);
		fr.add(t4);

		b1 = new JButton("Submit");
		b1.setBounds(100, 300, 120, 20);
		fr.add(b1);

		b2 = new JButton("Update");
		b2.setBounds(100, 350, 120, 20);
		fr.add(b2);

		b3 = new JButton("Delete");
		b3.setBounds(250, 350, 120, 20);
		fr.add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
}

public class SwingCRUD_Operation {
	public static void main(String[] args) {
		new swing();
	}

	public static Connection createconnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Swing", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}