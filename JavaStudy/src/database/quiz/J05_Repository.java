package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.model.InfoDTO;
import database.model.InfoDTO2;

public class J05_Repository {
	
	// 1. 도시 이름을 매개변수로 전달하면 해당 도시에서 근무하는 사원들의 모든 사원 정보와 부서 정보를 리스트 형태로 반환하는 메서드
	//	(employees와 departments를 JOIN한 모든 정보)
	
	// 2. 부서명을 매개변수로 전달하면 해당 부서에 속한 모든 사원 정보와 직책 정보가 조회되는 메서드
	//	(employees와 jobs를 JOIN한 모든 정보)
	static DBConnector connector = new DBConnector("HR", "1234");
	
	public static void main(String[] args) {
		
		List<InfoDTO> list = getInformation1("Seattle");
		
		for(InfoDTO dto : list) {
			System.out.println(dto);
		}
		
		getInformation2("Marketing");
		
	}

	public static List<InfoDTO> getInformation1(String city) {
		List<InfoDTO> list = new ArrayList<>();
		
		String sql = "select * from employees e left join departments d using(department_id) left join locations l using(location_id) where l.city = ?";
		try (
			Connection conn = connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
		) {
			ps.setString(1, city);

			try (
				ResultSet rs = ps.executeQuery();	
			) {
				while(rs.next()) {
					list.add(new InfoDTO(rs));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static void getInformation2(String departmentName) {
		List<InfoDTO2> list = new ArrayList<>();
		
		String sql = "select * from employees e left join departments d using(department_id) left join jobs j using(job_id) where d.department_name = ?";
		try (
			Connection conn = connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
		) {
			ps.setString(1, departmentName);
			try (
				ResultSet rs = ps.executeQuery();
			) {
				while(rs.next()) {
					list.add(new InfoDTO2(rs));
				}
				
				for(InfoDTO2 dto : list) {
					System.out.println(dto);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
