package coreJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class assiginmentfrom implements ActionListener {

	JLabel l1, l2, l3, l4, l5;
	JTextArea msg;
	JTextField t1, t2, t3, t4;
	JButton b1, b2, b3, b4, b5, b6;
	JRadioButton r1, r2;
	JTextArea ta1, screen;

	assiginmentfrom() {
		JFrame fr = new JFrame("Registration form");
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setSize(700, 500);

		l1 = new JLabel("ID : ");
		l1.setBounds(20, 50, 100, 20);
		fr.add(l1);
		t1 = new JTextField();
		t1.setBounds(130, 50, 150, 20);
		fr.add(t1);

		l2 = new JLabel("Name : ");
		l2.setBounds(20, 100, 100, 20);
		fr.add(l2);
		t2 = new JTextField();
		t2.setBounds(130, 100, 150, 20);
		fr.add(t2);

		l3 = new JLabel("Geander : ");
		l3.setBounds(20, 150, 100, 20);
		fr.add(l3);
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(130, 150, 80, 20);
		fr.add(r1);
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(220, 150, 80, 20);
		fr.add(r2);
		

		l4 = new JLabel("Address : ");
		l4.setBounds(20, 200, 100, 20);
		fr.add(l4);
		t3 = new JTextField();
		t3.setBounds(130, 200, 150, 20);
		fr.add(t3);

		l5 = new JLabel("Contact : ");
		l5.setBounds(20, 250, 100, 20);
		fr.add(l5);
		t4 = new JTextField();
		t4.setBounds(130, 250, 150, 20);
		fr.add(t4);

		b1 = new JButton("Register");
		b1.setBounds(20, 300, 120, 20);
		fr.add(b1);
		b2 = new JButton("Update");
		b2.setBounds(165, 300, 120, 20);
		fr.add(b2);
		b3 = new JButton("Delete");
		b3.setBounds(20, 340, 120, 20);
		fr.add(b3);
		b4 = new JButton("Exit");
		b4.setBounds(165, 340, 120, 20);
		fr.add(b4);
		b5 = new JButton("Reset");
		b5.setBounds(80, 380, 150, 20);
		fr.add(b5);
		b6 = new JButton("Refresh Table");
		b6.setBounds(340, 360, 230, 20);
		fr.add(b6);

		screen = new JTextArea();
		screen.setBounds(300, 50, 300, 300);
		fr.add(screen);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}

	
	public static void main(String[] args) {
		new assiginmentfrom();
	}
	
	public static Connection createConnection() {
		Connection conn =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assiginmentform","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			System.out.println("Register Button Clicked");
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			String gender = r1.getText();
			String address = t3.getText();
			long contact = Long.parseLong(t4.getText());
			
			try {
				Connection con = swing.createConnection();
				String sql = "insert into form(Id,Name,Gender,Address,Contact) values(?,?,?,?,?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setString(3, gender);
				pst.setString(4, address);
				pst.setLong(5, contact);
				
				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}