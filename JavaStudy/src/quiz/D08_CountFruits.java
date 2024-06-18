package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class D08_CountFruits {
	
	final public static String[] FRUITS = 
		{ "Apple", "Banana", "Orange", "Mango", "Kiwi", "Pineapple", "Peach", "Watermelon", "Grape" };
	
	public static void main(String[] args) {
		
		String[] randomFruits = new String[1000];
		HashMap<String, Integer> fruitCount = new HashMap<>();
		
		for (int i = 0; i < randomFruits.length; i++) {
			randomFruits[i] = FRUITS[(int)(Math.random() * FRUITS.length)];
		}
		
		for(String fruit : randomFruits) {
			fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
		}
		
		System.out.println(fruitCount);
		
		// 과일 9개 X frequency로 1000번씩 = 총 9000번 검사
		for (int i = 0; i < FRUITS.length; i++) {
			int count = Collections.frequency(Arrays.asList(randomFruits), FRUITS[i]);
			System.out.printf("%s의 개수: %d개\n", FRUITS[i], count);
		}
	}

}