package myobj;

public class Brand {

	public static void main(String[] args) {
		
		Nike.printBrand();
		
		Nike n = new Nike();
				
		n.setPrice(2000);
		System.out.println(n.getPrice()+"원");
		
		
	}
}

class Nike {
	static String brand = "Nike";
	int price;
	String category;
	
	static void printBrand() {
		System.out.println("이 제품의 브랜드는" + brand + "입니다.");
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return this.price;
	}
	
	
}