
public class C07_Polymorphism {
	
	public static void pet(Wolf wolf) {
		wolf.pet();
	}
	
	public static void hunt(Wolf wolf) {
		System.out.println(wolf.name + "와 함께 맘모스를 사냥했습니다!!");
	}
	
	public static void main(String[] args)  {
		Americano a1 =  new Americano();
		
		Coffee c1 = new Americano();
		Coffee c2 = new CafeLatte();
		Coffee c3 = a1;
		
		Dog dog1 = new Dog();
		Wolf dog2 = new Dog("잠시늑대가된개");
		
		dog1.walk();
		//dog2.walk();
		dog1.pet();
		dog2.pet();
		
		dog1.run();
		dog2.run();
				
		Dog d3 = (Dog)dog2;
		d3.walk();
		
		Wolf wolf1 = new Dog();
		Wolf wolf2 = new Wolf();
		
		System.out.println("wolf1은 강아지인가요? " + (wolf1 instanceof Dog));
		System.out.println("wolf2은 강아지인가요? " + (wolf2 instanceof Dog));
		
		Wolf[] wolves = {
				new Wolf(), 
				new Wolf(),
				new Dog(), 
				new Dog("몽실이")
		};
		
		for(int i = 0; i < wolves.length; i++) {
			System.out.println(wolves[i] instanceof Dog);
		}
		
		hunt(wolf1);
		hunt(wolf2);
		hunt(new Dog("몽실이"));
	}
}
class Coffee{};
class Americano extends Coffee {}
class CafeLatte extends Coffee {}