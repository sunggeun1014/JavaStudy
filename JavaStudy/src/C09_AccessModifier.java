
public class C09_AccessModifier extends myobj.C09_AccessModifierTest {
	
	public C09_AccessModifier() {
		int num;
		
		num = super.a1;
		num = super.a2;
		
		super.method1();
		super.method2();
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args? " + args[i]);
		}
		C09_AccessModifierTest test1 = new C09_AccessModifierTest();
		
		int num;
		
		num = test1.a1;
		num = test1.a2;
		num = test1.a3;
		
		test1.method1();
		test1.method2();
		test1.method3();
		
		myobj.C09_AccessModifierTest test2 = new myobj.C09_AccessModifierTest();
		
		num = test2.a1;
		
		test2.method1();
		
	}
}
