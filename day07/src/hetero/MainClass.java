package hetero;

public class MainClass {

	public static void main(String[] args) {
		
		// 기본형 자료형으로 만든 배열 예시: 다른 자료형을 넣을 수 없음. 
		// int[] iArr = {1,2,3,4,5, "이정원"}; // 해당 배열에 "이정원"이라는 원소를 넣으면 안 들어감. 
		
		// A자료형의 힙 주소를 배열로 저장 가능한 배열 생성
		A[] aArr = new A[2];
		
		A a1 = new A();
		A a2 = new A();
		
		aArr[0] = a1;
		aArr[1] = a2;
		
		// 이중모음 사용
		// 모든 클래스이 부모 클래스인 Object 배열을 선언하면
		// 다형성 원리(부모 객체를 요구하는 자리에 자식 타입을 대입 가능)에 의해 모든 자료를 다 대입할 수 있음. 
		Object[] oArr = new Object[3];
		// aArr[1] = b1; A타입을 요구하는 배열에 B타입 대입 불가
		
		B b1 = new B();
		oArr[0] = b1;
		oArr[1] = a2;
		oArr[2] = 100; // 심지어 Object 배열에는 기본형 자료도 대입가능.
		
	}

}
