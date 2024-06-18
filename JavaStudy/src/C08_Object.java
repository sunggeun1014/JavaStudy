import myobj.Apple;
import myobj.House;

public class C08_Object {

	public static void main(String[] args) {

		Wolf w1 = new Dog("춘식이");
		Object o1 = new Dog("몽실이");
		Dog d1 = new Dog("춘자", "1234");
		Dog d2 = new Dog("춘자", "3456");
		Dog d3 = new Dog("진돌이", "1234");
		
		System.out.println(d1.toString());
		System.out.println(o1.toString());
		
		System.out.println(d2);
		System.out.println(o1);
		System.out.println(w1);
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d1.equals(new Apple()));
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		
		String str1 = new String("abcd");
		String str2 = new String("Hello everyone, My name is sausage. Nice to meet you");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		House house1 = new House("홍길동1", "서울 도봉구 도봉로");
		House house2 = new House("홍길동2", "경기도");
		House house3 = new House("홍길동3", "서울 도봉구 도봉로");
		
		System.out.println(house1.toString());
		System.out.println(house1.equals(house2));
		System.out.println(house1.equals(house3));
		System.out.println(house1.hashCode());
		System.out.println(house2.hashCode());
		System.out.println(house3.hashCode());
	}

}
