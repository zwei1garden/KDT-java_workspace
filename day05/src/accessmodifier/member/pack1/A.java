package accessmodifier.member.pack1;

public class A {

	// 멤버변수 선언
	public int a;
	int b; // default or package friendly
	private int c;
	
	// 메서드 선언
	public void method1() {
		
	}
	void method2() {
		
	}
	private void method3() {
		
	}
	
	// 생성자
	public A() {
		a = 1;
		b = 1;
		c = 1;
		
		method1();
		method2();
		method3();
	}
}
