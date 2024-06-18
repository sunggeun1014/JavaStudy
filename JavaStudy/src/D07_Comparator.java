import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D07_Comparator {

	/*
		# Comparable
		
		- 이 인터페이스를 구현한 클래스는 크기 비교가 가능해진다.
		- compareTo() 메서드 구현해두면 크기 비교가 필요한 상황에서
		  해당 메서드를 호출해 크기를 비교할 수 있게 된다
		  
		# Comparator
		
		- 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다.
	*/
	
	public static void main(String[] args) {
		// Wrapper 클래스들은 Comparable이 이미 구현되어 있으므로
		// compareTo() 메서드를 직접 구현할 필요가 없다.
		List<Integer> nums = new ArrayList<>();
		List<String> countries = new ArrayList<>();
		
		Collections.addAll(nums, 88, 89, 90, 15, 10, 11, 12, 13, 1, 99);
		
		Collections.sort(nums);
		
		System.out.println(nums);
		
		List<Grape> grapes = new ArrayList<>();
		
		grapes.add(new Grape("김씨네농장", 33, 5.8, "A+"));
		grapes.add(new Grape("박씨네농장", 28, 8.1, "B+"));
		grapes.add(new Grape("이씨네농장", 40, 6.5, "A-"));
		grapes.add(new Grape("이씨네농장", 3, 6.5, "cC"));
		grapes.add(new Grape("최씨네농장", 35, 7.7, "A"));
		grapes.add(new Grape("최씨네농장", 20, 8.8, "B"));
		
		// sort()를 할 수 있으려면 리스트에 속한 모든 요소들이 Comparable이 구현되어 있어야 한다.
		//Collections.sort(grapes);
		Collections.sort(grapes, new 포도분류기_당도기준내림차순());
		
		System.out.println(grapes);
		
		List<PeachPrice> peachPrice = new ArrayList<>();
		
		peachPrice.add(new PeachPrice(1000, "A+", 100, "1000평 농장"));
		peachPrice.add(new PeachPrice(2200, "A+", 200, "2000평 농장"));
		peachPrice.add(new PeachPrice(1800, "C-", 50, "4000평 농장"));
		peachPrice.add(new PeachPrice(800, "B", 80, "3000평 농장"));
		
		Collections.sort(peachPrice);
		
		System.out.println(peachPrice);
		System.out.println("이름순");
		List<PeachGrade> peachGrade = new ArrayList<>();
		
		peachGrade.add(new PeachGrade(1000, "C+", 100, "1000평 농장"));
		peachGrade.add(new PeachGrade(2200, "C", 200, "1000평 농장"));
		peachGrade.add(new PeachGrade(1800, "C-", 50, "4000평 농장"));
		peachGrade.add(new PeachGrade(800, "B", 80, "3000평 농장"));
		
		Collections.sort(peachGrade);
		
		System.out.println(peachGrade);
		
		System.out.println("등급순");
		List<PeachFarmName> peachFarmName = new ArrayList<>();
		
		peachFarmName.add(new PeachFarmName(1000, "A+", 100, "1000평 농장"));
		peachFarmName.add(new PeachFarmName(2200, "A+", 200, "2000평 농장"));
		peachFarmName.add(new PeachFarmName(1800, "C-", 50, "4000평 농장"));
		peachFarmName.add(new PeachFarmName(800, "A+", 80, "3000평 농장"));
		
		Collections.sort(peachFarmName);
		
		System.out.println(peachFarmName);
		
	}
}

// Comparable 인터페이스를 구현한 클래스는 각 인스턴스끼리의 크기 비교가 가능해진다.
// (-> 정렬이 가능해 진다.)
class Grape implements Comparable<Grape> {
	String farmName;
	int qty;
	double sweet;
	String grade;
	
