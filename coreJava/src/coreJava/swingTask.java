package coreJava;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class swingTask{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	
	public swingTask() {
		JFrame fr = new JFrame("Task");
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setSize(400,400);
		
		b1 = new JButton("Facebook Login Page");
		b1.setBounds(160, 110, 210, 20);
		fr.add(b1);
		
		l1 = new JLabel("Username : ");
		l1.setBounds(150, 150, 250, 20);
		fr.add(l1);
		l2 = new JLabel("Password : ");
		l2.setBounds(150, 180, 250, 20);
		fr.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(230, 152, 130, 20);
		fr.add(t1);
		t1 = new JTextField();
		t1.setBounds(230, 182, 130, 20);
		fr.add(t1);
		
		b1 = new JButton("Login");
		b1.setBounds(150, 220, 100, 20);
		fr.add(b1);
		b4 = new JButton("Sign in");
		b4.setBounds(260, 220, 100, 20);
		fr.add(b4);
	}
	public static void main(String[] args) {
		new swingTask();
	}
	public static Connection createConnection() {
		Connection dv = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dv = DriverManager.getConnection("jdbc:mysql://localhost:3308/task", "root", "");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return dv;
	}
	public void actionperfomed(ActionEvent e) {
		if(e.getSource() == b2) {
			String Username = t1.getText();
			String Password = t2.getText();
			System.out.println(Username+Password);
			try {
				Connection conn = swingTask.createConnection();
				String sql = "insert into virani(Username,Password) values(?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, Password);
				pst.setString(2, Username);
				
				pst.executeUpdate();
				System.out.println("Dhruv Ineserted");
				t1.setText("");
				t2.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}