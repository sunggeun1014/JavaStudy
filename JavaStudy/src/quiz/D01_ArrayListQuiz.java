package quiz;

import java.util.ArrayList;

public class D01_ArrayListQuiz {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			list.add((int)(Math.random() * 1000) + 1000);
		}
		
		int i = 0;
		while (i < list.size()) {
			if(list.get(i) % 2 == 0) {
				list.remove(i);
				continue;
			}
			i++;
		}
		System.out.println(list.size());
		
		i = 0;
		while (i < list.size()) {
			if(list.get(i) % 2 != 0) {
				list.remove(i);
				continue;
			}
			i++;
		}
		System.out.println(list.size());
		
		// 리스트를 활용해 짝수 리스트와 홀수 리스트를 만들어 처리하기
		ArrayList<Integer> origin = new ArrayList<>();
		
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();
		
		for (i = 0; i < 100; i++) {
			origin.add((int)(Math.random() * 1000) + 1000);
		}
		
		int len = origin.size();
		
		for (i = 0; i < len; i++) {
			int value;
			switch((value = origin.get(i)) % 2) {
			case 0:
				evenList.add(value);
				break;
			case 1:
				oddList.add(value);
				break;
			}
		}
		
		System.out.println(evenList);
		System.out.println(oddList);
		
		
	}
}
