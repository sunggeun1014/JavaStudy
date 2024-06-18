package database.dbpool;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection implements Closeable {
	Connection conn;
	boolean using;
	
	
	
	public MyConnection(String url, String user, String password) {
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public void use() {
		using = true;
	}
	
	public void relase() {
		using = false;
	}
	
	public boolean check() {
		return using;
	}
	
	public PreparedStatement preapreStatement(String sql) throws SQLException {
		return conn.prepareStatement(sql);
	}
	
	@Override
	public void close() throws IOException {
		using = false;
	}
}
