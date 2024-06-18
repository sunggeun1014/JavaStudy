import myobj.Book;

public class C11_LocalInnerClass {
	public static void doSomething2(Book book) {
		System.out.println(book.page);
		System.out.println(book.total_page);
		book.print();
	}
	
	public static void doSomething() {
		// 지역 내부 클래스는 다른 메서드만 오더라도 사용할 수 없게 된다.
		// Student stu = new Student();
	}
	
	public static void main(String[] args) {
		class Student {
			int kor;
			int eng;
			int math;
			
			int getTotal() {
				return kor + eng + math;
			}
		}
		
		
		Student stu = new Student();
		
		stu.kor = 100;
		stu.eng = 100;
		stu.math = 90;
		
		System.out.println(stu.getTotal());
		
		// 상속과 업캐스팅을 사용하면 다른곳에서도 활용할 수 있게 된다.
		class HistoryBook extends Book {
			public HistoryBook() {
				super.page = 300;
				super.total_page = 900;
			} 
			
			@Override
			public void print() {
				System.out.println("역사책입니다.");
			}
		}
		
		HistoryBook book1 = new HistoryBook();
		HistoryBook book2 = new HistoryBook();
		
		doSomething2(book1);
		doSomething2(book2);
		
		// 인스턴스 생성과 동시에 클래스 수정 (익명 지역 내부 클래스)
		doSomething2(new Book() {

			@Override
			public void print() {
				System.out.println("익명의 클래스에서 덮어쓴 프린트입니다.");
			}
		});
		
		Book b1 = new Book() {
			@Override
			public void print() {
				System.out.println("마음대로 수정했음.");
			}
		};
		
	}
}
