package coreJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class myswing implements ActionListener {

	JLabel l1, l2;
	JTextField t1, t2;
	JButton b1, b2;

	public myswing() {		
		JFrame dhruv = new JFrame("MyApplication");
		dhruv.setVisible(true);
		dhruv.setLayout(null);
		dhruv.setSize(400, 400);

		// Label
		l1 = new JLabel("Username : ");
		l1.setBounds(130, 100, 100, 40);
		dhruv.add(l1);
		l2 = new JLabel("Password : ");
		l2.setBounds(130, 130, 100, 40);
		dhruv.add(l2);

		// TextField
		t1 = new JTextField();
		t1.setBounds(210, 112, 130, 20);
		dhruv.add(t1);
		t2 = new JTextField();
		t2.setBounds(210, 142, 130, 20);
		dhruv.add(t2);

		// Button
		b1 = new JButton("Insert");
		b1.setBounds(130, 182, 90, 20);
		dhruv.add(b1);
		b2 = new JButton("Login");
		b2.setBounds(240, 182, 90, 20);
		dhruv.add(b2);

		b1.addActionListener(this);

	}

	public static void main(String[] args) {
		new myswing();
	}

	public static Connection createConnection() {
		Connection virani = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			virani = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return virani;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getSource() == b1) {
			System.out.println("Insert Button Clicked");
			String Username = t1.getText();
			String Password = t2.getText();
			System.out.println(Username + Password);
			try {
				Connection dh = myswing.createConnection();
				String sql = "insert into data(Username,Password) values(?,?)";
				PreparedStatement pst = dh.prepareStatement(sql);
				pst.setString(1, Username);
				pst.setString(2, Password);

				pst.executeUpdate();
				System.out.println("Data Stored by Database");
				t1.setText("");
				t2.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	}
			else if (e.getSource() == b2) {
				System.out.println("Login button clicked");
				int Username = Integer.parseInt(t1.getText());
				try {
					Connection conn = myswing.createConnection();
					String sql = "select * from data where Username=?";
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setInt(1, Username);
					ResultSet dh = pst.executeQuery();
					if (dh.next()) {
						t1.setText(String.valueOf(dh.getInt("Username")));
						t2.setText(dh.getString("Password"));
					    } 
						else {
						new PopUpSwing();
						System.out.println("Data Not Found");
						t1.setText("");
						t2.setText("");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
	} 
	}
}