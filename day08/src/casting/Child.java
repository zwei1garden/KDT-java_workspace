package casting;

public class Child extends Parent{

	@Override // @Override작성하는 이유 항상 생각하기! 유지보수 차원이었나;;
	public void method2() {
		System.out.println("자식측에서 재정의한 2번 메서드!");
	}
	
	public void method3() {
		System.out.println("자식만 갖고 있는 3번 메서드!");
	}
}
