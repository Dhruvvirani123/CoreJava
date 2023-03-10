package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	public static Connection createConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}