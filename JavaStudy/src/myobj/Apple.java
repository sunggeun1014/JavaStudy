package myobj;

public class Apple {
	int price;
	double weight;
	
	public Apple(int price) {
		this.price = price;
		weight = 10;
	}
	
	public Apple() {
		price = 1000;
		weight = 5;
	}
	
	public Apple(double weight) {
		price = 1234;
		this.weight = weight;
	}
	
	public Apple(int price, double weight) {
		this.price = price;
		this.weight = weight;
	}
	
	
	public void print() {
		System.out.println("사과" + this + "의 가격: " + price);
		System.out.println("사과" + this + "의 무게: " + weight);
	}

}
