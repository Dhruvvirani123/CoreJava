package Connecation;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnecation {
	public static Connection creConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DZone","root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
