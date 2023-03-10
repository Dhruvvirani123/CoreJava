package Connecation;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection createConnection() {
		Connection Connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection = DriverManager.getConnection("jdbd:mysql://localhost:3306/project","root", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Connection;
	}
}