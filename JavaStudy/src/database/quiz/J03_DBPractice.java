package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J03_DBPractice {
	
	/*
		1. 관리자 계정으로 DB에 새 계정을 추가한다.
		
		2. 관리자 계정으로 새 계정에 권한을 부여한다.
		
		3. 해당 계정에 새 테이블을 추가한다 (기본키로 시퀀스를 사용해야 하고, 제약 조건을 종류별로 모두 사용해야 한다.)
		
		4. 프로그램에서 스캐너로 입력하면 DB에 행이 추가되어야 한다.
		
		5. 콘솔에서 여태까지 추가된 모든 행을 조회 할 수 있어야 한다.
	*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		System.out.print("번호 입력 : ");
		String phone = scan.next();
		scan.nextLine();
		System.out.print("내용 입력 : ");
		String content = scan.nextLine();
		
		String driverPath = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "user1";
		String password = "1234";
		
		try {
			Class.forName(driverPath);
			System.out.println("드라이버 로드 성공...");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 못 찾음...");
		}
		
		
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
		) {
			
			String sql = "insert into members values(member_id_seq.nextval, ?, ?, ?)";
			try (
				PreparedStatement ps = conn.prepareStatement(sql);
			) {
				ps.setString(1, name);
				ps.setInt(2, age);
				ps.setString(3, phone);
				
				int result = ps.executeUpdate();
				
				System.out.printf("members 테이블에 %d건의 데이터 저장 성공\n", result);
			}
			
			sql = "insert into board values(member_id_seq.currval, ?)";
			try (
				PreparedStatement ps = conn.prepareStatement(sql);	
			) {
				ps.setString(1, content);
				
				int result = ps.executeUpdate();
				
				System.out.printf("board 테이블에 %d건의 데이터 저장 성공\n", result);
			} 
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
