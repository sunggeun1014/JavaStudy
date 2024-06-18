package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	private static String driverPath = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String user;
	private static String password;

	public DBConnector(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	static {
		try {
			Class.forName(driverPath);
			System.out.println("드라이버 로드 성공...");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 못 찾음...");
		}
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	
}
