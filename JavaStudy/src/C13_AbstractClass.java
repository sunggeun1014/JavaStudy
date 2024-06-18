
public class C13_AbstractClass {
	/*
		# 추상 클래스 (abstract class)
		
		- 미완성 메서드를 적어 놓고 나중에 상속받아서 마저 만들어야 하는 클래스
		- 추상 클래스 내부에는 완성되지 않은 메서드가 들어있으므로
		  인스턴스를 생성할 수 없다.
		  
		# 추상 메서드 (abstract method)
		
		- 추상 클래스 내부에 들어있는 미완성 메서드
		- 선언만 해놓고 구현은 상속받은 자식들에게 미룬다
		- 오버라이드하지 않으면 컴파일 에러가 발생하여
		  자식 클래스에게 오버라이딩을 강제하는 효과가 있다. 
	*/
	
	public static void harvest(Crop crop) {
		System.out.printf("%s를 %d개 수확했습니다!\n", crop.getName(), crop.harvest());
	}
	
	public static void main(String[] args) {
		// abstract class는 인스턴스화가 불가능하다.
		// Crop crop = new Crop();
		
		Potato potato = new Potato();
		
		potato.grow();
		potato.grow();
		potato.grow();
		
		harvest(potato);
		harvest(new Crop() {
			{
				name = "고구마";
				grow();
				grow();
			}
			@Override
			void grow() {
				qty += 2;
			}
		});
		
		
	}
}

// abstract: 나중에 상속받아서 구현하겠다.
abstract class Crop {
	String name;
	int qty;
	abstract void grow();
	
	final String getName() {
		return name;
	}
	
	final int harvest() {
		int qty = this.qty;
		this.qty = 0;
		return qty;
	}
}

class Potato extends Crop {
	
	public Potato() {
		name = "감자";
	}

	@Override
	void grow() {
		qty += 3;
	}

}