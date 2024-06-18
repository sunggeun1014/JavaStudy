package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.model.CoffeeDTO;

public class J05_CRUD {
	
	// 1. 모든 커피 목록을 리스트 형태로 반환하는 메서드
	
	// 2. 커피 이름으로 검색한 결과를 리스트 형태로 반환하는 메서드 (LIKE)
	
	// 3. 새로운 커피를 추가하는 메서드 (추가할 때 시퀀스 사용)
	
	// 4. 이미 존재하는 커피의 정보를 수정할 수 있는 메서드 (기본키는 수정 불가능)
	
	// 5. 커피 ID를 매개변수로 전달받으면 해당 커피를 삭제하고 삭제 여부를 반환해주는 메서드
	static DBConnector connector = new DBConnector("HR", "1234");
	public static void main(String[] args) {
//		List<CoffeeDTO> coffeeList = getCoffeeList();
//		for(CoffeeDTO dto : coffeeList) {
//			System.out.println(dto);
//		}
		
//		List<CoffeeDTO> searchResult = getSearchResult("아메");
//		for(CoffeeDTO dto : searchResult) {
//			System.out.println(dto);
//		}
		
//		coffeeAdd("아이스티", 1800);
		
//		coffeeModify(3, "티", 1000);
		
//		int result = coffeeDelete(4);
//		System.out.println(result == 1 ? "삭제되었습니다." : "삭제되지 않았습니다.");
	}
	
	public static List<CoffeeDTO> getCoffeeList() {
		List<CoffeeDTO> list = new ArrayList<>();
		String sql = "select * from coffee";
		try (
			Connection conn = connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		) {
			while(rs.next()) {
				list.add(new CoffeeDTO(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static List<CoffeeDTO> getSearchResult(String coffeeName) {
		List<CoffeeDTO> list = new ArrayList<>();
		String sql = "select * from coffee where coffee_name like ?";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
		) {
			ps.setString(1, "%" + coffeeName + "%");
			try (
				ResultSet rs = ps.executeQuery();
			) {
				while(rs.next()) {
					list.add(new CoffeeDTO(rs));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static void coffeeAdd(String coffeeName, int coffeePrice) {
		String sql = "insert into coffee(COFFEE_ID, COFFEE_NAME, COFFEE_PRICE) values(coffee_id_seq.nextval, ?, ?)";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
		) {
			ps.setString(1, coffeeName);
			ps.setInt(2, coffeePrice);
			
			int result = ps.executeUpdate();
			
			System.out.printf("%d개의 커피를 추가하였습니다.\\n", result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void coffeeModify(int coffeeId, String coffeeName, int coffeePrice) {
		String sql = "update coffee set coffee_name = ?, coffee_price = ? where coffee_id = ?";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
		) {
			ps.setString(1, coffeeName);
			ps.setInt(2, coffeePrice);
			ps.setInt(3, coffeeId);
			
			int result = ps.executeUpdate();
			
			System.out.printf("%d개의 커피를 수정하였습니다.\n", result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static int coffeeDelete(int coffeeId) {
		int result = 0;
		String sql = "delete from coffee where coffee_id = ?";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
		) {
			ps.setInt(1, coffeeId);
			
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
