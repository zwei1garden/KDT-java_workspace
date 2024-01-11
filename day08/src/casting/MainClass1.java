package casting;

public class MainClass1 {

	public static void main(String[] args) {
		
		// Promotion이 적용되는 자식 클래스에만 적용된 요소 조회 불가능.
		Parent p = new Child(); // Child 내부 객체는 두 개임 1. 상속받은 Parent 2. Child
		p.method1(); // Parent에만 정의된 메서드
		p.method2(); // 오버라이딩된 메서드는 타입 상관없이 인스턴스 내 자식쪽 호출 가능 -> 자식 측에서 오버라이딩이 되었기에 자식측에 있는 메서드가 호출됨. 
		// p.method3(); // p타입 변수로는 자식쪽에서만 정의된 요소는 호출 불가능
		System.out.println("===============================");
		
		Child c = (Child) p; // 부모타입의 변수를 자식타입으로 강제형변환(cast)
		c.method2();
		c.method3(); // 형 변환 후에는 자식쪽에만 있는 요소도 호출 가능.
		
		Child cc = new Child();
		cc.method3();
		

	}

}
