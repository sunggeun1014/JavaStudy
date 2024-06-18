package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J02_PrepareStatement {
	
	public static void main(String[] args) {
		
		// ojdbc 내부의 클래스를 찾아가는 패키지 경로
		String driverPath = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "hr";
		String password = "1234";
		
		try {
			Class.forName(driverPath);
			System.out.println("드라이버 로드 성공...");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 못 찾음");
		}
		
		// 조건을 +연산을 사용하면 SQL Injection 공격을 당할 수도 있다.
		String dept_id = "30";
		
		// SQL Injection 공격을 대비하기 위해 +연산 대신 ?를 사용한다.
		String sql = "select * from employees where department_id = ? and salary <= ?";
		
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			// PreparedStatement 객체의 메서드를 통해 ?를 채울 수 있다.
			pstmt.setInt(1, 30); // 준비된 구문의 1번 물을표에 값 채우기
			pstmt.setInt(2, 4000); // 준비된 구문의 2번 물을표에 값 채우기
			
			// 물음표를 모두 채운 후 execute
			try(
				ResultSet rs = pstmt.executeQuery();
			) {
				while(rs.next()) {
					System.out.printf("%d\t%s\t%.2f\t%d\n", rs.getInt("employee_id"), rs.getString("first_name"), rs.getDouble("salary"), rs.getInt("department_id"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
