package accessmodifier.class_.pack1;

public class B {

	// 클래스 A의 접근제한자가 default이기 때문에 같은 패키지 내부인 B애서 A를 선언할 수 있음.
	
	A a1 = new A();
	A a2 = new A(2002);
	// A a3 = new A("garden");
	
	public B() {}
}
