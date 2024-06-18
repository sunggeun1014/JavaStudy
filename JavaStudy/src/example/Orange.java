package example;

public class Orange {
	int price, sweet;

	public Orange() {
		this(1000, 8);
	}
	
	public Orange(int price, int sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	
	public void print() {
		System.out.printf("가격 : %d, 당도 : %d\n", price, sweet);
	}

	
	public static void main(String[] args) {
		Orange o1 = new Orange();
		Orange o2 = new Orange(800, 9);
		
		o1.print();
		o2.print();
		
		RedOrange ro1 = new RedOrange();
		
		ro1.print();
	}
}