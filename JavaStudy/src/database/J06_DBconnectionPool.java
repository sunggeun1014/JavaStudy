package database;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.dbpool.MyConnection;
import database.dbpool.MyConnectionPool;

public class J06_DBconnectionPool {

	/*
		미리 커넥션 객체를 여러개 생성해두고 잠시 빌려주는 형태로 사용한다.
		매번 연결을 끊지않고 프로그램이 종료될 때 모든 연결을 끊어준다.
	*/
	public static void main(String[] args) throws InterruptedException {
		MyConnectionPool myPool = new MyConnectionPool(5);

		int i = 0;
		while(i++ < 15) {
			try (
				MyConnection conn = myPool.borrowConnection();
				PreparedStatement pstmt = conn.preapreStatement("select * from employees");
				ResultSet rs = pstmt.executeQuery();
			) {
				while(rs.next()) {
					System.out.println(rs.getInt("employee_id"));
				}
				System.out.println(i + "회 출력! (" + conn + ")");
				Thread.sleep(1000);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
}
