package Connacation;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection createConnection() {
		Connection Con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Con;
	}
}