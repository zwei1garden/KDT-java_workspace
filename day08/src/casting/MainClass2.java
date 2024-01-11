package casting;

public class MainClass2 {

	public static void main(String[] args) {
		
		// Parent 타입에는 Child1, Child2모두 대입 가능 
		Parent p1 = new Child(); // Child()를 Child2로 바꿔도 가능 -> 해당 부분만 고쳐도 되는 것이 장점. 
		p1.method2();
		// p1.method3(); Child에만 있는 메서드이기에 p로는 접근 불가능. 
		/*
		 * Parent 타입으로는 Child1의 method2도, Child2의 method2도 호출 가능.
		 * => method2는 Parent에도 정의되어 있으나, Child와 Child2에도 오버라이딩된 메서드이기에 호출 가능
		 * */
		
		/*
		 * 다형성 적용이 안 됐을 경우
		 * Child c1 = new Child();
		 * c1.method2();
		 * 
		 * Child2 c2 = new Child2();
		 * c2.method2();
		 * 이와 같이 수정해야 새롭게 작성 혹은 수정해야 하는 부분이 많아짐. 
		 * */

	}

}
