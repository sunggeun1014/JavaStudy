import java.util.Arrays;
import myobj.Book;

public class C05_ReferencesType {

	public static void primitiveType(int num) {
		num = 123;
	}

	public static void referencesType1(double[] arr) {
		if(arr != null && arr.length != 0) {
			arr[0] = 99.999;
		}
	}
	
	public static void referencesType2(Book book) {
		book.page = 121;
	}
	
	public static void referencesType3(String str) {
		str = "Babo";
	}

	public static void main(String[] args) {

		int a = 10;

		primitiveType(a);
		System.out.println(a);
		
		double[] b = new double[3];
		
		b[0] = 10.123;
		b[1] = 11.3;
		b[2] = 9.8;
		
		referencesType1(b);
		System.out.println(Arrays.toString(b));

		Book c = new Book();
		
		c.page = 1;
		c.total_page = 10;
		
		referencesType2(c);
		System.out.println("현재 페이지 : " + c.page);
		System.out.println("전체 페이지 : " + c.total_page);
		
		String d = new String("Hello!");
		
		System.out.println("갔다오기전: " + d);
		referencesType3(d);
		System.out.println("갔다온후: " + d);
	}
}
