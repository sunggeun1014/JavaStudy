import myobj.Apple;

public class C03_Constructor {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		Apple a4 = new Apple(10000);
		Apple a5 = new Apple(10.12);
		Apple a6 = new Apple(2000, 4.5);
		
		a1.print();
		a2.print();
		a3.print();
		a4.print();
		a5.print();
		a6.print();
		
		myobj.Book b1 = new myobj.Book();
		
		System.out.println(b1.page);
		
		
		
	}
}