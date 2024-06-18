package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CoffeeDTO {
	private Integer coffeeId;
	private String coffeeName;
	private Integer coffeePrice;
	
	public CoffeeDTO(ResultSet rs) throws SQLException {
		coffeeId = rs.getInt("coffee_id");
		coffeeName = rs.getString("coffee_name");
		coffeePrice = rs.getInt("coffee_price");
	}

	public Integer getCoffeeId() {
		return coffeeId;
	}

	public void setCoffeeId(Integer coffeeId) {
		this.coffeeId = coffeeId;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public Integer getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeePrice(Integer coffeePrice) {
		this.coffeePrice = coffeePrice;
	}

	@Override
	public String toString() {
		return "CoffeeDTO [coffeeId=" + coffeeId + ", coffeeName=" + coffeeName + ", coffeePrice=" + coffeePrice + "]";
	}
	

}
