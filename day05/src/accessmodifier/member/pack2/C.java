package accessmodifier.member.pack2;
import accessmodifier.member.pack1.A;

public class C {

	public C() {
		
		A a = new A();
		
		a.a = 1; // public 접근 가능
		// a.b = 2; // default or package friendly: 같은 패키지 내에서만 가능
	    // a.c = 3; // private은 접근 불가능 -> The field A.c is not visible 오류 발생
		
		a.method1(); // public 접근 가능
		// a.method2(); // default or package friendly: 같은 패키지 내에서만 가능
		// a.method3(); // private은 접근 불가능 -> The method method3() from the type A is not visible 오류 발생
	}
}
