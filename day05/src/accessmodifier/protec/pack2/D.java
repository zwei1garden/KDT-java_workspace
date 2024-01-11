package accessmodifier.protec.pack2;
import accessmodifier.protec.pack1.A;
import super_.SupersonicAirplane;

public class D extends A{
	
	public D() {
		// A a = new A();
		// a.s = "h1";
		// a.method();
		
		// protected는 패키지가 다를 경우 두 클래스 사이에 상속관계가  있다면
		// super 키워드를 이용해 부모쪽 참조를 허용한다. 
		
		super(); // 단 super는 첫 줄에 위치해야 함.
		super.s = "hi";
		super.method();
		
	}

}
