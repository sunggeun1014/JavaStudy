package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JdbcConnection {
	/*
		# JDBC (Java Database Connectivity)
		
		- 자바에서 데이터베이스에 연결하여 쿼리문을 전달하고 결과를 받아올 수 있는 인터페이스
		- 하나의 클래스로 다양한 종류의 DB와 연결 할 수 있게끔 추상화가 되어있다
		  (어떤 종류의 DB와 연결하더라도 자바쪽 소스코드는 거의 동일하다)
		  
		# JDBC (Oracle JDBC)
		
		- 오라클 DB가 자바의 JDBC와 소통하기 위해 만들어놓은 라이브러리
		- 프로젝트에 해당 라이브러리 파일을 추가한 후 import해서 사용할 수 있다.
		- 오라클 설치 폴더 또는 SQLDeveloper 설치 폴더에 있다.
	*/

	public static void main(String[] args) {
		
		// 0. 프로젝트에 ojdbc 라이브러리를 추가한다
		// 프로젝트 우클릭 -> Build Path -> Configure Build Path -> Libraries -> module Path -> add external jar...
		
		// 1. Class.forName()으로 jdbc 드라이버를 로드한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 못 찾음...");
		}		
		
		// 2. DriverManager 클래스를 통해 DB에 연결할 수 있다. (워크시트와 같음)
		
		// DB와의 연결을 해제하지 않으면 DB는 언제 끊어야할지 모르기 때문에 금방 최대 연결 개수에 도달하게 되어 DB를 재부팅해야한다.
		try (
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "1234");
		) {
			System.out.println("연결 성공: " + conn);
			
			// 3. 생성된 연결에 쿼리문을 보내 실행한다.
			String sql = "select "
					+ "rpad(to_char(employee_id), 10, ' ') as \"employee_id\","
					+ "rpad(first_name, 15, ' ') as \"first_name\","
					+ "rpad(last_name, 15, ' ') as \"last_name\""
					+ "from employees";
			
			try (
				// [3-1] 쿼리문을 준비시킨다.(준비된 구문 객체를 생성)
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				// [3-2] 준비된 구문을 실행시켜 결과를 받아온다.(SELECT문의 경우 결과를 Set 형태로 받아옴)
				ResultSet rs = pstmt.executeQuery();
			) {
				// 4. 받아온 결과를 프로그램에서 사용한다.
				
				// rs.next() : 다음 결과가 있으면 커스를 다음으로 이동시키면서 true를 리턴 없으면 false 리턴
				System.out.printf("%-10s%-15s%-15s\n", "EMP_ID", "FIRST_NAME", "LAST_NAME");
				while(rs.next()) {
					System.out.printf("%s%s%s\n", rs.getString("employee_id"), rs.getString("first_name"), rs.getString("last_name"));
				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
