package accessmodifier.member.pack1;

public class B {

	// 생성자 내부에 코드 작성
	public B() {
		A a = new A();
		
		a.a = 1; // public 접근 가능
		a.b = 2; // 같은 패키지 내에 있는 요소에 대해 default 접근 가능
		// a.c = 3; // private은 접근 불가능 -> The field A.c is not visible 오류 발생
		
		a.method1(); // public 접근 가능
		a.method2(); // 같은 패키지 내에 있는 요소에 대해 default 접근 가능
		// a.method3(); // private은 접근 불가능 -> The method method3() from the type A is not visible 오류 발생
	}
}
