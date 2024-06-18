package quiz;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Peach implements Comparable<Peach> {

	public static void main(String[] args) {
		List<Peach> peaches = new LinkedList<>();

		peaches.add(new Peach(3000, 3.33, "B+", "김가네농장"));
		peaches.add(new Peach(2500, 2.44, "A+", "김씨네농장"));
		peaches.add(new Peach(1700, 4.21, "A-", "김씨부부네농장"));
		peaches.add(new Peach(3300, 6.33, "B", "김정묵씨네농장"));
		peaches.add(new Peach(2800, 4.55, "C+", "김씨네농장"));
		peaches.add(new Peach(2800, 6.55, "B-", "김씨네농장"));
		peaches.add(new Peach(2800, 6.53, "B", "김씨네농장"));

		Collections.sort(peaches);
		System.out.println("#### 무게 기준 정렬(기본) ####");
		System.out.println(peaches);

		System.out.println("#### 농장 이름순 오름차순, 등급 기준 내림차순 ####");
		Collections.sort(peaches, new Comparator<Peach>() {
			@Override
			public int compare(Peach p1, Peach p2) {
				String farm1 = p1.farm_name;
				String farm2 = p2.farm_name;

				String grade1 = p1.grade;
				String grade2 = p2.grade;

				
				if (farm1.equals(farm2)) {
					char ch1_1 = grade1.charAt(0);
					char ch1_2 = grade2.charAt(0);

					if(grade1.equals(grade2)) {
						return 0;
					}
					
					// 등급의 첫 글자로 비교
					if (ch1_1 > ch1_2) {
						return 1;
					} else if (ch1_1 < ch1_2) {
						return -1;
					}

					// 앞의 등급이 같은 경우 도착하는 곳
					int len1 = grade1.length();
					int len2 = grade2.length();

					if (len1 == 1 && len2 == 1) {
						return 0;
					}

					char ch2_1;
					char ch2_2;

					if (len1 == 2) {
						ch2_1 = grade1.charAt(1);
					} else {
						ch2_1 = ' ';
					}

					if (len2 == 2) {
						ch2_2 = grade2.charAt(1);
					} else {
						ch2_2 = ' ';
					}

					if (ch2_1 == '+') {
						return -1;
					} else if (ch2_1 == '-') {
						return 1;
					} else {
						if(ch2_2 == '+') {
							return 1;
						} else {
							return -1;
						}
					}

				} else {
					// 두 농장이름 중 더 짧은 길이의 문자열 길이만큼 반복해야 한다.
					int len1 = farm1.length();
					int len2 = farm2.length();

					int shorterLen = len1 < len2 ? len1 : len2;

					for (int i = 0; i < shorterLen; i++) {
						char ch1 = farm1.charAt(i);
						char ch2 = farm2.charAt(i);

						if (ch1 < ch2) {
							return -1;
						} else if (ch1 > ch2) {
							return 1;
						}
					}

					// 여기까지 무사히 도착햇다는 것의 의미:
					// 두 문자열이 같지도 않고 더 짧은 문자열의 길이만큼 비교했는데 완전히 같은 경우
					// ex) apple vs applepie

					// 더 긴 문자열이 사전상 더 뒤에있는 문자열이다.
					return len1 > len2 ? 1 : -1;
				}
			}
		});

		System.out.println(peaches);
		
		System.out.println("#### 등급기준 내림차순, 가격기준 내림차순 ####");
		Collections.sort(peaches, new Comparator<Peach>() {
			@Override
			public int compare(Peach p1, Peach p2) {
				String grade1 = p1.grade;
				String grade2 = p2.grade;
				
				int len1 = grade1.length();
				int len2 = grade2.length();
						
				if (grade1.equals(grade2)) {
					//return Integer.compare(p2.price, p1.price);
					return p2.price - p1.price;
				}
				
				// 등급 길이가 모두 1이거나 2라면 사전순으로 처리할 수 있다
				// 사전순으로 정렬하는 기능은 String 클래스에 이미 정의되어 있다.
				if(len1 == 2 && len2 == 2 || len1 == 1 && len2 == 1) {
					return grade1.compareTo(grade2);
				}
				
				// 두 문자열의 길이가 다른 경우
				char ch1 = grade1.charAt(0);
				char ch2 = grade2.charAt(0);
				
				if(ch1 != ch2) {
					return ch1 - ch2;
				}
				
				// +, -를 비교
				if (grade1.contains("-")) {
					return 1;
				} else if (grade2.contains("-")) {
					return -1;
				} else if(grade1.contains("+")) {
					return -1;
				} else {
					return 1;
				}
				
			}
			
		});
		
		System.out.println(peaches);
			
	}

	int price;
	double weight;
	String grade;
	String farm_name;

	public Peach(int price, double weight, String grade, String farm_name) {
		this.price = price;
		this.weight = weight;
		this.grade = grade;
		this.farm_name = farm_name;
	}

	@Override
	public int compareTo(Peach p2) {
		if (this.weight == p2.weight) {
			return 0;
		} else if (this.weight < p2.weight) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return String.format("{%d원/%.2fg/%s/%s}\n", price, weight, grade, farm_name);
	}
}
