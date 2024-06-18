package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.model.Employee;

public class J05_DataModelClass {

	/*
		# 데이터 모델 클래스
		
		- 주로 DB에서 꺼낸 데이터를 담아놓는 용도의 클래스를 의미한다 (DTO, VO)
		- 꺼내온 데이터를 클래스 형태로 담아두면 컬렉션이나 매개변수에 활용하기 편해진다.
		- 조회하는 데이터의 형태대로 만들어 두고 활용한다.
	*/
	public static void main(String[] args) {
		DBConnector connector = new DBConnector("HR", "1234");
		
		try(
			Connection conn = connector.getConnection();	
		) {
			String sql = "select * from employees";
			
			// 데이터 모델 클래스를 활용하면 SELECT로 여러 행을 조회 할 때 조회한 데이터를 리스트에 담아 둘 수 있다.
			List<Employee> employees = new ArrayList<>();
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			) {
				while(rs.next()) {
					// DB에서 꺼낸 하나의 레코드가 하나의 인스턴스가 된다.
					Employee emp = new Employee(rs);
					// 행으로 생성한 인스턴스를 리스트에 추가
					employees.add(emp); // 
				}
				
				for(Employee employee : employees) {
					System.out.println(employee);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
