

public class B06_Operator3 {

	public static void main(String[] args) {

		int a = 10;

		System.out.println(a);
		a = 5;
		System.out.println(a);
		a = a + 3;
		System.out.println(a);
		a += 2;
		System.out.println(a);

		a = 30;

		a += 3;
		System.out.println(a);
		a -= 15;
		System.out.println(a);
		a *= 3;
		System.out.println(a);
		// a = a / 7.0;
		a /= 10.0;
		System.out.println(a);
		a %= 2;
		System.out.println(a);

		System.out.println(a = 22);
		System.out.println(a + 3);
		System.out.println(a);

		boolean everyoneAgreed = true;

		everyoneAgreed &= true;
		everyoneAgreed &= true;
		everyoneAgreed &= false;
		everyoneAgreed &= true;
		everyoneAgreed &= true;

		System.out.println("모두가 동의했나요? " + everyoneAgreed);

		a = 15;

		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		a--;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		a = 10;
		System.out.println(++a);
		System.out.println(a);
		
	}
}
