package register.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static String url="jdbc:postgresql://localhost:5432/todolist?user=postgres&password=123";
	
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("org.postgresql.Driver");
			
			con = DriverManager.getConnection(url);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		return con;
	}
	
}