	public Grape(String farm, int qty, double sweet, String grade) {
		this.farmName = farm; 
		this.qty = qty;
		this.sweet = sweet;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%d알/%.1f/%s]\n", farmName, qty, sweet, grade);
	}
	
	@Override
	public int compareTo(Grape g) {
		// 현재 인스턴스와 매개변수로 전달받은 인스턴스를 비교하였을 때
		// 어떤 것이 더 크다고 판정할것인지 정해야 한다.
		
		// 두 인스턴스의 크기가 같다 : 0을 리턴
		// 현재 인스턴스의 크기가 더 크다 : 1을 리턴
		// 매개변수 인스턴스의 크기가 더 크다 : -1을 리턴
		
		// 예시 : 포도알의 개수로 두 인스턴스의 크기를 비교
		if(this.qty == g.qty) {
			// 포도알 개수가 같으면 당도를 기준으로 다시 크기 비교
			if(this.sweet == g.sweet) {
				return 0;
			} else if (this.sweet > g.sweet) {
				return 1;
			} else {
				return -1;
			}
		}else if(this.qty > g.qty) {
			return 1;
		}else {
			return -1;
		}
	}
}

// 내림차순 정렬 : 큰게 먼저나오는 것
// 오름차순 정렬 : 작은게 먼저 나오는 것
class 포도분류기_당도기준내림차순 implements Comparator<Grape> {
	
	@Override
	public int compare(Grape o1, Grape o2) {
		// 왼쪽것이 더 클 때 (왼쪽 것이 뒤쪽에 나오고 싶을 때) : 1
		// 오른쪽 것이 더 클 때 (오른쪽 것이 뒤쪽에 나오고 싶을 때) : -1
		// 두 인스턴스의 크기가 같을 때 : 0
		
		if(o1.sweet == o2.sweet) {
			return 0;
		}else if(o1.sweet > o2.sweet) {
			return -1;
		}else {
			return 1;
		}
	}
}

class PeachPrice implements Comparable<PeachPrice> {
	int price;
	String grade;
	int weight;
	String farmName;
	
	public PeachPrice(int price, String grade, int weight, String farmName) {
		this.price = price;
		this.grade = grade;
		this.weight = weight;
		this.farmName = farmName;
	}
	
	@Override
	public int compareTo(PeachPrice o) {
		if(this.weight == o.weight) {
			return 0;
		}else if(this.weight > o.weight) {
			return 1;
		}else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return String.format("가격: %d/등급: %s/무게: %d/농자이름: %s\n", price, grade, weight, farmName);
	}

}

class PeachGrade implements Comparable<PeachGrade> {
	int price;
	String grade;
	int weight;
	String farmName;
	
	public PeachGrade(int price, String grade, int weight, String farmName) {
		this.price = price;
		this.grade = grade;
		this.weight = weight;
		this.farmName = farmName;
	}
	
	@Override
	public int compareTo(PeachGrade o) {
		if(this.farmName.compareTo(o.farmName) == o.farmName.compareTo(this.farmName)) {
			char[] c1 = this.grade.toCharArray();
			char[] c2 = o.grade.toCharArray();
			
			if(c1[0] == c2[0]) {
				if(this.grade.equals(o.grade)) {
					return 0;
				}else if(c2[c2.length - 1] == '+') {
					return 1;
				}else {
					return -1;
				}
			}else if(c1[0] > c2[0]) {
				return 1;
			}else {
				return -1;
			}
		} else if(this.farmName.compareTo(o.farmName) > o.farmName.compareTo(this.farmName)) {
			return 1;
		} else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return String.format("가격: %d/등급: %s/무게: %d/농자이름: %s\n", price, grade, weight, farmName);
	}
	
}


class PeachFarmName implements Comparable<PeachFarmName> {
	int price;
	String grade;
	int weight;
	String farmName;
	
	public PeachFarmName(int price, String grade, int weight, String farmName) {
		this.price = price;
		this.grade = grade;
		this.weight = weight;
		this.farmName = farmName;
	}
	
	// A+ A A-
	@Override
	public int compareTo(PeachFarmName o) {
		char[] c1 = this.grade.toCharArray();
		char[] c2 = o.grade.toCharArray();
		
		if(c1[0] == c2[0]) {
			if(this.grade.equals(o.grade)) {
				if(this.price == o.price) {
					return 0;
				} else if(this.price < o.price) {
					return 1;
				} else {
					return -1;
				}
			}else if(c2[c2.length - 1] == '+') {
				return 1;
			}else {
				return -1;
			}
		}else if(c1[0] > c2[0]) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	@Override
	public String toString() {
		return String.format("가격: %d/등급: %s/무게: %d/농장이름: %s\n", price, grade, weight, farmName);
	}
	
}


