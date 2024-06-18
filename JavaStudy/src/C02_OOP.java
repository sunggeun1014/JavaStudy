
public class C02_OOP {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.currentPage = 130;
		b2.currentPage = 13;
		b3.currentPage = 0;
		
		b1.totalPage = 200;
		b2.totalPage = 80;
		b3.totalPage = 1000;
		
		for (int i = 0; i < 1000; i++) {
			b1.nextPage();
		}
		
		System.out.println("책1의 현재 페이지 : " + b1.currentPage);
		System.out.println("책2의 현재 페이지 : " + b2.currentPage);
		System.out.println("책3의 현재 페이지 : " + b3.currentPage);
		
		
		Car car = new Car();
		car.speed = 30;
		car.gear = 'D';
		car.price = 2500;
		
		car.speedUp();
		car.speedDown();
		car.speedUp();
		
		System.out.println(car.speed);
	}
}

class Book {
	int currentPage;
	int totalPage;
	int typeOfCover;
	String authorName;
	String authorEngName;
	
	void nextPage() {
		if(this.currentPage < this.totalPage) {
			++this.currentPage;
		}
	}
	
}

class Car {
	int price;
	int speed;
	char gear;
	
	void speedUp() {
		this.speed++;
	}
	
	void speedDown() {
		this.speed--;
	}
}




