package quiz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E02_CorrectNumber {
	
	static class NumberMachine {
		ArrayList<Integer> numbers = new ArrayList<>(4);
		
		public int put(int num) throws ExistNumberException, InvalidNumberException {
			int size = numbers.size();

			if(size == 4) {
				System.out.println("[System] 이미 꽉 찼습니다.");
				return size;
			}
			
			if(num > 9 || num < 0) {
				throw new InvalidNumberException("올바르지 않은 숫자: " + num);
			}
			
			if(numbers.contains(num)) {
				throw new ExistNumberException("중복된 숫자: " + num);
			}
			
			numbers.add(num);
			
			return numbers.size();
		}
	}
	
	static class GuessMachine {
		Scanner sc = new Scanner(System.in);
		
		NumberMachine m = new NumberMachine();
		
		public GuessMachine() {
			while(true) {
				try {
					int size = m.put((int)(Math.random() * 20));
					
					if(size == 4) {
						break;
					}
				} catch (InvalidNumberException e) {
					System.out.println(e.getMessage());
				} catch (ExistNumberException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		int cur = 0;
		private void guess(int num) throws Exception {
			if(cur >= 4) {
				System.out.println("이미 모든 정답을 맞춘 상태입니다.");
				return;
			}
			
			ArrayList<Integer> n = m.numbers;
			
			if(num == n.get(cur)) {
				System.out.println("정답입니다!");
				++cur;
			} else {
				throw new Exception("오답!");
			}
		}
		
		public void start() {
			int num;
			while(true) {
				
				while(true) {
					try {
						System.out.print("> ");
						num = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자만 입력해주세요...");
						sc.nextLine();
					}
				}
				try {
					guess(num);
					if(cur == 4) {
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
	static class InvalidNumberException extends Exception {
		public InvalidNumberException(String message) {
			super(message);
		}
	}

	static class ExistNumberException extends Exception {
		public ExistNumberException(String message) {
			super(message);
		}
	}
	public static void main(String[] args) {
		new GuessMachine().start();
		
	}
}
