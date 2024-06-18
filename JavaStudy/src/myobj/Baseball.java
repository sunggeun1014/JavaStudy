package myobj;

public class Baseball {

	public static final int[] answer = new int[4];
	public static final String[] kind  = {"strike", "ball"};
	public static int life = 9; 
	
	public Baseball() {
		int index = 0;
		
		while(index != answer.length) {
			boolean check = true;
			int num = (int) (Math.random() * 100 + 1);
			
			for (int j = 0; j < answer.length; j++) {
				if(answer[j] == num) {
					check = false;
					break;
				}
			}
			
			if(check) {
				answer[index] = num;
				index++;
			}
			
		}
	}

	
}
