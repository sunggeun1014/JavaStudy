
public class B13_Arrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] arr3 = new int[8];
		int[] arr4 = new int[] { 10, 11, 12, 13 };

		int[][] arr5 = { 
				{ 1, 2, 3, 4, 5 }, 
				{ 3, 3, 3, 3 }, 
				{ 4, 4, 4, 4, 4 }, 
				arr1, 
				arr2, 
				arr3, 
				arr4 
		};
		
		System.out.println(arr1[3]);
		
		int[] javaClass = {30, 44, 70, 99, 80};
		int[] pythonClass = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int[][] school = {javaClass, pythonClass};
		
		System.out.println(school[0][0]);
		
		school[0][0] = -5;
		
		System.out.println(javaClass[0]);
		
		char[][] negativeMessages = {
				{'H', 'e', 'l', 'l'},
				{'G', 'u', 'i', 'l', 't', 'y'},
				{'D', 'i', 's', 'a', 's', 't', 'e', 'r'},
				{'S', 't', 'u', 'p', 'i', 'd'}
		};
		
		char[][] positiveMessages = {
				{'F', 'r', 'i', 'e', 'n', 'd', 'h', 'i', 'p'},
				{'H', 'a', 'p', 'p', 'y'},
				{'p', 'e', 'r', 'f', 'e', 'c', 't'},
				{'n', 'i', 'c', 'e'},
				{'g', 'o', 'o', 'd'}
		};
		
		char[][][] messages = {negativeMessages, positiveMessages};
		
		
		System.out.println("----------------");
		for (int i = 0; i < negativeMessages.length; i++) {
			for (int j = 0; j < negativeMessages[i].length; j++) {
				System.out.printf("[%d][%d]: %c\n", i, j, negativeMessages[i][j]);
			}
			System.out.println("--------");
		}
		
		for (int i = 0; i < messages.length; i++) {
			for (int j = 0; j < messages[i].length; j++) {
				for (int k = 0; k < messages[i][j].length; k++) {
					System.out.print(messages[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
