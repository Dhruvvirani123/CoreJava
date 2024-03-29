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

public class swing implements ActionListener {
	JButton b1, b2, b3, b4;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;

	public swing() {
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
		l4 = new JLabel("Address : ");
		l4.setBounds(100, 190, 120, 20);
		fr.add(l4);
		l5 = new JLabel("Email : ");
		l5.setBounds(100, 220, 120, 20);
		fr.add(l5);

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
		t5 = new JTextField();
		t5.setBounds(180, 220, 120, 20);
		fr.add(t5);

		b1 = new JButton("Submit");
		b1.setBounds(100, 300, 120, 20);
		fr.add(b1);

		b2 = new JButton("Search");
		b2.setBounds(250, 300, 120, 20);
		fr.add(b2);

		b3 = new JButton("Update");
		b3.setBounds(100, 350, 120, 20);
		fr.add(b3);

		b4 = new JButton("Delete");
		b4.setBounds(250, 350, 120, 20);
		fr.add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}

	public static void main(String[] args) {
		new swing();
	}

	public static Connection createConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruv", "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void actionPerformed(ActionEvent e) {

		// Data Insert Button Action
		if (e.getSource() == b1) {
			System.out.println("Submit button clicked");
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			long contact = Long.parseLong(t3.getText());
			String address = t4.getText();
			String email = t5.getText();
			System.out.println(id + name + contact + address + email);
			try {
				Connection con = swing.createConnection();
				String sql = "insert into virani(id,name,contact,address,email) values(?,?,?,?,?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setLong(3, contact);
				pst.setString(4, address);
				pst.setString(5, email);

				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Search Button Action
		else if (e.getSource() == b2) {
			System.out.println("Search Button Clicked");
			int id = Integer.parseInt(t1.getText());
			try {
				Connection con = swing.createConnection();
				String sql = "select * from virani where id = ?";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet dh = pst.executeQuery();
				if (dh.next()) {
					t1.setText(String.valueOf(dh.getInt("id")));
					t2.setText(dh.getString("name"));
					t3.setText(String.valueOf(dh.getLong("contact")));
					t4.setText(dh.getString("address"));
					t5.setText(dh.getString("email"));
					System.out.println("see your Data");
				} else {
					new popup2();
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					System.out.println("Data Not Found");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Update Button Action
		else if (e.getSource() == b3) {
			System.out.println("Update Button Clicked");
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			long contact = Long.parseLong(t3.getText());
			String address = t4.getText();
			String email = t5.getText();
			try {
				Connection con = swing.createConnection();
				String sql = "update virani set name=?,contact=?,address=?,email=? where id=?";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, name);
				pst.setLong(2, contact);
				pst.setString(3, address);
				pst.setString(4, email);
				pst.setInt(5, id);
				pst.executeUpdate();
				System.out.println("Data Updated");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Delete Button Action
		else if (e.getSource() == b4) {
			System.out.println("Delete Button Clicked");
			int id = Integer.parseInt(t1.getText());
			try {
				Connection con = swing.createConnection();
				String sql = "delete from virani where id = ?";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				pst.executeUpdate();
				System.out.println("Data Deleted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}