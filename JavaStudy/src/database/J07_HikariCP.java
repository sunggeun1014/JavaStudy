package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class J07_HikariCP {
	
	public static void main(String[] args) {
		
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		config.setJdbcUrl("jdbc:oracle:thin:@127.0.0.1:1521:XE");
		config.setUsername("HR");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);
		
		class TestThread extends Thread {
			
			public TestThread(String name) {
				super(name);
			}
			
			@Override
			public void run() {
				String sql = "select * from employees";
				try (
					Connection conn = ds.getConnection();
					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery();
				) {
					while(rs.next()) {
						System.out.println(rs.getString("first_name"));
					}
					System.out.println(this.getName() + "작업 완료!");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		new TestThread("쓰레드1").start();
		new TestThread("쓰레드2").start();
		new TestThread("쓰레드3").start();
		new TestThread("쓰레드4").start();
		
		System.out.println("메인 끝!");
	} 
	
}