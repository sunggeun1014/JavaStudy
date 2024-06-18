
public class C06_Extend {

	public static void main(String[] args) {
		
		Wolf w0 = new Wolf();
		Wolf w1 = new Wolf("늑돌이");
		Wolf w2 = new Wolf("늑순이");
		
		w0.pet();
		w1.pet();
		w2.pet();
		w0.run();
		
		Dog d1 = new Dog();
		
		d1.pet();
		d1.run();
	
		System.out.println();
		
		TCharacter character = new TCharacter("user1");
		
		character.printInfo();
		
		Warrior warrior = new Warrior("user2");
		
		warrior.printInfo();
	}
}

class Wolf {
	String name;
	int age = 0;
	
	public Wolf() {
		name = "이름없는늑대";
	}
	
	public Wolf(String name) {
		this.name = name;
	}
	
	void pet() {
		System.out.printf("늑대(%s, %d세)를 쓰다듬다가 손이 물렸습니다.\n", this.name, this.age);
	}
	
	void run() {
		System.out.printf("%s가 열심히 달립니다!\n", this.name);
	}
}

class Dog extends Wolf {
	int walkDesire = 100;
	String socialId;
	
	public Dog() {
		super("이름없는개");
	}
	public Dog(String name) {
		super(name);
	}
	
	public Dog(String name, String socialId) {
		super(name);
		this.socialId = socialId;
	}
	
	void pet() {
		System.out.printf("강아지(%s, %d)를 쓰다듬어줬더니 아주 좋아합니다.\n", this.name, this.age);
	}
	
	void walk() {
		System.out.printf("강아지(%s, %d세)와 함께 산책했습니다!\n", this.name, this.age);
		walkDesire -= 10;
	}
	
	@Override
	public String toString() {
		return "강아지(" + name + "/" + age + "세)";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dog)){
			return false;
		}
		
		return this.socialId.equals(((Dog)obj).socialId);
	}
	
	@Override
	public int hashCode() {
		return socialId.hashCode();
	}
}



class TCharacter {
	String name;
	int hp;
	
	public TCharacter(String name) {
		this.name = name;
		hp = 100;
	}
	
	void printInfo() {
		System.out.printf("%s HP : %s\n", name, hp);
	}

	public static String isAlphabetic(char c) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Warrior extends TCharacter {
	String job;
	
	public Warrior(String name) {
		super(name);
		job = "전사";
	}
	
	void printInfo() {
		System.out.printf("%s[%s] HP : %s\n", name, job, hp);
	}
	
}